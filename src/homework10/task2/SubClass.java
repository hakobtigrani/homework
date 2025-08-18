package homework10.task2;

public class SubClass extends SuperClass {

    String message = "Hello SubClass class";

    @Override
    String getMessage() {
        return super.getMessage() + ". " +  message;
    }
}
