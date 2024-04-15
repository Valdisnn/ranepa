/* Дана строка, содержащая две дроби и математическую операцию между ними:
'2/3 + 3/4', Напишите код, который вычислит результат записанной математической операции. */
import java.util.Scanner;

public class NineSevenThree {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        // Сначала определяем строку с математическим выражением
        System.out.print("Введите операцию, например '2/3 + 3/4': ");
        String expression = scanner.nextLine();

        // Разбиваем строку на числитель и знаменатель первой дроби
        String[] fraction1 = expression.split(" ")[0].split("/");
        int numerator1 = Integer.parseInt(fraction1[0]);
        int denominator1 = Integer.parseInt(fraction1[1]);

        // Разбиваем строку на числитель и знаменатель второй дроби
        String[] fraction2 = expression.split(" ")[2].split("/");
        int numerator2 = Integer.parseInt(fraction2[0]);
        int denominator2 = Integer.parseInt(fraction2[1]);

        // Определяем математическую операцию
        char operator = expression.charAt(expression.indexOf(" ") + 1);

        // Вычисляем результат в зависимости от операции
        double result = 0;
        switch (operator) {
            case '+':
                result = (double) (numerator1 * denominator2 + numerator2 * denominator1) / (denominator1 * denominator2);
                break;
            case '-':
                result = (double) (numerator1 * denominator2 - numerator2 * denominator1) / (denominator1 * denominator2);
                break;
            case '*':
                result = (double) (numerator1 * numerator2) / (denominator1 * denominator2);
                break;
            case '/':
                result = (double) (numerator1 * denominator2) / (denominator1 * numerator2);
                break;
        }

        // Выводим результат
        System.out.println("Результат: " + result);
    }
}