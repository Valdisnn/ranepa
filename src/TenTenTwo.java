// Даны два числа. Выведите в консоль процесс умножения этих чисел в столбик, как в школе.

import java.util.Scanner;

public class TenTenTwo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Ввод первого числа
        System.out.print("Введите первое число: ");
        int num1 = scanner.nextInt();

        // Ввод второго числа
        System.out.print("Введите второе число: ");
        int num2 = scanner.nextInt();

        // Вычисление процесса умножения
        int result = num1 * num2;

        // Вывод процесса умножения в столбик
        System.out.println("Процесс умножения в столбик:");
        System.out.println("-----------");

        String strNum1 = String.valueOf(num1);
        String strNum2 = String.valueOf(num2);
        int maxLength = Math.max(strNum1.length(), strNum2.length());

        System.out.printf("%" + maxLength + "d\n", num1);
        System.out.printf("x %" + maxLength + "d\n", num2);
        System.out.println("-----------");

        while (num2 != 0) {
            int digit = num2 % 10;
            int partialResult = num1 * digit;
            System.out.printf("%" + maxLength + "d\n", partialResult);

            num2 /= 10;
        }
        System.out.println("-----------");
        System.out.printf("%" + maxLength + "d\n", result);
    }
}
