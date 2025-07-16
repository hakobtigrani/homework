package Homework2;

public class Car {

    String model;
    int modelNumber;
    String color;
    int currentSpeed = 0;
    boolean isEngineStart = false;

    public Car(String model, int modelNumber, String color) {
        this.model = model;
        this.modelNumber = modelNumber;
        this.color = color;
    }

    void startEngine() {
        isEngineStart = true;
        System.out.println("The engine is running");
    }

    void stopEngine() {
        isEngineStart = false;
        currentSpeed = 0;
        System.out.println("This engine is not running");
    }

    void printInfo() {
        System.out.println("Model: " + model + ", Model Number: " + modelNumber + ", Color: " + color +
                ", Speed: " + currentSpeed + ", Engine Running: " + isEngineStart);
    }

    public static void main(String[] args) {

        Car mercedesC = new Car("C", 203, "Black");
        Car mercedesS = new Car("S", 505, "White");

        mercedesC.startEngine();
        mercedesS.startEngine();

        mercedesC.printInfo();
        mercedesS.printInfo();

        mercedesC.stopEngine();
        mercedesS.stopEngine();

        mercedesC.printInfo();
        mercedesS.printInfo();

    }
}