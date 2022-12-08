public class Vehicle {
    /* instance variables */
    private final String type;
    private final int speed;
    private final int risk;

    /* constructor */
    public Vehicle(String type, int speed, int risk) {
        this.type = type;
        this.speed = speed;
        this.risk = risk;
    }

    /* getter methods */
    public int getRisk() {
        return risk;
    }
    public int getSpeed() {
        return speed;
    }

    /* toString method where the type of vehicle is returned */
    public String toString() {
        return type;
    }
}
