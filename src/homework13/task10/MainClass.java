package homework13.task10;

public class MainClass {

    static void hi() {
        System.out.println("hi");
    }

    static class StaticClass {

        void method() {
            MainClass.hi();
        }

    }

    public static void main(String[] args) {

        MainClass.StaticClass staticClass = new StaticClass();
        staticClass.method();

    }
}
