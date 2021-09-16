package lesson3;

import java.util.Arrays;

public class Task2 {
    public void minMaxSum() {
        int[] arr = {12, 23, 43, 433, 12, 2, 42, 52, 12, 1, 1000};
        Arrays.sort(arr);
        int sum = arr[0] + arr[arr.length - 1];
        System.out.println(sum);


    }
}

