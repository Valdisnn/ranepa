// Даны два числа. Выведите на экран процесс нахождения НОД, как в школе.

import java.util.Scanner;
public class TenTwoOne {
    public static void main(String[] args) {
        // Создаем объект класса Scanner для чтения пользовательского ввода
        Scanner scanner = new Scanner(System.in);

        // Считываем первое число
        System.out.print("Введите первое число: ");
        int num1 = scanner.nextInt();

        // Считываем второе число
        System.out.print("Введите второе число: ");
        int num2 = scanner.nextInt();

        // Вызываем метод для нахождения НОД и выводим результат
        System.out.println("Наибольший общий делитель: " + findGCD(num1, num2));
    }

    // Метод для нахождения наибольшего общего делителя (реализация алгоритма Евклида)
    public static int findGCD(int num1, int num2) {
        // Используем цикл, пока num2 не станет равным 0
        while (num2 != 0) {
            int temp = num2;
            num2 = num1 % num2;
            num1 = temp;
        }
        return num1; // num1 содержит наибольший общий делитель
    }
}
