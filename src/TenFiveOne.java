// Дано число. Выведите на экран процесс разложения числа на простые множители, как в школе.

import java.util.Scanner;

public class TenFiveOne {
    public static void main(String[] args) {

        // Ввод числа с клавиатуры
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите число: ");
        int number = scanner.nextInt();
        scanner.close();

        // Проверка делимости на простые числа от 2 до корня из number
        for(int i = 2; i <= Math.sqrt(number); i++) {
            while(number % i == 0) {
                System.out.print(i + " ");
                number = number / i;
            }
        }

        // Если остался не разложенный множитель больше корня из number, то он тоже простой
        if(number > 1) {
            System.out.print(number);
        }
    }
}
