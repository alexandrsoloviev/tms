package dataBase;

public class InputFromConsole extends Memory {

    public void input() {
        while (true) {
            System.out.println("enter 'input' to save in memory");
            System.out.println("enter 'remove' to delete from memory");
            String input = sc.nextLine();

            if (input.equals("input")) {
                addInDB(sc.nextLine());
                System.out.println(getDataBase());


            } else if (input.equals("remove")) {
                getAndRemoveFromDB();
                System.out.println(getDataBase());

            } else if (input.equals("get")) {
                System.out.println(dataBase.get(0));
            } else {
                System.out.println("Please follow the instructions:");

            }
        }
    }
}
