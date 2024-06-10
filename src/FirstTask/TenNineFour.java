package FirstTask;// Дан произвольный двухмерный массив: Переставьте местами два заданных столбца:

import java.util.Scanner;

public class TenNineFour {
    public static void main(String[] args) {
        // Исходный двухмерный массив
        int[][] matrix = {
                {11, 12, 13, 14, 15},
                {21, 22, 23, 24, 25},
                {31, 32, 33, 34, 35},
                {41, 42, 43, 44, 45},
                {51, 52, 53, 54, 55}
        };

        // Получение от пользователя индексов столбцов для перестановки
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите индекс первого столбца: ");
        int column1 = scanner.nextInt();
        System.out.print("Введите индекс второго столбца: ");
        int column2 = scanner.nextInt();

        // Проверка валидности индексов столбцов
        if (column1 < 0 || column1 >= matrix[0].length || column2 < 0 || column2 >= matrix[0].length) {
            System.out.println("Некорректные индексы столбцов");
            return;
        }
        // Перестановка столбцов
        for (int i = 0; i < matrix.length; i++) {
            int temp = matrix[i][column1];
            matrix[i][column1] = matrix[i][column2];
            matrix[i][column2] = temp;
        }

        // Вывод переставленного массива
        System.out.println("Результат перестановки столбцов:");
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                System.out.print(matrix[i][j] + "\t");
            }
            System.out.println();
        }}}