// Напишите программу, которая будет проверять, можно ли получить из одной строки другую путем перестановки ее букв.

public class TenEightOne {

    // Метод для проверки, можно ли получить одну строку из другой путем перестановки ее букв
    public static boolean checkPermutation(String str1, String str2) {
        // Проверка длин строк - если строки имеют разную длину, то нельзя получить одну из другой
        if (str1.length() != str2.length()) {
            return false;
        }

        // Создание массивов символов для обеих строк
        char[] arr1 = str1.toCharArray();
        char[] arr2 = str2.toCharArray();

        // Создание массива для хранения количества каждого символа в первой строке
        int[] count = new int[256];

        // Увеличение счетчика для каждого символа в первой строке
        for (int i = 0; i < arr1.length; i++) {
            count[arr1[i]]++;
        }

        // Уменьшение счетчика для каждого символа во второй строке
        for (int i = 0; i < arr2.length; i++) {
            count[arr2[i]]--;
            // Если встретился символ, которого не было в первой строке, то нельзя получить одну из другой
            if (count[arr2[i]] < 0) {
                return false;
            }
        }

        // Проверка, что все символы из первой строки были использованы во второй строке
        for (int i = 0; i < count.length; i++) {
            if (count[i] != 0) {
                return false;
            }
        }

        // Если все проверки пройдены, то можно получить одну строку из другой
        return true;
    }

    // Тестирование программы
    public static void main(String[] args) {
        String str1 = "hello";
        String str2 = "lloeh";

        // Проверяем, можно ли получить str2 из str1
        if (checkPermutation(str1, str2)) {
            System.out.println("Строки можно получить друг из друга");
        } else {
            System.out.println("Строки нельзя получить друг из друга");
        }
    }
}
