package company;

import java.util.Objects;

public class SearchableImpl implements Searchable, InternalSearchable {

    @Override
    public boolean search(Director director, String name) {
        for (Employee employee : director.employees) {
            if (Objects.equals(name, employee.getName())) {
                return true;
            }


        }
        return false;

    }

    @Override
    public void internalSearch(Director director, String name) {
        for (Employee employee : director.employees) {
            if (Objects.equals(employee.getProfession(),PROFESSION.DIRECTOR)) {
                for (Employee employee1 : director.employees) {
                    if (Objects.equals(name, employee1.getName())) {
                        System.out.println("yes");
                    }


                }





            }else {System.out.println("no");}
        }

    }
}