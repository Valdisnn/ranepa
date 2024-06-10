package FirstTask;// Дан массив:Отсортируйте элементы массива по возрастанию суммы элементов подмассива.

import java.util.Arrays;
import java.util.Comparator;

public class NineOneThree {
    public static void main(String[] args) {
        int[][] array = {
                {2, 4, 5},
                {1, 2, 3},
                {0, 1, 1},
                {5, 7, 1}
        };

        // Сортируем массив по сумме элементов подмассивов
        Arrays.sort(array, Comparator.comparingInt(arr -> Arrays.stream(arr).sum()));

        // Вывод отсортированного массива
        for (int[] arr : array) {
            System.out.println(Arrays.toString(arr));
        }
    }
}
