package homework11.task1;

public class Print {
    public static void main(String[] args) {

        Day day = Day.SATURDAY;

        switch (day) {
            case SATURDAY:
            case SUNDAY:
                System.out.println("Today is a weekend, " + "it's " + day + "!");
                break;
            default:
                System.out.println("Today is a weekday, " + "it's " + day + "!");
        }
    }
}
