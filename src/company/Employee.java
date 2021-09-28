package company;

public abstract class Employee extends Person {


    private int exp;
    private PROFESSION profession;
    private int basic = 1000;


    public void setProfession(PROFESSION profession) {
        this.profession = profession;
    }

    public PROFESSION getProfession() {
        return profession;
    }

    public Employee(String name, String surname, int exp) {
        super(name, surname);
        this.exp = exp;
    }
    public abstract PROFESSION setProfession();

    public int getSalary(){
        return basic * exp * getProfession().getKoef();
    }


    @Override
    public String toString() {
        return "Employee{" +
                "exp=" + exp +
                ", basic=" + basic +
                '}';
    }
}
