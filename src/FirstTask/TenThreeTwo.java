package FirstTask;// Дан массив со словами. Получите из этого массива случайное слово, начинающееся на заданную букву.

import java.util.Random;
import java.util.Scanner;

public class TenThreeTwo {
    public static void main(String[] args) {
        // Заданный массив со словами
        String[] words = {"fish","fly","figure","finance"};

        Scanner reader = new Scanner(System.in);
        System.out.print("Введите букву ('f'): ");
        // Ввод буквы пользователем
        char inputLetter = reader.next().charAt(0);

        // Получение случайного слова, начинающегося на введенную букву
        String randomWord = getRandomWord(words, inputLetter);
        System.out.println("Рандомнео слово: " + randomWord);
    }

    public static String getRandomWord(String[] words, char inputLetter) {
        // Создание списка слов, начинающихся на введенную букву
        StringBuilder possibleWords = new StringBuilder();
        for (String word : words) {
            if (word.charAt(0) == inputLetter) {
                possibleWords.append(word).append(" ");
            }
        }

        // Выбор случайного слова из списка
        if (possibleWords.length() > 0) {
            String[] possibleWordsArr = possibleWords.toString().trim().split(" ");
            Random random = new Random();
            int randomIndex = random.nextInt(possibleWordsArr.length);
            return possibleWordsArr[randomIndex];
        } else {
            return "Слова не найдены";
        }
    }
}
