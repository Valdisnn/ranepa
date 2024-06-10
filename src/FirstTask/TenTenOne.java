package FirstTask;// Дан массив. Выведите в консоль все варианты перестановки элементов этого массива.

import java.util.Arrays;

public class TenTenOne {
    // Данная функция рекурсивно генерирует все перестановки элементов массива
    public static void generatePermutations(int[] array, int size) {
        // Если достигнут конец массива, выводим текущую перестановку
        if (size == 1) {
            System.out.println(Arrays.toString(array));
        } else {
            for (int i = 0; i < size; i++) {
                generatePermutations(array, size - 1);

                // Четное количество элементов: меняем первый и последний
                if (size % 2 == 0) {
                    swap(array, i, size - 1);
                }
                // Нечетное количество элементов: меняем первый и текущий элемент
                else {
                    swap(array, 0, size - 1);
                }
            }
        }
    }
    // Функция для обмена элементами массива
    public static void swap(int[] array, int i, int j) {
        int temp = array[i];
        array[i] = array[j];
        array[j] = temp;
    }

    public static void main(String[] args) {
        int[] array = {1, 2, 3};
        System.out.println("Исходный массив: " + Arrays.toString(array) + "\n");

        System.out.println("Перестановки элементов массива:");
        generatePermutations(array, array.length);
    }
}
