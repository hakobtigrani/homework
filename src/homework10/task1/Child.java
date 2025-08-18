package homework10.task1;

public class Child extends Parent {

    @Override
    String showMessage() {
        return super.showMessage() + ". " + "Hello Child class";
    }

}
