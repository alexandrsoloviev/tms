package lesson5;

public class Director extends Employee {
    Employee[] employees={};
    private int newKoef;


    public Director(String name, String surname, int experience) {
        super(name, surname, experience);
    }


    @Override
    public PROFESSION getProfession() {
        return PROFESSION.DIRECTOR;
    }


    @Override
    public PROFESSION addWorker(Employee employee) {


        for (int i = 0; i <employees.length ; i++) {
            employees[i] = employee;
            Employee[] emp = new Employee[employees.length+1];
            newKoef = emp.length;


        }
        System.out.println(newKoef);
        return PROFESSION.WORKER;

    }

    @Override
    public PROFESSION addDirector(Employee employee) {

        for (int i = 0; i < employees.length; i++) {
            Employee[] emp = new Employee[i + 1];
            newKoef = emp.length;


        }
        return PROFESSION.DIRECTOR;
    }

    @Override
    public int printSalary() {
        int directorSalary = 1000 * experience * getProfession().getKoef();

        return directorSalary;
    }
}
