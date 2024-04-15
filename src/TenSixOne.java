// Через консоль спросите у пользователя длинное слово. Выведите список слов, которые можно составить из букв введенного слова.

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
public class TenSixOne {
    public static void main(String[] args) {
        // Ввод слова от пользователя
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите слово: ");
        String word = scanner.nextLine();
        // Создание списка для хранения найденных слов
        List<String> foundWords = new ArrayList<>();
        // Преобразование введенного слова в массив символов
        char[] charArray = word.toCharArray();
        // Генерация перестановок символов и проверка каждой из них
        generatePermutations(charArray, 0, foundWords);
        // Вывод найденных слов
        System.out.println("Список слов, которые можно составить из букв введенного слова:");
        for (String foundWord : foundWords) {
            System.out.println(foundWord);
        }
    }
    private static void generatePermutations(char[] charArray, int currentIndex, List<String> foundWords) {
        if (currentIndex == charArray.length - 1) {
            // Если достигнут конец массива символов, добавляем созданное слово в список найденных слов
            foundWords.add(String.valueOf(charArray));
        } else {
            for (int i = currentIndex; i < charArray.length; i++) {
                // Меняем местами символы
                swap(charArray, currentIndex, i);
                // Рекурсивный вызов для генерации перестановок оставшихся символов
                generatePermutations(charArray, currentIndex + 1, foundWords);
                // Возвращаем символы на исходные позиции
                swap(charArray, currentIndex, i);
            }
        }
    }
    private static void swap(char[] charArray, int i, int j) {
        char temp = charArray[i];
        charArray[i] = charArray[j];
        charArray[j] = temp;
    }
}
