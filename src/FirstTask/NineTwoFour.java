package FirstTask;// Дан массив, подмассивы которого содержат цифры: Слейте элементы этого массива в числа:
import java.util.ArrayList;
import java.util.List;

public class NineTwoFour {
    public static void main(String[] args) {
        // Исходный массив с подмассивами
        int[][] array = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
        };
        // Создадим список для хранения результирующих чисел
        List<Integer> mergedArray = new ArrayList<>();
        // Проходим по каждому подмассиву
        for (int[] subArray : array) {
            // Создаем переменную для хранения числа, собранного из элементов подмассива
            int mergedNumber = 0;

            // Проходим по каждому элементу подмассива
            for (int num : subArray) {
                // Добавляем текущую цифру к числу, умножая его на 10, чтобы учесть порядок разрядов
                mergedNumber = mergedNumber * 10 + num;
            }

            // Добавляем полученное число в результирующий список
            mergedArray.add(mergedNumber);
        }
        // Выводим результирующий список чисел
        System.out.println(mergedArray);
    }
}
