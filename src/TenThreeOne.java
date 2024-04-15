// Дан массив из шести цифр. Проверьте, можно ли собрать из этих цифр счастливый билет.

public class TenThreeOne {
    public static boolean checkLuckyTicket(int[] digits) {
        // Проверяем, что массив состоит из шести цифр. Если нет, то возвращаем false.
        if (digits.length != 6) {
            return false;
        }

        // Инициализируем переменные для хранения суммы первых и вторых трех цифр билета.
        int sumFirstThreeDigits = 0;
        int sumLastThreeDigits = 0;

        // Считаем сумму первых трех цифр.
        for (int i = 0; i < 3; i++) {
            sumFirstThreeDigits += digits[i];
        }

        // Считаем сумму последних трех цифр.
        for (int i = 3; i < 6; i++) {
            sumLastThreeDigits += digits[i];
        }

        // Если суммы первых и последних трех цифр равны, то возвращаем true (счастливый билет), иначе возвращаем false.
        return (sumFirstThreeDigits == sumLastThreeDigits);
    }
    // Пример использования метода checkLuckyTicket с массивом [1, 2, 3, 4, 5, 6].
    public static void main(String[] args) {
        int[] ticketDigits = {0,4,7,0,4,7};
        boolean isLuckyTicket = checkLuckyTicket(ticketDigits);

        if (isLuckyTicket) {
            System.out.println("Данный билет является счастливым!");
        } else {
            System.out.println("Данный билет не является счастливым.");
        }
    }
}
