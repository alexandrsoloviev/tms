package lesson2;

import java.util.Scanner;

public class Task2 {
    public void timeOfTheYear() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введдите название месяца");
        String month = sc.next();

        if (month.equalsIgnoreCase("январь") || month.equalsIgnoreCase("декабрь") || month.equalsIgnoreCase("февраль")) {
            System.out.println("ЗИМА");
        } else if (month.equalsIgnoreCase("март") || month.equalsIgnoreCase("апрель") || month.equalsIgnoreCase("май")) {
            System.out.println("ВЕСНА");
        } else if (month.equalsIgnoreCase("июнь") || month.equalsIgnoreCase("июль") || month.equalsIgnoreCase("август")) {
            System.out.println("ЛЕТО");
        } else if (month.equalsIgnoreCase("сентябрь") || month.equalsIgnoreCase("октябрь") || month.equalsIgnoreCase("ноябрь")) {
            System.out.println("ОСЕНЬ");
        } else {
            System.out.println("Вы не праильно ввели название месяца");
        }
    }
}
