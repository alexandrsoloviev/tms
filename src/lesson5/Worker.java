package lesson5;

import java.util.Arrays;

public class Worker extends Employee {








    public Worker(String name, String surname, int experience) {
        super(name, surname, experience);
    }

    @Override
    public PROFESSION getProfession() {
        return PROFESSION.WORKER;
    }

    @Override
    public PROFESSION addWorker(Employee employee) {
        return null;
    }

    @Override
    public PROFESSION addDirector(Employee employee) {
        return null;
    }
}
