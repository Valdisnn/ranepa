package FirstTask;

// Дан произвольный двухмерный массив: Получите сумму столбцов этого массива. Результат представьте в виде массива сумм:
public class TenEightFour {
    public static void main(String[] args) {
        int[][] array = {
                {1, 2, 3, 4, 5},
                {1, 2, 3, 4, 5},
                {1, 2, 3, 4, 5},
                {1, 2, 3, 4, 5},
                {1, 2, 3, 4, 5}
        };
        // Определяем количество столбцов
        int columns = array[0].length;
        // Создаем массив для хранения сумм столбцов
        int[] columnSums = new int[columns];
        // Вычисляем сумму столбцов
        for (int i = 0; i < columns; i++) {
            for (int j = 0; j < array.length; j++) {
                columnSums[i] += array[j][i];
            }
        }
        // Выводим результат
        System.out.print("Суммы столбцов: ");
        for (int sum : columnSums) {
            System.out.print(sum + " ");
        }
    }
}
