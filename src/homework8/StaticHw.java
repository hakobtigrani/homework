package homework8;

import homework6.ArrayUtil;
import java.util.Random;
import java.time.Duration;
import java.time.LocalDateTime;
import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class StaticHw {

    public static void main(String[] args) throws InterruptedException {

        // 1.
        System.out.println("1:");
        System.out.println(Counter.getI());
        Counter.increment();
        System.out.println(Counter.getI());

        // 2.
        System.out.println("\n2:");
        GetTheMax.getRandom();

        // 3.
//        System.out.println("\n3:");
//        GuessWhat.run();

        // 4.
        System.out.println("\n4:");
        Calculate.timeInit();

        // 5.
        System.out.println("\n5:");
        PersonTest.testing();

        // 6.
        System.out.println("\n6:");
        WorkIt.makeItWork();

        // 7.
        System.out.println("\n7:");
        CalculateBro.doIt();

        // 8,
        System.out.println("\n8:");
        MakeThatShitWork.doIt();

        // 9.
        System.out.println("\n9:");
        FilterThatShit.filtering();

        // 10.
        System.out.println("\n10:");
        RunItUp.running();

    }

    // 1. Create a class with a private static field and a public static method that modifies the
    // value of the field. Write a test class to verify that the value of the field is correctly updated.

    public static class Counter {

        private static int i = 0;

        public static void increment() {
            i++;
        }

        public static int getI() {
            return i;
        }

    }

    // 2. Create a class with a static method that accepts an array of integers and
    // returns the index of the maximum value in the array. Use this method in another
    // class to find the index of the maximum value in a randomly generated array of integers.

    public static class ArrayUtil {
        public static int getMax(int[] arr){

            int max = arr[0];
            for (int i = 0; i < arr.length; i++) {
                if (arr[i] > max){
                    max = arr[i];
                }
            }
            return max;
        }
    }

    public static class GetTheMax {
        public static void getRandom() {

            int[] randomArray = new int[10];
            Random random = new Random();

            for (int i = 0; i < randomArray.length; i++) {
                randomArray[i] = random.nextInt(100);
                System.out.print(randomArray[i] + " ");
            }

            int maxIndex = ArrayUtil.getMax(randomArray);
            System.out.println("\nMaximum value is: " + maxIndex);
        }
    }

    // 3. Create a class with a static field that is initialized with a random value between 1 and 100.
    // Write a program that allows the user to guess the value of the field. The program should provide
    // feedback to the user indicating whether the guess is too high, too low, or correct.

    public static class GuessingTheValue {
        public static int randomValue = new Random().nextInt(100) + 1;
        }

    public static class GuessWhat {
        public static void run() {

            Scanner scanner = new Scanner(System.in);
            int guess = -1;

            System.out.println("Guess the number between 1 and 100 dude!!");

            while (guess != GuessingTheValue.randomValue) {
                System.out.println("Your guess: ");
                if (!scanner.hasNextInt()) {
                    System.out.println("Dude this ain't what I'm asking for, enter a number!" + "\n");
                    scanner.next();
                    continue;
                }
                guess = scanner.nextInt();

                if (guess < GuessingTheValue.randomValue) {
                    System.out.println("Too low man, go again: ");
                } else if (guess > GuessingTheValue.randomValue) {
                    System.out.println("Too high man, go again; ");
                } else {
                    System.out.println("YOOOO MY MAN, YOU GUESSED IT!!!!!");
                }

            }

            scanner.close();

        }
    }

    // 4. Create a class with a final static field that is initialized with the current date and time.
    // Write a program that calculates the number of seconds that have elapsed since the field was initialized.

    public static class Time {
        public static final LocalDateTime currentDT = LocalDateTime.now();
    }

    public static class Calculate {
        public static void timeInit() throws InterruptedException {
            System.out.println("Initialized at: " + Time.currentDT);

            Thread.sleep(5000);

            LocalDateTime nowLikeNow = LocalDateTime.now();
            Duration duration = Duration.between(Time.currentDT, nowLikeNow);
            long secondsElapsed = duration.getSeconds();

            System.out.println("Now: " + nowLikeNow);
            System.out.println("Seconds elapsed: " + secondsElapsed);

        }

    }

    // 5. Create a class with a static method that accepts an array of objects and returns the object with the highest
    // value according to a specific criterion. Use this method in another class to find the oldest person in a list of people.

    public static class Person {

        String name;
        int age;

        public Person(String name, int age) {
            this.name = name;
            this.age = age;
        }
    }

    public class PersonUtils {
        public static Person getOldestPerson(Person[] people) {
            if (people == null || people.length == 0) return null;

            Person oldest = people[0];

            for (int i = 1; i < people.length; i++) {
                if (people[i].age > oldest.age) {
                    oldest = people[i];
                }
            }

            return oldest;
        }
    }

    public class PersonTest {
        public static void testing() {
            Person[] people = {
                    new Person("Jack", 17),
                    new Person("Pum", 20),
                    new Person("Ms", 18)
            };

            Person oldest = PersonUtils.getOldestPerson(people);

            if (oldest != null) {
                System.out.println("Oldest person: " + oldest.name + ", Age: " + oldest.age);
            } else {
                System.out.println("No people in the list.");
            }
        }
    }

    // 6. Create a class with a static method that accepts two strings and returns a string that contains all the characters
    // that appear in both strings. Use this method in another class to find the common characters in two randomly generated strings.

    public static class StringYk {
        public static String getCommonChars(String string1, String string2) {
            String result = "";
            for (char ch : string1.toCharArray()) {
                if (string2.contains(ch + "") && !result.contains(ch + "")) {
                    result += ch;
                }
            }
            return result;
        }
    }

    public class WorkIt {
        public static void makeItWork() {
            String s1 = generateRandomString(10);
            String s2 = generateRandomString(10);

            System.out.println("String 1: " + s1);
            System.out.println("String 2: " + s2);

            String common = StringYk.getCommonChars(s1, s2);
            System.out.println("Common characters: " + common);
        }

        public static String generateRandomString(int length) {
            String chars = "abcdefghijklmnopqrstuvwxyz";
            String result = "";
            for (int i = 0; i < length; i++) {
                int index = (int) (Math.random() * chars.length());
                result += chars.charAt(index);
            }
            return result;
        }
    }

    // 7. Create a class with a static method that recursively calculates the factorial of a given integer.
    // Use this method in another class to calculate the factorial of a randomly generated integer.

    public static class DoTheMath {
        public static int factorial(int n) {
            if (n <= 1) return 1;
            return n * factorial(n - 1);
        }
    }

    public static class CalculateBro {
        public static void doIt() {
            int number = (int)(Math.random() * 10) + 1; // random int from 1 to 10
            System.out.println("Random number: " + number);

            int result = DoTheMath.factorial(number);
            System.out.println("Factorial: " + result);
        }
    }

    // 8. Create a class with a final method that accepts an integer parameter and returns a string representation of
    // the integer in binary format. Use this method in another class to convert a randomly generated integer to binary format.

    public static class StringRepresentation {
        public final String toBinary(int number) {
            return Integer.toBinaryString(number);
        }
    }

    public static class MakeThatShitWork {
        public static void doIt() {
            int randomNum = (int)(Math.random() * 100);
            System.out.println("Random number: " + randomNum);

            StringRepresentation utils = new StringRepresentation();
            String binary = utils.toBinary(randomNum);
            System.out.println("Binary: " + binary);
        }
    }

    // 9. Create a class with a static method that accepts an array of integers and returns a new array containing only the even numbers.
    // Use this method in another class to filter out the even numbers in a randomly generated array of integers.

    public static class ArrayOfEvens {
        public static int[] getEvenNumbers(int[] numbers) {
            int count = 0;
            for (int n : numbers) {
                if (n % 2 == 0) count++;
            }

            int[] evens = new int[count];
            int i = 0;
            for (int n : numbers) {
                if (n % 2 == 0) {
                    evens[i] = n;
                    i++;
                }
            }

            return evens;
        }
    }

    public static class FilterThatShit {
        public static void filtering() {
            int[] randomNum = new int[10];
            for (int i = 0; i < randomNum.length; i++) {
                randomNum[i] = (int)(Math.random() * 100);
            }

            System.out.println("Original array: " + Arrays.toString(randomNum));

            int[] evens = ArrayOfEvens.getEvenNumbers(randomNum);
            System.out.println("Even numbers: " + Arrays.toString(evens));
        }
    }

    // 10. Create a class with a static final field that is initialized with a large prime number.
    // Write a program that calculates the next prime number after the value of the field.

    public static class PrimeNumber {
        public static int largePrime = 174739;
    }

    public static class Calculator {
        public static boolean isPrime(int n) {
            if (n <= 1) return false;
            if (n <= 3) return true;
            if (n % 2 == 0 || n % 3 == 0) return false;

            for (int i = 5; i * i <= n; i += 6) {
                if (n % i == 0 || n % (i + 2) == 0) return false;
            }
            return true;
        }

        public static int nextPrime(int start) {
            int num = start + 1;
            while (!isPrime(num)) {
                num++;
            }
            return num;
        }

    }

    public static class RunItUp {
        public static void running() {
            int nextPrime = Calculator.nextPrime(PrimeNumber.largePrime);
            System.out.println("The next prime number is " + nextPrime);
        }
    }

}
