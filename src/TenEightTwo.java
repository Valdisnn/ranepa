// Реализуйте алгоритм Решето Эратосфена для поиска простых чисел в заданном промежутке.

public class TenEightTwo {

    public static void main(String[] args) {
        int start = 2; // Начало промежутка
        int end = 100; // Конец промежутка

        boolean[] primes = getPrimes(start, end);

        System.out.println("Простые числа в промежутке от " + start + " до " + end + ":");
        for (int i = start; i <= end; i++) {
            if (primes[i]) {
                System.out.print(i + " ");
            }
        }
        System.out.println();
    }

    public static boolean[] getPrimes(int start, int end) {
        boolean[] primes = new boolean[end + 1];
        primes[0] = primes[1] = false;

        // Инициализируем все числа как простые
        for (int i = 2; i <= end; i++) {
            primes[i] = true;
        }

        // Исключаем составные числа
        for (int i = 2; i * i <= end; i++) {
            if (primes[i]) {
                for (int j = i * i; j <= end; j += i) {
                    primes[j] = false;
                }
            }
        }

        return primes;
    }
}
