package homework11.task7;

public class Print {
    public static void main(String[] args) {

        for (CoffeeSize size : CoffeeSize.values()) {
            System.out.println("The coffee size: " + size.name() + " \nThe coffee ordinal: " + size.ordinal() + "\n");
        }

    }
}
