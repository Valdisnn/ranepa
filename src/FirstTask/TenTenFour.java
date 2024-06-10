package FirstTask;// Дан произвольный двухмерный массив: Напишите код, который будет обнулять заданный столбец:

import java.util.Scanner;

public class TenTenFour {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Задаем двумерный массив
        int[][] array = {
                {11, 12, 13, 14, 15},
                {21, 22, 23, 24, 25},
                {31, 32, 33, 34, 35},
                {41, 42, 43, 44, 45},
                {51, 52, 53, 54, 55},
        };

        // Вводим номер столбца, который хотим обнулить
        System.out.print("Введите номер столбца для обнуления: ");
        int columnNumber = scanner.nextInt();

        // Итерируемся по строкам массива
        for (int i = 0; i < array.length; i++) {
            // Присваиваем заданному столбцу значение 0
            array[i][columnNumber] = 0;
        }

        // Выводим измененный массив
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                System.out.print(array[i][j] + " ");
            }
            System.out.println();
        }
    }
}
