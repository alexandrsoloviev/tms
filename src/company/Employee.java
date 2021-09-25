package company;

public abstract class Employee extends Person {


    private int exp;

    private int basic = 1000;



    public Employee(String name, String surname, int exp) {
        super(name, surname);
        this.exp = exp;
    }
    public abstract PROFESSION setProfession();

    public int getSalary(){
        return basic * exp * setProfession().getKoef();
    }


    @Override
    public String toString() {
        return "Employee{" +
                "exp=" + exp +
                ", basic=" + basic +
                '}';
    }
}
