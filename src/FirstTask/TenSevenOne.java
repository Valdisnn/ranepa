package FirstTask;// Даны два числа. Выведите на экран процесс деления этих чисел в столбик, как в школе.

import java.util.Scanner;

public class TenSevenOne {
    public static void main(String[] args){

        // Задаем два числа для деления
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите первое число: ");
        int num1 = scanner.nextInt();
        System.out.print("Введите второе число: ");
        int num2 = scanner.nextInt();

        // Процесс деления чисел по школьному алгоритму
        int quotient = num1 / num2;
        int remainder = num1 % num2; // Вычисляем остаток от деления

        // Выводим процесс деления в столбик
        System.out.println(num1 + " | " + num2);
        System.out.println("------");
        System.out.println(quotient + "  | " + remainder);
    }
}
