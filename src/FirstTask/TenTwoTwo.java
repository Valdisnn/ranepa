package FirstTask;// Два числа делятся друг на друга, в результате получается периодическая дробь. Напишите код, который определит период этой дроби.

import java.util.Scanner;

public class TenTwoTwo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите целое число: ");
        int number = scanner.nextInt();

        System.out.print("Разложение числа на простые множители: ");
        primeFactorization(number);
    }
    // Метод для разложения числа на простые множители
    public static void primeFactorization(int number) {
        // Перебираем все числа от 2 до корня из number
        for (int i = 2; i <= Math.sqrt(number); i++) {
            // Если i является делителем number, выводим его и делим number на i
            while (number % i == 0) {
                System.out.print(i + " ");
                number = number / i;
            }
        }
        // Если после перебора чисел number все еще не равен 1, остался только один простой делитель - сам number
        if (number != 1) {
            System.out.print(number);
        }
    }
}
