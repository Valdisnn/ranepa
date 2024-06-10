package FirstTask;/* Дана строка:
"""
	text1
	text2

	text3
	text4

	text5
"""
Удалите из нее все пустые строки, находящиеся не в начале и не в конце текста:*/

public class NineTenTwo {
    public static void main(String[] args) {
        // Исходная строка
        String text = "\n\ttext1\n\ttext2\n\t\n\ttext3\n\ttext4\n\t\n\ttext5\n";

        // Разбиваем текст на строки
        String[] lines = text.split("\n");

        // Создаем новую переменную для хранения результата
        StringBuilder result = new StringBuilder();

        // Проходим по каждой строке
        for (String line : lines) {
            // Проверяем, является ли строка пустой
            if (!line.trim().isEmpty()) {
                // Если строка не пустая, то добавляем ее в результат
                result.append(line).append("\n");
            }
        }

        // Выводим полученный результат
        System.out.println(result.toString());
    }
}