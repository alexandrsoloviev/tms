package lesson2;

import java.util.Arrays;

public class Task6 {
    public void bubbleSort() {
        int[] arr = {2, 4, 5, 7, 8};

        for (int i = arr.length - 1; i > 0; i--) {
            for (int j = 0; j < i; j++) {

                if (arr[j] > arr[j + 1]) {
                    int tmp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = tmp;
                }
            }
        }

        System.out.println(Arrays.toString(arr));
    }
}
