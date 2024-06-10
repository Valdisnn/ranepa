package FirstTask;

/*Дан файл с текстом (текст). Получите процентное содержание каждого символа текста
и запишите результат в файл (новую переменную) так,
чтобы на каждой строке был записан символ и его процент. */
public class NineEightFour {
    public static void main(String[] args) {
        String text = "Lorem ipsum dolor sit amet, consectetur adipiscing elit.";
        float totalCount = text.length();
        // Создаем массив для хранения количества встречающихся символов, по умолчанию заполненный нулями
        int[] charCount = new int[128];
        // Подсчитываем количество каждого символа в тексте
        for (int i = 0; i < totalCount; i++) {
            charCount[text.charAt(i)]++;
        }
        // Выводим процентное содержание каждого символа
        for (int i = 0; i < charCount.length; i++) {
            if (charCount[i] > 0) {
                float percentage = charCount[i] / totalCount * 100;
                System.out.println((char) i + ": " + percentage + "%");
            }
        }
    }
}
