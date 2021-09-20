package lesson2;

import java.util.Scanner;

public class Task4 {
    public void sumNum(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите минимальное число");
        int min = sc.nextInt();
        System.out.println("Введите максимальное число");
        int max = sc.nextInt();
        int sum=0;

        for (int i = min; i <=max ; i++) {
            if(i%3==0){
                sum+=i;
            }

        }
        System.out.println(sum);
    }
}
