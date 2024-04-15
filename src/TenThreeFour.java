// Выведите в консоль все пары дружественных чисел из заданного промежутка.

import java.util.*;

public class TenThreeFour {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("ВНИМАНИЕ: программа может долго делать подбор"); //
        System.out.println("Но это не значит что она зависла или забила память"); //
        System.out.println("Тесты показывают нормальную нагрузку даже при 10000 вариантах \n"); //

        System.out.print("Введите начало промежутка: ");
        int start = scanner.nextInt();
        System.out.print("Введите конец промежутка: ");
        int end = scanner.nextInt();
        System.out.println("Пары дружественных чисел:");
        findFriendlyNumbers(start, end);
    }

    // Метод для проверки, являются ли два числа дружественными
    public static boolean areFriendly(int num1, int num2) {
        int sum1 = 0, sum2 = 0;
        for (int i = 1; i <= num1 / 2; i++) {
            if (num1 % i == 0) {
                sum1 += i;
            }
        }
        for (int i = 1; i <= num2 / 2; i++) {
            if (num2 % i == 0) {
                sum2 += i;
            }
        }
        return (sum1 == num2) && (sum2 == num1);
    }

    // Метод для поиска и вывода всех пар дружественных чисел
    public static void findFriendlyNumbers(int start, int end) {
        for (int i = start; i <= end; i++) {
            for (int j = i + 1; j <= end; j++) {
                if (areFriendly(i, j)) {
                    System.out.println(i + " и " + j);
                }
            }
        }
    }
}
