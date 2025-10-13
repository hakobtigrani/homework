package homework14.task1;

public class Fibonacci {
    public static void printFibonacci(int n) {
        int n1 = 0;
        int n2 = 1;

        System.out.println("First " + n + " Fibonacci numbers: ");

        for (int i = 0; i < n; i++) {
            System.out.println(n1 + " ");
            int sum = n1 + n2;
            n1 = n2;
            n2 = sum;
        }
    }

    public static void main(String[] args) {
        int count = 24;
        printFibonacci(count);
    }
}
