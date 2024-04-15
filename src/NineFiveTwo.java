import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;

public class NineFiveTwo {

    public static void main(String[] args) {
        // Создаем форматтер для преобразования даты в строку
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd.MM.yyyy");

        // Создаем список, в который будем сохранять даты с 4-мя двойками
        List<String> datesWithFourTwos = new ArrayList<>();

        // Получаем текущую дату
        LocalDate currentDate = LocalDate.now();

        // Получаем начальную дату текущего столетия
        LocalDate startDate = currentDate.withYear((currentDate.getYear() / 100) * 100);

        // Получаем конечную дату текущего столетия
        LocalDate endDate = startDate.plusYears(100);

        // Перебираем все даты в текущем столетии и проверяем, содержит ли дата 4 двойки
        for (LocalDate date = startDate; date.isBefore(endDate); date = date.plusDays(1)) {
            String dateString = date.format(formatter);
            long count = dateString.chars().filter(ch -> ch == '2').count();
            if (count == 4) {
                datesWithFourTwos.add(dateString);
            }
        }

        // Выводим список дат с 4-мя двойками
        System.out.println("Все даты с 4-мя двойками в текущем столетии:");
        for (String date : datesWithFourTwos) {
            System.out.println(date);
        }
    }
}