package lesson3;

import java.util.Arrays;

public class Task1 {
    public int[] fibbonachiArray(int arrLength) {
        int[] arr = new int[arrLength];
        arr[1] = 1;


        for (int i = 2; i < arr.length; i++) {
            arr[i] = arr[i - 1] + arr[i - 2];
        }

        System.out.println(Arrays.toString(arr));
        return arr;


    }
}


