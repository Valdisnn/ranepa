// Дан файл с текстом (файл заменен на просто текст). Найдите самый часто используемый символ этого текста и выведите его в абзац.

public class TenNineOne {

    public static void main(String[] args) {
        String text = "зАдАн тАкой-то тАск"; // Заданный текст

        // Создаем массив для подсчета количества символов
        int[] freq = new int[Character.MAX_VALUE];

        // Подсчитываем количество каждого символа в тексте
        for (int i = 0; i < text.length(); i++) {
            char ch = text.charAt(i);
            freq[ch]++;
        }

        char mostUsedChar = 0; // Самый часто используемый символ
        int maxFreq = 0; // Максимальная частота использования символа

        // Находим символ с максимальной частотой использования
        for (int i = 0; i < freq.length; i++) {
            if (freq[i] > maxFreq) {
                maxFreq = freq[i];
                mostUsedChar = (char) i;
            }
        }

        // Выводим самый часто используемый символ
        System.out.println("Самый часто используемый символ: " + mostUsedChar);
    }
}
