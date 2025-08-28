package homework12.task6;

class FirstException extends Exception {
    public FirstException(String message) {
        super(message);
    }
}

class SecondException extends Exception {
    public SecondException(String message) {
        super(message);
    }
}

class ThirdException extends Exception {
    public ThirdException(String message) {
        super(message);
    }
}

public class ExceptionDemo {

    public static void throwAllExceptions(int choice) throws FirstException, SecondException, ThirdException {

        if (choice == 1) {
            throw new FirstException("This is the first exception");
        } else if (choice == 2) {
            throw new SecondException("This is the second exception");
        } else if (choice == 3) {
            throw new ThirdException("This is the third exception");
        }

    }

    public static void main(String[] args) {

        try {
            throwAllExceptions(3);
        } catch (Exception e) {
            System.out.println("Caught exception: " + e.getMessage());
        }

    }
}