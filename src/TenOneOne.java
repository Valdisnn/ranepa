// Даны два числа. Выведите на экран процесс нахождения НОК, как в школе.
public class TenOneOne {
    public static void main(String[] args) {
        final double max = 100.; // Максимальное число для диапазона от 0 до max
        final double num1 = rnd(max);
        final double num2 = rnd(max);

        // Находим наименьшее общее кратное (НОК)
        double gcd = findGCD((int) num1, (int) num2);
        double lcm = (num1 * num2) / gcd;

        // Выводим результат
        System.out.println("Наименьшее общее кратное чисел " + Math.ceil(num1) + " и " + Math.ceil(num2) + " равно " + Math.ceil(lcm));
    }

    // Функция для нахождения наибольшего общего делителя (НОД)
    public static int findGCD(int a, int b) {
        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }

    public static double rnd(final double max)
    {
        return Math.random() * max;
    }
}
