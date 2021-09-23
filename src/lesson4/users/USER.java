package lesson4.users;

public enum USER {

    USER1("Petr", "Petrov", 40, 'M'),
    USER2("Irina", "Petrova", 38, 'F'),
    USER3("Denis", "Petrov", 18, 'M');

    UserAddress userAddress= new UserAddress();
    private String name;
    private String surname;
    private int age;
    private char gender;
    private  String addressInfo = userAddress.getAddress("RB","Minsk");



    USER(String name, String surname, int age, char gender) {
        this.name = name;
        this.surname = surname;
        this.age = age;
        this.gender = gender;


    }

    public void printNameSname() {
        System.out.println(name + " " + surname);
    }

    public void UpAge() {
        age++;
        System.out.println(age);
    }


    public void UserInfo() {

        System.out.println(name + " " + surname + " " + age + " " + gender+" "+ addressInfo);


    }

    public class UserAddress {
        private String country;
        private String city;

        public String getAddress(String country, String city) {
            this.country = country;
            this.city = city;
            return country+" "+city;

        }
    }
}
