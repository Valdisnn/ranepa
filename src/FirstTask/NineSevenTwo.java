package FirstTask;// Спросите у пользователя число. Получите все возможные варианты разложения этого числа на два множителя.

import java.util.Scanner;

public class NineSevenTwo {
    public static void main(String[] args) {
        // Создаем объект класса Scanner для ввода числа пользователем
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите число: ");
        int num = scanner.nextInt();

        // Выводим все возможные варианты разложения числа на два множителя
        System.out.println("Варианты разложения числа " + num + " на два множителя:");

        for (int i = 1; i <= num / 2; i++) {
            if (num % i == 0) {
                System.out.println(i + " x " + (num / i));
            }
        }
    }
}