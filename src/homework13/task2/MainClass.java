package homework13.task2;

public class MainClass {

    class MemberInner {
        void hi() {
            System.out.println("hi");
        }
    }

    public static void main(String[] args) {

     MainClass mainClass = new MainClass();
     MainClass.MemberInner memberInner = mainClass.new MemberInner();
     memberInner.hi();

    }
}
