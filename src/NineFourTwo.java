// Дан некоторый массив: Найдите элемент массива, чье значение наиболее близко к среднему арифметическому массива.

public class NineFourTwo {
    public static void main(String[] args){
        // Задан массив arr
        int[] arr = {1, 2, 3, 4, 5, 6, 7};

        // Найдем сумму всех элементов массива
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
        }

        // Найдем среднее арифметическое
        double average = (double) sum / arr.length;

        // Инициализируем переменные для значения ближайшего элемента и его разницы с средним
        int closestElement = arr[0];
        double minDifference = Math.abs(arr[0] - average);

        // Найдем ближайший элемент
        for (int i = 1; i < arr.length; i++) {
            double difference = Math.abs(arr[i] - average);
            if (difference < minDifference) {
                closestElement = arr[i];
                minDifference = difference;
            }
        }

        // Выводим ближайший элемент на экран
        System.out.println("Ближайший элемент к среднему арифметическому: " + closestElement);
    }
}