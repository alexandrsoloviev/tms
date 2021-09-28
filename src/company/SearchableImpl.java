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
    public boolean internalSearch(Director director, String name) {
        for (Employee employee : director.employees) {
            if (employee.setProfession().equals(PROFESSION.DIRECTOR)) {
                return search((Director)employee,name);


            }
        }return false;
    }
}