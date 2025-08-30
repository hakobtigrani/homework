package homework12.task11;

import java.util.Scanner;

public class StringOperations {

    static class InvalidInputException extends Exception {
        public InvalidInputException(String message) {
            super(message);
        }
    }

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a string:");
        String input = scanner.nextLine();

        try {

            if (input == null || input.isEmpty()) {
                throw new InvalidInputException("Error: Input string cannot be null or empty.");
            }

            String upper = input.toUpperCase();
            System.out.println("Uppercase: " + upper);

            String reverse = new StringBuilder(input).reverse().toString();
            System.out.println("Reversed: " + reverse);

            int vowelCount = countVowels(input);
            System.out.println("Number of vowels: " + vowelCount);

        } catch (InvalidInputException e) {
            System.out.println(e.getMessage());
        } catch (Exception e) {
            System.out.println("An unexpected error occurred: " + e.getMessage());
        }

    }

    public static int countVowels(String string) throws InvalidInputException {
        if (string == null) throw new InvalidInputException("Cannot count vowels of a null string.");
        int count = 0;
        for (char c : string.toLowerCase().toCharArray()) {
            if ("aeiou".indexOf(c) != -1) count++;
        }
        return count;
    }

}
