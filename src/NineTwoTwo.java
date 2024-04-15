// Даны два массива: Слейте их элементы попарно в следующий двухмерный массив:

public class NineTwoTwo {
    public static void main(String[] args) {
        int[] arr1 = {1, 2, 3, 4};
        int[] arr2 = {5, 6, 7, 8};

        int[][] mergedArray = mergeArrays(arr1, arr2);

        // Вывод двухмерного массива
        for (int i = 0; i < mergedArray.length; i++) {
            for (int j = 0; j < mergedArray[i].length; j++) {
                System.out.print(mergedArray[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static int[][] mergeArrays(int[] arr1, int[] arr2) {
        int[][] mergedArray = new int[arr1.length][2];

        for (int i = 0; i < arr1.length; i++) {
            mergedArray[i][0] = arr1[i];
            mergedArray[i][1] = arr2[i];
        }

        return mergedArray;
    }
}