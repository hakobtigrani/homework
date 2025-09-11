package homework13.task8;

public class MainClass {

    static class Class {
        void hi() {
            System.out.println("hi");
        }
    }

    public static void main(String[] args) {

        Class anonymous = new Class() {
            @Override
            void hi() {
                System.out.println("hi");
            }
        };

        anonymous.hi();

    }

}
