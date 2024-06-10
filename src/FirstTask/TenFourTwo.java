package FirstTask;// Дан произвольный двухмерный массив: Получите массив элементов его побочной диагонали:

import java.util.Arrays;

public class TenFourTwo {
    public static void main(String[] args) {
        int[][] array = {
                {11, 12, 13, 14, 15},
                {21, 22, 23, 24, 25},
                {31, 32, 33, 34, 35},
                {41, 42, 43, 44, 45},
                {51, 52, 53, 54, 55},
        };

        int[] diagonal = new int[array.length];
        for (int i = 0; i < array.length; i++) {
            diagonal[i] = array[i][array.length - i - 1];
        }

        System.out.println(Arrays.toString(diagonal));
    }
}
