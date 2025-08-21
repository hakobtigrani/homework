package homework11.task6;

public class Print {
    public static void main(String[] args) {

        for (Shape shape : Shape.values()) {
            shape.draw();
        }

    }
}
