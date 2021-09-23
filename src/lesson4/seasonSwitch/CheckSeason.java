package lesson4.seasonSwitch;

public class CheckSeason {

    MONTH month = MONTH.APRIL;

    public void checkSeason(){
        switch (month){
            case JANUARY:
            case FEBRUARY:
            case DECEMBER:
                System.out.println("WINTER");
                break;
            case MARCH:
            case APRIL:
            case MAY:
                System.out.println("SPRING");
                break;
            case JUNE:
            case JULE:
            case AUGUST:
                System.out.println("SUMMER");
                break;
            case SEPTEMBER:
            case NOVEMBER:
            case OCTOBER:
                System.out.println("AUTUMN");
                break;
            default:
                System.out.println("UNKNOWN");
        }
    }
}
