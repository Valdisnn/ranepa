package FirstTask;/* Дана строка, содержащая в себе любое количество вложенных парных круглых скобок. Напишите код, который проверит, что скобки расположены корректно.
Так корректно:"()()", "(())"
Так некорректно, так как количество открытых скобок не совпадает с количеством закрытых:
"())", "))((" */

// Для решения данной задачи можно использовать стек.
// При проходе по строке проверяем каждый символ.
// Если символ - открывающаяся скобка, добавляем ее в стек.
// Если символ - закрывающаяся скобка, проверяем, что стек не пустой и в его вершине находится соответствующая открывающаяся скобка.
// Если проверка выполняется, удаляем открывающуюся скобку из стека.
// Если проверка не выполняется или стек оказывается пустым, значит скобки расположены некорректно.

import java.util.Scanner;
import java.util.Stack;

public class TenEightFive {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите последовательность скобок: ");
        String str = scanner.next();; // пример строки со скобками
        boolean correct = checkBrackets(str);
        System.out.println("Скобки расположены " + (correct ? "корректно" : "некорректно"));
    }

    private static boolean checkBrackets(String str) {
        Stack<Character> stack = new Stack<>();

        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if (ch == '(') {
                stack.push(ch);
            } else if (ch == ')') {
                if (!stack.empty() && stack.peek() == '(') {
                    stack.pop();
                } else {
                    return false; // скобки расположены некорректно
                }
            }
        }

        return stack.empty(); // если стек пустой, значит скобки расположены корректно
    }
}
