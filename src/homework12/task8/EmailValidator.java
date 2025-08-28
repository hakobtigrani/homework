package homework12.task8;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

class InvalidEmailException extends Exception {
    public InvalidEmailException(String message) {
        super(message);
    }
}

public class EmailValidator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter your email address: ");
        String email = scanner.nextLine();

        try {

            if (!isValidEmail(email)) {
                throw new InvalidEmailException("Invalid email address entered.");
            }

            System.out.println("Email is valid: " + email);

        } catch (InvalidEmailException e) {
            System.out.println("Error: " + e.getMessage());
        } finally {
            scanner.close();
        }

    }

    public static boolean isValidEmail(String email) {
        String emailRegex = "^[A-Za-z0-9+_.-]+@[A-Za-z0-9.-]+$";
        Pattern pattern = Pattern.compile(emailRegex);
        Matcher matcher = pattern.matcher(email);
        return matcher.matches();
    }

}