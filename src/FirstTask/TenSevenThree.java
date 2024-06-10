package FirstTask;// Дан произвольный двухмерный массив: Напишите код, который получит массив значений заданного столбца:
import java.util.Scanner;

public class TenSevenThree {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        // Создаем двухмерный массив
        int[][] array = {
                {11, 12, 13, 14, 15},
                {21, 22, 23, 24, 25},
                {31, 32, 33, 34, 35},
                {41, 42, 43, 44, 45},
                {51, 52, 53, 54, 55},
        };
        // Выбираем индекс столбца, значения которого хотим получить
        System.out.print("Введите номер столбца: ");
        int columnIndex = scanner.nextInt();
        // Создаем новый массив для хранения значений из заданного столбца
        int[] columnValues = new int[array.length];
        // Используем цикл для прохода по каждой строке массива
        for (int i = 0; i < array.length; i++) {
            // Получаем значение из заданного столбца текущей строки массива
            columnValues[i] = array[i][columnIndex];
        }
        // Выводим значения заданного столбца на экран
        for (int value : columnValues) {
            System.out.println(value);
        }
    }
}
