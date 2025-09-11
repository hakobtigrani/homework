package homework13.task3;

public class MainClass {

    void method() {
        class LocalInner {
            void hi() {
                System.out.println("hi");
            }
        }

        LocalInner localInner = new LocalInner();
        localInner.hi();

    }

    public static void main(String[] args) {

        MainClass mainClass = new MainClass();
        mainClass.method();

    }
}
