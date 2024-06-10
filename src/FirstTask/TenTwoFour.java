package FirstTask;// Спросите у пользователя два целых числа. В ответ выведите массив всех простых чисел из промежутка, заданном введенными значениями.

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class TenTwoFour {
    public static void main(String[] args) {
        int start = getUserInput("Введите начало промежутка:");
        int end = getUserInput("Введите конец промежутка:");
        List<Integer> primeNumbers = findPrimeNumbers(start, end);
        System.out.println("Простые числа в заданном промежутке: " + primeNumbers);
    }
    // Метод для получения ввода пользователя
    private static int getUserInput(String message) {
        Scanner scanner = new Scanner(System.in);
        System.out.println(message);
        return scanner.nextInt();
    }
    // Метод для поиска простых чисел
    private static List<Integer> findPrimeNumbers(int start, int end) {
        boolean[] isPrime = new boolean[end + 1];
        List<Integer> primeNumbers = new ArrayList<>();
        // Инициализируем массив как простые числа
        for (int i = 2; i <= end; i++) {
            isPrime[i] = true;
        }
        // Применяем алгоритм "Решето Эратосфена"
        for (int i = 2; i * i <= end; i++) {
            if (isPrime[i]) {
                for (int j = i * i; j <= end; j += i) {
                    isPrime[j] = false;
                }
            }
        }
        // Записываем простые числа в список
        for (int i = Math.max(2, start); i <= end; i++) {
            if (isPrime[i]) {
                primeNumbers.add(i);
            }
        }
        return primeNumbers;
    }
}
