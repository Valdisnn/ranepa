// Дано целое число:Найдите наименьшую и наибольшую цифру в этом числе.

public class NineOneOne
{
    public static void main(String[] args) {
        // Объявляем целое число
        int num = 12345;

        // Инициализируем переменные для хранения наименьшей и наибольшей цифры
        int minDigit = 9;
        int maxDigit = 0;

        // Проходим по каждой цифре в числе с помощью цикла
        while(num > 0){
            int digit = num % 10; // Получаем последнюю цифру числа
            minDigit = Math.min(minDigit, digit); // Сравниваем с текущей наименьшей цифрой
            maxDigit = Math.max(maxDigit, digit); // Сравниваем с текущей наибольшей цифрой
            num = num / 10; // Удаляем последнюю цифру
        }

        // Выводим наименьшую и наибольшую цифры
        System.out.println("Наименьшая цифра: " + minDigit);
        System.out.println("Наибольшая цифра: " + maxDigit);
    }
}
