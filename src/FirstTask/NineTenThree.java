package FirstTask;// Дан некоторый одномерный массив: Дана переменная: byte n = 3; Превратите этот массив в двухмерный, по n элементов в подмассиве.

import java.util.Scanner;

public class NineTenThree {
    public static void main(String[] args) {
        // Создаем объект Scanner для чтения ввода пользователя
        Scanner scanner = new Scanner(System.in);
        // Создаем массив и заполняем его
        int[] array = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12};
        // Вводим число n для разделения массива
        System.out.print("Введите число n для разделения массива: ");
        int n = scanner.nextInt();
        // Проверяем, что n не превышает размер массива
        if (n > array.length) {
            System.out.println("Число n больше размера массива.");
            return;
        }
        // Вычисляем размер двумерного массива
        int numRows = array.length / n + (array.length % n == 0 ? 0 : 1);
        // Создаем двумерный массив
        int[][] twoDArray = new int[numRows][n];
        // Заполняем двумерный массив элементами из одномерного массива
        int currentIndex = 0;
        for (int i = 0; i < numRows; i++) {
            for (int j = 0; j < n; j++) {
                if (currentIndex < array.length) {
                    twoDArray[i][j] = array[currentIndex];
                    currentIndex++;
                } else {
                    break;
                }
            }
        }
        // Выводим двумерный массив
        System.out.println("Двумерный массив:");
        for (int i = 0; i < numRows; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(twoDArray[i][j] + " ");
            }
            System.out.println();
        }
    }
}