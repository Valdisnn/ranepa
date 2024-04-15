/* Дана строка, содержащая в себе дробь:
"12/16"
Напишите код, который распишет процесс сокращения дроби, как в школе:
"12/16 = 6/8 = 3/4" */

public class TenNineThree {
    public static void main(String[] args) {
        String fraction = "12/16";
        System.out.println("Исходная дробь: " + fraction);

        // Разделение дроби на числитель и знаменатель
        int numerator = Integer.parseInt(fraction.split("/")[0]);
        int denominator = Integer.parseInt(fraction.split("/")[1]);

        // Нахождение наибольшего общего делителя числителя и знаменателя
        int gcd = findGCD(numerator, denominator);

        // Сокращение дроби
        numerator /= gcd;
        denominator /= gcd;

        String simplifiedFraction = numerator + "/" + denominator;
        System.out.println("Сокращенная дробь: " + simplifiedFraction);
    }

    // Метод для нахождения наибольшего общего делителя
    public static int findGCD(int a, int b) {
        if (b == 0) {
            return a;
        } else {
            return findGCD(b, a % b);
        }
    }
}
