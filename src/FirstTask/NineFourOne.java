package FirstTask;// Дан файл (текст). Прочитайте его текст и найдите самое часто встречающееся слово в этом тексте.

import java.util.HashMap;
import java.util.Map;

public class NineFourOne {
    public static void main(String[] args) {
        // Заданный текст
        String text = "Дан текст. Прочитайте его текст и найдите самое часто встречающееся слово";
        // Удаление знаков препинания и приведение к нижнему регистру
        String cleanedText = text.replaceAll("[.!:,]", "").toLowerCase();
        // Разделение текста на отдельные слова
        String[] words = cleanedText.split(" ");
        // Создание словаря для хранения частоты встречаемости слов
        HashMap<String, Integer> wordCountMap = new HashMap<>();
        // Подсчет частоты встречаемости каждого слова
        for (String word : words) {
            if (wordCountMap.containsKey(word)) {
                wordCountMap.put(word, wordCountMap.get(word) + 1);
            } else {
                wordCountMap.put(word, 1);
            }
        }
        // Нахождение слова с наибольшей частотой встречаемости
        String mostFrequentWord = "";
        int maxCount = 0;

        for (Map.Entry<String, Integer> entry : wordCountMap.entrySet()) {
            if (entry.getValue() > maxCount) {
                mostFrequentWord = entry.getKey();
                maxCount = entry.getValue();
            }
        }
        // Вывод результата
        System.out.println("Самое часто встречающееся слово: " + mostFrequentWord);
    }
}