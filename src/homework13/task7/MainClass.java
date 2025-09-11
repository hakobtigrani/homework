package homework13.task7;

public class MainClass {

    private String string = "hi";

    class Inner {
        void hi() {
            System.out.println(string);
        }
    }

    public static void main(String[] args) {

        MainClass mainClass = new MainClass();
        MainClass.Inner inner = mainClass.new Inner();
        inner.hi();

    }
}
