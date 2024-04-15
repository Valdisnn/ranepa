/* Дана некоторая строка: String txt = "abcde abcde";
В переменной хранятся символы: String del = "abe";
Удалите из строки все указанные в переменной символы.
В нашем случае должно получится следующее:"cd cd" */

public class NineFourThree {
    public static void main(String[] args) {
        // Исходная строка
        String txt = "abcde abcde";
        // Символы, которые нужно удалить
        String del = "abe";

        // Преобразование строки del в массив символов для удобства работы
        char[] delChars = del.toCharArray();

        // Проход по каждому символу строки del
        for (char ch : delChars) {
            // Замена каждого символа строки del на пустую строку в исходной строке
            txt = txt.replace(Character.toString(ch), "");
        }

        // Вывод результата
        System.out.println(txt);
    }
}