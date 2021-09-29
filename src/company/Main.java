package company;

public class Main {
    public static void main(String[] args) {


        Employee worker1 = new Worker("1", "1", 1);
        Employee worker2=new Worker("2","2",2);
        Employee worker3=new Worker("3","3",3);
        Employee worker4=new Worker("4","4",3);

        Employee director = new Director("2", "2", 2);
        Employee director1 = new Director("D2","D2",2);






        ((Director)director).addWorker(worker1);
        ((Director)director).addWorker(worker2);
        ((Director)director).addWorker(worker3);
        ((Director)director1).addWorker(worker4);
        ((Director)director).addWorker(director1);

//        System.out.println(director.getSalary());
//
//        System.out.println(director.toString());


        SearchableImpl searchable = new SearchableImpl();
        System.out.println(searchable.search(((Director)director),"4"));







    }
}
