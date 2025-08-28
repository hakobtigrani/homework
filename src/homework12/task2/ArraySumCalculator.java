package homework12.task2;

import java.util.Scanner;

public class ArraySumCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        try {

            System.out.print("Enter the number of elements: ");
            int n = scanner.nextInt();

            int[] numbers = new int[n];
            int sum = 0;

            System.out.println("Enter " + n + " integers:");

            for (int i = 0; i < n; i++) {
                numbers[i] = scanner.nextInt();
                sum += numbers[i];
            }

            System.out.println("Sum of elements: " + sum);

        } catch (Exception e) { System.out.println("Invalid input. Please enter only integers."); }

    }
}
