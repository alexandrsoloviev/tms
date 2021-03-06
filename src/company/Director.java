package company;

import java.util.Arrays;

public class Director extends Employee {


     public Employee[] employees;

    public Employee[] getEmployees() {
        return employees;
    }

    @Override
    public PROFESSION setProfession() {
        return PROFESSION.DIRECTOR;
    }

    public Director(String name, String surname, int exp) {
        super(name, surname, exp);
    }

    public void addWorker(Employee employee) {
        if (employees == null) {
            employees = new Employee[1];
            employees[0] = employee;
        } else {
            employees = Arrays.copyOf(employees, employees.length + 1);
            employees[employees.length - 1] = employee;
        }
    }

    @Override
    public int getSalary() {
        if (employees == null) {
            return super.getSalary();
        } else {
            return (super.getSalary() + (employees.length * 500));
        }

    }


    @Override
    public String toString() {
        return "Director{" +
                "employees=" + Arrays.toString(employees) +
                ", name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                '}';
    }
}
