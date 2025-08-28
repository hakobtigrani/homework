package homework12.task9;

import java.util.Scanner;

class InvalidDivisorException extends Exception {
    public InvalidDivisorException(String message) {
        super(message);
    }
}

public class DivisionCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        try {

            System.out.print("Enter the first integer: ");
            int numerator = scanner.nextInt();

            System.out.print("Enter the second integer: ");
            int denominator = scanner.nextInt();

            if (denominator <= 0) {
                throw new InvalidDivisorException("Denominator cannot be zero or negative.");
            }

            int quotient = numerator / denominator;
            System.out.println("Quotient: " + quotient);

        } catch (InvalidDivisorException e) {
            System.out.println("Error: " + e.getMessage());
        } catch (Exception e) {
            System.out.println("Error: Please enter valid integers.");
        } finally {
            scanner.close();
        }

    }
}
