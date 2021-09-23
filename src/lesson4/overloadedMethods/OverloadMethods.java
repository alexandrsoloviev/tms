package lesson4.overloadedMethods;

public class OverloadMethods {

    private String name;
    private int age;
    private boolean adult;

    public void getUserInfo(String name,int age, boolean adult){
        System.out.println(name+" "+age+" "+ adult);
    }
    public void getUserInfo(String name, int age){
        System.out.println(name+" "+age);
    }
    public void getUserInfo(int age, String name){
        System.out.println(age+" "+name);
    }
    public int getUserInfo(int age,boolean adult){
        return age;
    }
//    public boolean getUserInfo(int age,boolean adult){  //Нельзя перегружать метод, в котором отличается только возвращаемый тип
//        return adult;
//    }

}
