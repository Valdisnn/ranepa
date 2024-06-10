package FirstTask;// Определите, сколько пятниц 13-е в текущем году.

import java.time.DayOfWeek;
import java.time.LocalDate;

public class NineFiveThree {

    public static void main(String[] args) {
        // Получаем текущую дату
        LocalDate currentDate = LocalDate.now();

        // Создаем переменную для подсчета количества пятниц 13-е
        int fridayTheThirteenthCount = 0;

        // Устанавливаем год, для которого будем проверять пятницы 13-е
        int yearToCheck = 2024;

        // Создаем объект LocalDate для первого дня года
        LocalDate firstDayOfYear = LocalDate.of(yearToCheck, 1, 1);

        // Перебираем все дни года
        for (LocalDate date = firstDayOfYear; date.isBefore(firstDayOfYear.plusYears(1)); date = date.plusDays(1)) {
            // Проверяем, является ли дата пятницей
            if (date.getDayOfWeek() == DayOfWeek.FRIDAY && date.getDayOfMonth() == 13) {
                fridayTheThirteenthCount++;
            }
        }

        System.out.println("Количество пятниц 13 в " + yearToCheck + ": " + fridayTheThirteenthCount);
    }

}