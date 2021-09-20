package lesson2;

import java.util.Scanner;

public class Task3 {
    public void exit(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите слово");
        System.out.println("Введите exit для выхода из программы");

        while (true){

            String input = sc.nextLine();
            System.out.println("Введите следуещее слово");
            System.out.println(input);
            if(input.equals("exit")){
                break;
            }
        }
    }
}
