package FirstTask;// Спросите у пользователя два целых числа. Создайте двухмерный массив,
// размер которого будет взят из введенных пользователем чисел.
// Заполните массив случайными целыми числами.

import java.util.Random;
import java.util.Scanner;

public class NineThreeOne {
    public static void main(String[] args) {
        // Запрашиваем у пользователя два целых числа
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите первое целое число: ");
        int number1 = scanner.nextInt();
        System.out.print("Введите второе целое число: ");
        int number2 = scanner.nextInt();

        // Создаем двумерный массив с размерами, введенными пользователем
        int[][] array = new int[number1][number2];

        // Заполняем массив случайными целыми числами
        Random random = new Random();
        for (int i = 0; i < number1; i++) {
            for (int j = 0; j < number2; j++) {
                array[i][j] = random.nextInt();
            }
        }

        // Выводим массив на экран
        for (int i = 0; i < number1; i++) {
            for (int j = 0; j < number2; j++) {
                System.out.print(array[i][j] + " ");
            }
            System.out.println();
        }
    }
}