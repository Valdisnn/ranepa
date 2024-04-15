// Спросите у пользователя целое число. В ответ выведите разложение этого числа на простые множители.

import java.util.HashMap;

public class TenTwoThree {
    public static String findFractionPeriod(int numerator, int denominator) {
        // Проверяем, являются ли числа целыми числами
        if (numerator % denominator == 0) {
            return "Десятичная дробь является целым числом";
        }
        // Создаем хэшмап, где ключ - остаток, значение - индекс позиции остатка
        HashMap<Integer, Integer> remainderMap = new HashMap<>();
        // Вычисляем первую часть десятичной дроби
        StringBuilder decimalFraction = new StringBuilder();
        decimalFraction.append(numerator / denominator);
        decimalFraction.append(".");
        // Получаем остаток от деления
        int remainder = numerator % denominator;
        int position = 0;
        // Выполняем деление в столбик, пока остаток не станет равным нулю
        while (remainder != 0) {
            // Если остаток уже встречался ранее, значит, начался период
            if (remainderMap.containsKey(remainder)) {
                int index = remainderMap.get(remainder);
                String periodicPart = decimalFraction.substring(index);
                return decimalFraction.substring(0, index) + "(" + periodicPart + ")";
            }
            // Добавляем текущий остаток и его позицию в хэшмап
            remainderMap.put(remainder, position);
            position++;
            // Дописываем цифру в десятичную дробь
            remainder *= 10;
            decimalFraction.append(remainder / denominator);
            // Получаем новый остаток от деления
            remainder = remainder % denominator;
        }
        // Если остаток стал равным нулю, значит, десятичная дробь не является периодической
        return decimalFraction.toString();
    }
    public static void main(String[] args) {
        int numerator = 3;
        int denominator = 11;
        String period = findFractionPeriod(numerator, denominator);
        System.out.println("Период десятичной дроби: " + period);
    }}
