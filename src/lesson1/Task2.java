package lesson1;

public class Task2 {
    public static void main(String[] args) {
        int a = 10;
        int b = 5;
        int c = a%b;

        if (c == 0){
            System.out.println("Числа делятся без остатка");
        }else{
            System.out.println("Остаток от деления равен "+c);
        }

    }
}
