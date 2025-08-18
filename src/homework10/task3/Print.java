package homework10.task3;

public class Print {
    public static void main(String[] args) {

        Truck t = new Truck(4, 'A', 190);
        System.out.println(
                "Passenger Count: " + t.getPassengerCount() +
                "\nEngine Type: " + t.getEngineType() +
                "\nCapacity: " + t.getCapacity()
        );

    }
}
