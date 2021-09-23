package lesson4.arrays;

import java.util.Arrays;

public class ArraysMethods {
    private int[] arr = {12, 34, 56, 75, 32, 2, 21312312};

    private int[] sortArray() {
        Arrays.sort(arr);
        return arr;
    }

    public void printSortArr() {
        System.out.println(Arrays.toString(sortArray()));
    }


    private int findMaxValue() {
        sortArray();
        int maxValue = arr[arr.length - 1];
        return maxValue;
    }

    public void printMaxValueInArray() {
        System.out.println(findMaxValue());
    }

   private int findElementByIndex(int index) {
        int element = 0;
        for (int i = 0; i < index+1 ; i++) {
            element = arr[index];


        }
        return element;
    }

    public void printElement(int index){
        try {
            System.out.println(findElementByIndex(index));
        }catch (ArrayIndexOutOfBoundsException e){
            System.out.println("The is no such index in the array!");
        }
    }
}
