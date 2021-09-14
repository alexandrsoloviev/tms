package lesson1;


public class Task3 {
    public static void main(String[] args) {
        int a = 4587;
        int thousandA = a / 1000;
        int hudredA = a / 100 % 10;
        int tenA = a / 10 % 10;
        int oneA = a % 10;
        System.out.println("В числе " + a + ":");
        if (thousandA == 1) {
            System.out.println(thousandA + " тысяча");
        } else if (thousandA < 1 && thousandA > 5) {
            System.out.println(thousandA + " тысячи");
        } else {
            System.out.println(thousandA + " тысяч");
        }

        if (hudredA == 1) {
            System.out.println(hudredA + " сотня");
        } else if (hudredA > 1 && hudredA < 5) {
            System.out.println(hudredA + " сотни");
        } else {
            System.out.println(hudredA + " сотен");
        }

        if (tenA == 1) {
            System.out.println(tenA + " десяток");
        } else if (tenA > 1 && tenA < 5) {
            System.out.println(tenA + " десятка");
        } else {
            System.out.println(tenA + " десятков");
        }

        if (oneA == 1) {
            System.out.println(oneA + " единица");
        } else if (oneA > 1 && oneA < 5) {
            System.out.println(oneA + " единицы");
        } else {
            System.out.println(oneA + " единиц");
        }

        /*System.out.println("В числе " + a  + ":"+ '\n'+" " + thousandA + " тысяч, "
                + " " + hudredA + " сотен," + " " + tenA + " десятков" + " и " + oneA+ " единиц"  );*/
        System.out.println();
    }


}
