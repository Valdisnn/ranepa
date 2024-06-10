package FirstTask;// Дана строка со словами. Найдите самое длинное слово из этой строки.

public class NineFiveOne {
    public static void main(String[] args) {
        String sentence = "Это самая простая строка в мире";

        String longestWord = findLongestWord(sentence);

        System.out.println("Самое длинное слово из строки: " + longestWord);
    }

    public static String findLongestWord(String sentence) {
        // Разделяем строку на слова используя пробелы как разделитель
        String[] words = sentence.split(" ");

        // Переменная для хранения самого длинного слова
        String longestWord = "";

        // Проходимся по каждому слову
        for (String word : words) {
            // Если текущее слово длиннее сохраненного самого длинного слова, то обновляем значение longestWord
            if (word.length() > longestWord.length()) {
                longestWord = word;
            }
        }

        return longestWord;
    }
}