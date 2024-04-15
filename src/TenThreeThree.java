// Сделайте метод, который параметром будет принимать английское существительное в единственном числе и возвращать его во множественном числе.

import java.util.Scanner;

public class TenThreeThree {
    public static String toPlural(String noun) {
        // Проверяем, является ли переданное существительное несчётным
        if (noun.endsWith("s") || noun.endsWith("sh") || noun.endsWith("ch") || noun.endsWith("x") || noun.endsWith("z")) {
            return noun + "es"; // Добавляем окончание "es"
        } else if (noun.endsWith("y")) {
            // Проверяем, если перед окончанием "y" находится согласный звук
            if (noun.charAt(noun.length() - 2) == 'a' || noun.charAt(noun.length() - 2) == 'e' ||
                    noun.charAt(noun.length() - 2) == 'i' || noun.charAt(noun.length() - 2) == 'o' ||
                    noun.charAt(noun.length() - 2) == 'u') {
                return noun + "s"; // Добавляем окончание "s"
            } else {
                StringBuilder sb = new StringBuilder(noun);
                sb.setCharAt(noun.length() - 1, 's'); // Заменяем "y" на "s"
                return sb.toString();
            }
        } else {
            return noun + "s"; // Добавляем окончание "s"
        }
    }

    // Пример использования метода
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.print("Введите слово на английском в единственном числе: ");
        // Ввод буквы пользователем
        String singularNoun = reader.next();
        String pluralNoun = toPlural(singularNoun); // Вызываем метод с передачей в него единственного числа
        System.out.println(pluralNoun); // Выводим результат: dogs
    }
}
