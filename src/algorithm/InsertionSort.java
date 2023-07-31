package algorithm;

import java.util.Arrays;

public class InsertionSort {
    public static void main(String[] args) {
        int[] arr = {80, 50, 70, 10, 60, 20, 40, 30};

        insertionSort(arr, arr.length);
    }

    public static void insertionSort(int[] arr, int count) {
        int i = 0;
        int j = 0;
        int temp = 0;

        for (i = 1; i < count; i++ ){
            temp = arr[i];
            j = i;
            while ((j > 0) && arr[j - 1] > temp) {
                arr[j] = arr[j - 1];
                j--;
            }
            arr[j] = temp;

            System.out.println("while : " + i);
            System.out.println(Arrays.toString(arr));
        }
    }
}
