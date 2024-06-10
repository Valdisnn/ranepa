package FirstTask;// Дан произвольный двухмерный массив: Выполните его транспонирование:

import java.util.Scanner;

public class TenTenFive {
    // Создаем функцию для транспонирования двумерного массива
    public static int[][] transposeArray(int[][] array) {
        // Проверяем, является ли массив пустым
        if (array.length == 0 || array[0].length == 0) {
            return array;
        }

        // Определяем размеры исходного массива
        int rows = array.length;
        int cols = array[0].length;

        // Создаем новый массив с транспонированными размерами
        int[][] transposedArray = new int[cols][rows];

        // Заполняем новый массив значениями из исходного массива,
        // меняя местами строки и столбцы
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                transposedArray[j][i] = array[i][j];
            }
        }

        // Возвращаем транспонированный массив
        return transposedArray;
    }

    // Пример использования функции
    public static void main(String[] args) {
        // Исходный массив
        int[][] array = {
                {11, 12, 13, 14, 15},
                {21, 22, 23, 24, 25},
                {31, 32, 33, 34, 35},
                {41, 42, 43, 44, 45},
                {51, 52, 53, 54, 55},
        };

        // Транспонированный массив
        int[][] transposedArray = transposeArray(array);

        // Выводим исходный и транспонированный массивы на экран
        System.out.println("Исходный массив:");
        for (int[] row : array) {
            for (int num : row) {
                System.out.print(num + " ");
            }
            System.out.println();
        }

        System.out.println("\nТранспонированный массив:");
        for (int[] row : transposedArray) {
            for (int num : row) {
                System.out.print(num + " ");
            }
            System.out.println();
        }
    }
}
