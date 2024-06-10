package FirstTask;/* Рассмотрите промежуток от 2000 года до текущего года.
Определите, сколько раз 1 января в этом промежутке попадало на выходной день,
то есть на субботу или на воскресенье. */
import java.time.DayOfWeek;
import java.time.LocalDate;

public class NineNineOne {
    public static void main(String[] args) {
        // Задаем начальную и конечную даты
        int startYear = 2000;
        int endYear = 2024;

        // Инициализируем счетчик для подсчета выходных дней
        int count = 0;
        // Проходим по каждому году в заданном промежутке
        for (int year = startYear; year <= endYear; year++) {
            // Получаем первое января текущего года
            LocalDate date = LocalDate.of(year, 1, 1);

            // Проверяем, является ли первое января субботой или воскресеньем
            if (date.getDayOfWeek() == DayOfWeek.SATURDAY || date.getDayOfWeek() == DayOfWeek.SUNDAY) {
                // Если да, увеличиваем счетчик
                count++;
            }
        }
        // Выводим результат
        System.out.println("Количество раз, когда 1 января выпадало на выходной день: " + count);
    }
}