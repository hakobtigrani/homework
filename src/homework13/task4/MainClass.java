package homework13.task4;

public class MainClass {

    interface Say {
        void hi();
    }

    public static void main(String[] args) {

        Say say = new Say() {
            @Override
            public void hi() {
                System.out.println("hi");
            }
        };

        say.hi();

    }
}
