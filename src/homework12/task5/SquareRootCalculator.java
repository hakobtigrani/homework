package homework12.task5;

import java.util.Scanner;

public class SquareRootCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        try {

            System.out.print("Enter an integer: ");
            int number = scanner.nextInt();

            if (number < 0) {
                throw new IllegalArgumentException("Invalid number");
            }

            double sqrt = Math.sqrt(number);
            System.out.println("Square root: " + sqrt);

        } catch (Exception e) {
            System.out.println("Invalid number");
        } finally {
            System.out.println("Good bye");
        }

    }
}
