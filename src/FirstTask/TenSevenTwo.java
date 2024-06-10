package FirstTask;

// Дан произвольный двухмерный массив. Обнулите элементы, находящиеся не на диагоналях:
public class TenSevenTwo {
    public static void main(String[] args) {
        // Объявляем произвольный двухмерный массив
        int[][] array = {
                {11, 12, 13, 14, 15},
                {21, 22, 23, 24, 25},
                {31, 32, 33, 34, 35},
                {41, 42, 43, 44, 45},
                {51, 52, 53, 54, 55},
        };
        // Определяем количество строк и столбцов в массиве
        int rows = array.length;
        int cols = array[0].length;
        // Проходим по каждому элементу массива
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                // Если элемент не принадлежит главной или побочной диагонали
                if (i != j && i != cols - j - 1) {
                    // Обнуляем элемент
                    array[i][j] = 0;
                }
            }
        }
        // Выводим результат
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                System.out.print(array[i][j] + " ");
            }
            System.out.println();
        }
    }
}