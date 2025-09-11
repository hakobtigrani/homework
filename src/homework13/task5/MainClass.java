package homework13.task5;

public class MainClass {

    static class Nested {
        void hi() {
            System.out.println("hi");
        }
    }

    public static void main(String[] args) {

        MainClass.Nested nested = new MainClass.Nested();
        nested.hi();

    }
}
