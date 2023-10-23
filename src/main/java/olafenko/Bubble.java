package olafenko;

import java.util.Arrays;
import java.util.Random;

public class Bubble {


    private final int[] numbers = new int[10];


    public void run() {
        arrRandomize(numbers);
        System.out.println(Arrays.toString(numbers));
        bubbleSort(numbers);
        System.out.println(Arrays.toString(numbers));
    }

    private void bubbleSort(int[] arr) {

        for (int i = arr.length; i>0; i--) {
            for (int j = 0; j < arr.length - 1; j++) {

                if (arr[j] > arr[j + 1]) {
                    swap(arr, j, j + 1);
                }
            }
        }
    }


    private void swap(int[] arr, int index1, int index2) {

        int temp = arr[index1];
        arr[index1] = arr[index2];
        arr[index2] = temp;

    }

    private void arrRandomize(int[] arr) {
        Random random = new Random();
        for (int i = 0; i < arr.length; i++) {
            arr[i] = random.nextInt(100);
        }
    }


}
