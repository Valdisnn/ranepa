package FirstTask;/* Сделайте метод, который будет принимать число, а возвращать это число прописью.
Пусть функция работает с числами до 999. Смотрите пример:
func(123); // выведет 'сто двадцать три' */

import java.util.Scanner;

public class NineSixTwo {
    // Массив с названиями чисел до 20
    private static final String[] units = {"ноль", "один", "два", "три", "четыре", "пять", "шесть", "семь", "восемь", "девять",
            "десять", "одиннадцать", "двенадцать", "тринадцать", "четырнадцать", "пятнадцать", "шестнадцать", "семнадцать", "восемнадцать", "девятнадцать"};

    // Массив с названиями десятков
    private static final String[] tens = {"", "десять", "двадцать", "тридцать", "сорок", "пятьдесят", "шестьдесят", "семьдесят", "восемьдесят", "девяносто"};

    // Массив с названиями сотен
    private static final String[] hundreds = {"", "сто", "двести", "триста", "четыреста", "пятьсот", "шестьсот", "семьсот", "восемьсот", "девятьсот"};

    // Метод для конвертации числа в пропись
    public static String convertNumberToWords(int number) {
        if (number < 20) {
            // Если число меньше 20, используем массив с названиями чисел до 20
            return units[number];
        }
        if (number < 100) {
            // Если число меньше 100, получаем название десятка и вызываем метод рекурсивно для оставшейся части числа
            return tens[number / 10] + " " + convertNumberToWords(number % 10);
        }
        // Иначе, число больше 100, получаем название сотни и вызываем метод рекурсивно для оставшейся части числа
        return hundreds[number / 100] + " " + convertNumberToWords(number % 100);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите число цифрами: ");
        int number = scanner.nextInt();

        String numberInWords = convertNumberToWords(number);
        System.out.println(numberInWords);
    }
}