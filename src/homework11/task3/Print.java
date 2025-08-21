package homework11.task3;

public class Print {
    public static void main(String[] args) {
        TrafficLight light = TrafficLight.RED;

        for (int i = 0; i < 9; i++) {
            System.out.println("Current: " + light);
            light = light.getNextLight();
        }
    }
}
