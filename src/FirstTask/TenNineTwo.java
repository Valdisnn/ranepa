package FirstTask;/* Напишите код, который будет генерировать пароль заданного размера. \
Пароль обязательно должен будет содержать маленькую и большую буквы,
цифру и какой-то специальный символ. */

import java.util.Random;
import java.util.Scanner;

public class TenNineTwo {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите размер пароля: ");
        int length = scanner.nextInt();
        String password = generatePassword(length);
        System.out.println(password);
    }

    public static String generatePassword(int length) {
        StringBuilder password = new StringBuilder();
        Random random = new Random();

        // Генерируем маленькую и большую букву
        char lowercaseLetter = (char) (random.nextInt(26) + 'a');
        char uppercaseLetter = (char) (random.nextInt(26) + 'A');

        password.append(lowercaseLetter);
        password.append(uppercaseLetter);

        // Генерируем цифру
        int digit = random.nextInt(10);
        password.append(digit);

        // Генерируем специальный символ
        char specialChar = generateSpecialChar();
        password.append(specialChar);

        // Генерируем остальные символы
        int remainingLength = length - 4;
        for (int i = 0; i < remainingLength; i++) {
            char character = generateRandomChar();
            password.append(character);
        }

        // Перемешиваем символы в пароле
        for (int i = 0; i < password.length() - 1; i++) {
            int j = random.nextInt(password.length() - i) + i;
            char temp = password.charAt(i);
            password.setCharAt(i, password.charAt(j));
            password.setCharAt(j, temp);
        }

        return password.toString();
    }

    private static char generateSpecialChar() {
        Random random = new Random();
        int index = random.nextInt(specialChars.length());
        return specialChars.charAt(index);
    }

    private static char generateRandomChar() {
        Random random = new Random();
        int index = random.nextInt(chars.length());
        return chars.charAt(index);
    }

    private static final String chars = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ";
    private static final String specialChars = "!@#$%^&*()_+-={}[]|:;<>,.?/~";
}
