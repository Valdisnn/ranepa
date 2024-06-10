package FirstTask;// Реализуйте алгоритм сортировки методом пузырька.

public class NineEightTwo {
    public static void main(String[] args) {
        int[] array = {5, 1, 3, 4, 2};
        bubbleSort(array);
        System.out.println("Отсортированный массив:");
        for (int num : array) {
            System.out.print(num + " ");
        }
    }

    // Реализация алгоритма сортировки методом пузырька
    public static void bubbleSort(int[] array) {
        int n = array.length;
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (array[j] > array[j + 1]) {
                    // Перестановка элементов, если текущий элемент больше следующего
                    int temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
                }
            }
        }
    }
}