// Сделайте программу, генерирующую квадратные уравнения с целыми корнями.
import java.util.Random;

public class NineEightOne {
    public static void main(String[] args) {
        Random random = new Random();
        int a, b, c, x1, x2;

        // Генерируем случайные значения a, b и c
        a = random.nextInt(10) + 1; // от 1 до 10
        b = random.nextInt(20) - 10; // от -10 до 10
        c = random.nextInt(200) - 100; // от -100 до 100

        // Проверяем, чтобы уравнение имело два различных целых корня
        while (b * b - 4 * a * c < 0 || (Math.sqrt(b * b - 4 * a * c)) % 1 != 0) {
            a = random.nextInt(10) + 1;
            b = random.nextInt(20) - 10;
            c = random.nextInt(200) - 100;
        }

        // Находим корни уравнения
        x1 = (-b + (int) Math.sqrt(b * b - 4 * a * c)) / (2 * a);
        x2 = (-b - (int) Math.sqrt(b * b - 4 * a * c)) / (2 * a);

        // Выводим уравнение и его корни
        System.out.println("Сгенерированное квадратное уравнение: " + a + "x^2 + " + b + "x + " + c + " = 0");
        System.out.println("Корни уравнения: x1 = " + x1 + ", x2 = " + x2);
    }
}