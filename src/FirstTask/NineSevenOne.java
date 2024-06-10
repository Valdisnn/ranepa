package FirstTask;// Дано слово. Перемешайте буквы этого слова в случайном порядке.
import java.util.Random;
import java.util.Scanner;

public class NineSevenOne {
    public static String shuffleWord(String word) {
        // Преобразуем строку в массив символов
        char[] charArray = word.toCharArray();
        // Используем генератор случайных чисел для перемешивания букв
        Random random = new Random();
        for (int i = charArray.length - 1; i > 0; i--) {
            int index = random.nextInt(i + 1);
            // Меняем местами текущий символ с символом на случайной позиции
            char temp = charArray[index];
            charArray[index] = charArray[i];
            charArray[i] = temp;
        }
        // Преобразуем массив символов обратно в строку и возвращаем результат
        return new String(charArray);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // Пример использования
        System.out.print("Введите слово: ");
        String word = scanner.nextLine();

        String shuffledWord = shuffleWord(word);
        System.out.println("Перемешанное слово: " + shuffledWord);
    }
}