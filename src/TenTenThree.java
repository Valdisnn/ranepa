// Дан произвольный двухмерный массив: Найдите максимальный и минимальный элементы и поменяйте их местами.

public class TenTenThree {
    public static void main(String[] args) {
        // Дано двухмерный массив
        int[][] array = {
                {11, 32, 13, 44, 55},
                {31, 42, 53, 66, 75},
                {12, 26, 33, 45, 52},
                {15, 22, 35, 64, 57},
                {21, 52, 32, 44, 38},
        };
        // Найдем минимальный и максимальный элементы и их индексы
        int min = array[0][0];
        int max = array[0][0];
        int minRow = 0;
        int minCol = 0;
        int maxRow = 0;
        int maxCol = 0;
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                if (array[i][j] < min) {
                    min = array[i][j];
                    minRow = i;
                    minCol = j;
                }
                if (array[i][j] > max) {
                    max = array[i][j];
                    maxRow = i;
                    maxCol = j;
                }
            }
        }
        // Заменим местами минимальный и максимальный элементы
        int temp = array[minRow][minCol];
        array[minRow][minCol] = array[maxRow][maxCol];
        array[maxRow][maxCol] = temp;
        // Выводим измененный массив
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                System.out.print(array[i][j] + " ");
            }
            System.out.println();
        }    }
}
