package lesson2;

import java.util.Scanner;

public class Task5 {

    int[] arr = {23, 34, 123, 32556, 122};
    int max = arr[0];
    int min = arr[0];


    public void minMaxArray() {

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            } else if (arr[i] < min) {
                min = arr[i];
            }


        }
        System.out.println(max + "   " + min);


    }
}
