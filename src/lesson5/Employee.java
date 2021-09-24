package lesson5;

public abstract class Employee extends Person {

    public Employee(String name, String surname, int experience) {
        super(name, surname);
        this.experience = experience;
    }


    public void setExperience(int experience) {
        this.experience = experience;
    }

    protected int experience;



    public int printSalary(){

       return  1000 * experience * getProfession().getKoef();
    }

    public abstract PROFESSION getProfession();
    public abstract PROFESSION addWorker(Employee employee);
    public abstract PROFESSION addDirector(Employee employee);


}
