package lesson3;

public class Task3 {
    public void evenNotEven() {
        int[] arr = {5,4,3,2,1,2,4,3,5,12,4,1};
        int even = 0;
        int notEven = 0;
        for (int i = 0; i < arr.length; i++) {
            if (i % 2 != 0) {
                even += arr[i];

            }else{
                notEven+=arr[i];
            }

        }
        int result = even - notEven;
        System.out.println(result);
    }
}
