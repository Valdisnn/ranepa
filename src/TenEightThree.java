// Дан произвольный двухмерный массив: Переставьте местами два заданных ряда:

import java.util.Scanner;

public class TenEightThree {
    public static void main(String[] args) {
        int[][] array = {
                {11, 12, 13, 14, 15},
                {21, 22, 23, 24, 25},
                {31, 32, 33, 34, 35},
                {41, 42, 43, 44, 45},
                {51, 52, 53, 54, 55}
        };

        // Ввод пользователем индексов рядов для перестановки
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите индекс первого ряда (от 0 до 4): ");
        int row1 = scanner.nextInt();

        System.out.print("Введите индекс второго ряда (от 0 до 4): ");
        int row2 = scanner.nextInt();

        // Проверка введенных индексов
        if (row1 < 0 || row1 >= array.length || row2 < 0 || row2 >= array.length) {
            System.out.println("Введены некорректные индексы рядов. Пожалуйста, попробуйте еще раз.");
            return;
        }

        // Перестановка рядов в массиве
        int[] temp = array[row1];
        array[row1] = array[row2];
        array[row2] = temp;

        // Вывод результата
        System.out.println("Результат:");
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                System.out.print(array[i][j] + " ");
            }
            System.out.println();
        }
    }
}
