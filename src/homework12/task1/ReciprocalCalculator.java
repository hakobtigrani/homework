package homework12.task1;

import java.util.Scanner;

public class ReciprocalCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        try {
            System.out.println("Enter an integer: ");
            int number = scanner.nextInt();

            if (number == 0) {
                throw new ArithmeticException("Error: Cannot find reciprocal of zero.");
            }

            double reciprocal = 1.0 / number;
            System.out.println("Reciprocal: " + reciprocal);

        } catch (ArithmeticException e) {
            System.out.println(e.getMessage());
        } catch (Exception e) {
            System.out.println("Invalid input. Please enter an integer.");
        }

    }
}
