package homework13.task1;

public class Outer {

    class Inner {
        void hi() {
            System.out.println("hi");
        }
    }

    public static void main(String[] args) {

        Outer outer = new Outer();
        Outer.Inner inner = outer.new Inner();
        inner.hi();

    }
}
