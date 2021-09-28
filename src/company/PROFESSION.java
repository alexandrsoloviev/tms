package company;

public enum PROFESSION {

    WORKER(1),
    DIRECTOR(2);

    private int koef;




    PROFESSION(int koef) {
        this.koef = koef;
    }

    public int getKoef() {
        return koef;
    }






}
