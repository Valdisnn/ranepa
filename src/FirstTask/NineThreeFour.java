package FirstTask;// Дан двухмерный массив: Разделите его элементы на два массива:

import java.util.Arrays;

public class NineThreeFour {
    public static void main(String[] args){
        // Создаем двухмерный массив arr
        int[][] arr = {
                {1, 5},
                {2, 6},
                {3, 7},
                {4, 8}
        };

        // Создаем два одномерных массива, один для первых элементов в подмассивах, другой для вторых элементов
        int[] arr1 = new int[arr.length];
        int[] arr2 = new int[arr.length];

        // Проходим по всем элементам массива arr и заносим их в соответствующие массивы arr1 и arr2
        for (int i = 0; i < arr.length; i++) {
            arr1[i] = arr[i][0];
            arr2[i] = arr[i][1];
        }

        // Выводим полученные массивы на экран
        System.out.println("arr1: " + Arrays.toString(arr1));
        System.out.println("arr2: " + Arrays.toString(arr2));
    }
}