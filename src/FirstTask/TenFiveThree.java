package FirstTask;// Сделайте метод, который будет устанавливать правильную форму существительного после числа. Наш метод должен работать для чисел любой длины:

import java.util.Scanner;

public class TenFiveThree {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Ввод числа и существительного
        System.out.println("Введите число:");
        int number = scanner.nextInt();
        System.out.println("Введите существительное в именительном падеже (ед. число):");
        String singular = scanner.next();
        System.out.println("Введите существительное в родительном падеже (мн. число):");
        String plural = scanner.next();
        System.out.println("Введите существительное в родительном падеже (для числа 11-19):");
        String pluralForTeen = scanner.next();

        // Устанавливаем правильную форму существительного после числа
        String result = formNounAfterNumber(number, singular, plural, pluralForTeen);

        // Вывод результата
        System.out.println(number + " " + result);
    }

    public static String formNounAfterNumber(int number, String singular, String plural, String pluralForTeen) {
        if (number % 100 >= 11 && number % 100 <= 19) {
            return pluralForTeen;
        } else {
            int lastDigit = number % 10;
            if (lastDigit == 1) {
                return singular;
            } else if (lastDigit >= 2 && lastDigit <= 4) {
                return plural;
            } else {
                return pluralForTeen;
            }
        }
    }
}
