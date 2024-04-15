/* Дана строка, содержащая два числа и математическую операцию между ними:
'10 + 20', Напишите код, который вычислит результат записанной математической операции. */
import java.util.Scanner;

public class NineSixThree {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        // Вводим строку с математическим выражением

        System.out.print("Введите математическую операцию: ");
        String expression = scanner.nextLine();

//        String expression = "5 + 3";

        // Разделяем строку на числа и операцию
        String[] elements = expression.split("\\s+"); // разделение по пробелу

        // Получаем первое число
        double operand1 = Double.parseDouble(elements[0]);

        // Получаем второе число
        double operand2 = Double.parseDouble(elements[2]);

        // Получаем операцию
        String operation = elements[1];

        // Выполняем математическую операцию и выводим результат
        double result;
        switch (operation) {
            case "+":
                result = operand1 + operand2;
                break;
            case "-":
                result = operand1 - operand2;
                break;
            case "*":
                result = operand1 * operand2;
                break;
            case "/":
                result = operand1 / operand2;
                break;
            default:
                throw new IllegalArgumentException("Некорректная операция");
        }
        System.out.println(result);
    }
}