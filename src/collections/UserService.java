package collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class UserService implements Comparable<User> {

    public void findByName(List<User> list, String name) {
        for (User u : list) {
            if (name.equals(u.getName())) {
                System.out.println(u);
            }
        }
    }

    public void returnGender(List<User> list,Character gender){
        List<User> genderList = new ArrayList<>();
        for (User u:list) {
            if(u.getGender().equals(gender)){
                genderList.add(u);
            }

        }
        System.out.println(genderList);
    }

    @Override
    public int compareTo(User user) {
        return user.getAge()> user.getAge()? 1:-1;
    }

    public void sortByAge(List<User> list){
        Collections.sort(list);
        System.out.println(list);


    }
}

