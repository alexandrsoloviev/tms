package collections;

import java.util.*;

public class UserService {
    public static void main(String[] args) {
        User user = new User("b", 'M', 11);
        User user1 = new User("a", 'M', 10);
        User user2 = new User("d", 'M', 10);
        User user3 = new User("c", 'M', 10);


        List<User> arrayList = new ArrayList<>();
        arrayList.add(user);
        arrayList.add(user1);
        arrayList.add(user2);
        arrayList.add(user3);
//        Collections.sort(arrayList);
//        System.out.println(arrayList);


        List<User> linkedList = new LinkedList<>();
        linkedList.add(new User("B",'F',11));
        linkedList.add(new User("A",'F',11));
        linkedList.add(new User("D",'F',10));
        linkedList.add(new User("C",'F',11));
//        Collections.sort(linkedList);
//        System.out.println(linkedList);


        Set<User> hashSet = new TreeSet<>();
        hashSet.add(new User("B",'F',11));
        hashSet.add(new User("A",'F',11));
        hashSet.add(new User("D",'F',111));
        hashSet.add(new User("C",'F',11));
        System.out.println(hashSet);




    }
}
