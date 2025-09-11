package homework13.task9;

public class MainClass {

    void method() {

        final String hi = "hi";

        class Inner {
            void hi() {
                System.out.println(hi);
            }
        }

        Inner inner = new Inner();
        inner.hi();

    }

    public static void main(String[] args) {

        MainClass mainClass = new MainClass();
        mainClass.method();

    }

}
