package homework11.task3;

public enum TrafficLight {
    RED,
    YELLOW,
    GREEN;

    public TrafficLight getNextLight() {
        switch (this) {
            case RED:
                return YELLOW;
            case YELLOW:
                return GREEN;
            case GREEN:
                return RED;
            default:
                return null;
        }
    }
}
