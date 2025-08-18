package homework10.task3;

public class Car {

    private int passengerCount;
    private char engineType;

    public int getPassengerCount() {
        return passengerCount;
    }

    public void setPassengerCount(int passengerCount) {
        if (passengerCount < 2) {System.out.println("Error");}
        this.passengerCount = passengerCount;
    }

    public char getEngineType() {
        return engineType;
    }

    public void setEngineType(char engineType) {
        if (!Character.isLetter(engineType)) {System.out.println("Error");}
        this.engineType = engineType;
    }

    public Car(int passengerCount, char engineType) {
        setPassengerCount(passengerCount);
        setEngineType(engineType);
    }

}
