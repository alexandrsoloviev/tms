package lesson4.constructors;

public class TestConstructor {

    private String userName;
    private int age;
    private boolean adult;

    public TestConstructor(int age, boolean adult) {
        this.age = age;
        this.adult = adult;
    }

    public TestConstructor(String userName, int age) {
        this(21, true);
        this.userName = userName;
        this.age = age;
    }

    public boolean adultChecker() {
        this.age = age;
        this.adult = adult;
        if (age >= 18) {
            adult = true;
        } else {
            adult = false;
        }
        System.out.println(adult);
        return adult;

    }
}
