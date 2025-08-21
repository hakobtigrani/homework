package homework11.task4;

import java.util.Scanner;

public class Print {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the first number: ");
        double a = scanner.nextDouble();

        System.out.println("Enter the second number: ");
        double b = scanner.nextDouble();

        System.out.println("Here's the sum: " + Operation.ADD.apply(a, b));
        System.out.println("Here's the difference: " + Operation.SUBTRACT.apply(a, b));
        System.out.println("Here's the product: " + Operation.MULTIPLY.apply(a, b));
        System.out.println("Here's the quotient: " + Operation.DIVIDE.apply(a, b));

    }
}
