package company;

public class Worker extends Employee {


    @Override
    public PROFESSION setProfession() {
        return PROFESSION.WORKER;
    }

    public Worker(String name, String surname, int exp) {
        super(name, surname, exp);
    }

    @Override
    public String toString() {
        return "Worker{" +
                ", name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                '}';
    }
}
