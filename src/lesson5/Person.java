package lesson5;

public class Person {

    private String name;

    public void setName(String name) {
        this.name = name;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    private String surname;


    public Person(String name, String surname) {
        this.name = name;
        this.surname = surname;
    }

    public String getNameSurname(){
        return name+surname;

    }
}
