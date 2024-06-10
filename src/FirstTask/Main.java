package FirstTask;

import java.util.Arrays;
import java.util.Random;

public class Main {
    public static void shuffleArray(int[] arr) {
        Random rnd = new Random();
        for (int i = arr.length - 1; i > 0; i--) {
            int index = rnd.nextInt(i + 1);
            int temp = arr[index];
            arr[index] = arr[i];
            arr[i] = temp;
        }
    }

    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 5};
        System.out.println("Исходный массив: " + Arrays.toString(array));

        shuffleArray(array);
        System.out.println("Рандомный массив: " + Arrays.toString(array));
    }
}

// test stand // test stand // test stand // test stand // test stand // test stand // test stand // test stand //