package homework14.task2;

import java.util.Arrays;

public class BubbleSort {
    public static void bubbleSort(int[] a) {
        int n = a.length;
        boolean swapped;

        for (int i = 0; i < n - 1; i++) {
            swapped = false;
            for (int j = 0; j < n - 1; j++) {
                if (a[j] > a[j + 1]) {
                    int temp = a[j];
                    a[j] = a[j + 1];
                    a[j + 1] = temp;
                    swapped = true;
                }
            }
            if (!swapped) break;;
        }
    }

    public static void main(String[] args) {
        int[] data = {6, 4, 3, 8, 1, 9, 2};
        System.out.println("Before: " + Arrays.toString(data));
        bubbleSort(data);
        System.out.println("After: " + Arrays.toString(data));
    }
}
