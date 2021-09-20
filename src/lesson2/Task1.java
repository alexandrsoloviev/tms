package lesson2;

import java.util.Scanner;

public class Task1 {

    public void charSwitch() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите букву");
        String str = sc.next();
        char valueChar = str.charAt(0);

        switch (valueChar) {
            case 'e':
            case 'E':
            case 'y':
            case 'Y':
            case 'u':
            case 'U':
            case 'i':
            case 'I':
            case 'o':
            case 'O':
            case 'a':
            case 'A':
                System.out.println("Гласная буква");
                break;
            default:
                System.out.println("Согласная буква");
        }
    }

    public void charIf(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите букву");
        String str = sc.next();
        char valueChar = str.charAt(0);

        if(valueChar=='e'|| valueChar=='E'|| valueChar=='y'|| valueChar=='Y'|| valueChar=='u'|| valueChar=='U'|| valueChar=='i'|| valueChar=='I'|| valueChar=='o'|| valueChar=='O'|| valueChar=='a'|| valueChar=='A' ){
            System.out.println("Гласная буква");
        }else {
            System.out.println("Согласная буква");
        }

    }
}
