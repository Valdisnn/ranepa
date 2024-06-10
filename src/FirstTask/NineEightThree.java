package FirstTask;// Дано число. Проверьте, является ли это число совершенным.
import java.util.Scanner;

public class NineEightThree {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите число: ");
        int number = scanner.nextInt();

        if (isPerfectNumber(number)) { // вызываем метод isPerfectNumber и передаем в него введенное число
            System.out.println(number + " является совершенным числом.");
        } else {
            System.out.println(number + " не является совершенным числом.");
        }
    }
    // Метод для проверки числа на совершенность
    public static boolean isPerfectNumber(int number) {
        int sum = 0;

        // Ищем делители числа от 1 до number/2
        for (int i = 1; i <= number / 2; i++) {
            if (number % i == 0) {
                sum += i; // если i является делителем, добавляем его к сумме
            }
        }
        // Число совершенное, если сумма делителей равна самому числу
        return sum == number;
    }
}
