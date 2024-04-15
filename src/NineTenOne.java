// Спросите у пользователя два числа. Проверьте, являются ли эти числа дружественными или нет.

import java.util.Scanner;

public class NineTenOne {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Запрос ввода двух чисел у пользователя
        System.out.print("Введите первое число: ");
        int number1 = scanner.nextInt();
        System.out.print("Введите второе число: ");
        int number2 = scanner.nextInt();

        // Проверка являются ли числа дружественными или нет
        if (areFriendlyNumbers(number1, number2)) {
            System.out.println(number1 + " и " + number2 + " являются дружественными числами.");
        } else {
            System.out.println(number1 + " и " + number2 + " не являются дружественными числами.");
        }

        scanner.close();
    }

    // Метод для определения являются ли два числа дружественными
    public static boolean areFriendlyNumbers(int number1, int number2) {
        // Подсчет суммы делителей первого числа
        int sumOfDivisors1 = calculateSumOfDivisors(number1);
        // Подсчет суммы делителей второго числа
        int sumOfDivisors2 = calculateSumOfDivisors(number2);

        // Проверка условия дружественных чисел
        if (sumOfDivisors1 == number2 && sumOfDivisors2 == number1) {
            return true;
        } else {
            return false;
        }
    }

    // Метод для подсчета суммы делителей числа
    public static int calculateSumOfDivisors(int number) {
        int sum = 0;

        // Перебор всех возможных делителей числа
        for (int i = 1; i <= number / 2; i++) {
            if (number % i == 0) {
                sum += i;
            }
        }

        return sum;
    }
}