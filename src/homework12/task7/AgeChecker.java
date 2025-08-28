package homework12.task7;

import java.util.Scanner;

class InvalidAgeException extends Exception {
    public InvalidAgeException(String message) {
        super(message);
    }
}

public class AgeChecker {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your age: ");

        try {

            int age = scanner.nextInt();

            if (age < 0 || age > 120) {
                throw new InvalidAgeException("Invalid age. The age must be greater than 0 and smaller than 120.");
            }

            System.out.println("Your age is " + age);

        } catch (InvalidAgeException e) {
            System.out.println("Error: " + e.getMessage());
        } catch (Exception e) {
            System.out.println("Error: Please enter a valid integer.");
        } finally {
            scanner.close();
        }

    }
}
