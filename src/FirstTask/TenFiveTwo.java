package FirstTask;// Дан произвольный двухмерный массив: Обнулите элементы его главной диагонали:

public class TenFiveTwo {
    // Объявляем функцию, которая принимает двухмерный массив
    public static void zeroOutDiagonal(int[][] matrix) {
        // Получаем количество строк и столбцов в массиве
        int rows = matrix.length;
        int cols = matrix[0].length;
        // Проходим по главной диагонали и обнуляем элементы
        for (int i = 0; i < rows && i < cols; i++) {
            matrix[i][i] = 0;
        }
    }
    // Пример использования функции
    public static void main(String[] args) {
        // Создаем произвольный двухмерный массив
        int[][] array = {
                {11, 12, 13, 14, 15},
                {21, 22, 23, 24, 25},
                {31, 32, 33, 34, 35},
                {41, 42, 43, 44, 45},
                {51, 52, 53, 54, 55},
        };
        // Выводим исходный массив
        System.out.println("Исходный массив:");
        for (int[] row : array) {
            for (int num : row) {
                System.out.print(num + " ");
            }
            System.out.println();
        }
        // Обнуляем элементы главной диагонали
        zeroOutDiagonal(array);
        // Выводим измененный массив
        System.out.println("Массив после обнуления главной диагонали:");
        for (int[] row : array) {
            for (int num : row) {
                System.out.print(num + " ");
            }
            System.out.println();
        }
    }
}
