public class Vehicle {
    private final String type;
    private final int speed;
    private final int risk;

    public Vehicle(String type, int speed, int risk) {
        this.type = type;
        this.speed = speed;
        this.risk = risk;
    }

    public int getRisk() {
        return risk;
    }
    public int getSpeed() {
        return speed;
    }
    public String toString() {
        return type;
    }
}
