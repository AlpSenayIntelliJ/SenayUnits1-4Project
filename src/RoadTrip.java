public class RoadTrip {

    private String name;
    private int age;
    private String car;
    private int money;

    public RoadTrip() { money = 1000; };

    public RoadTrip(String name, int age, String car) {
        this.name = name;
        this.age = age;
        this.car = car;
    }

    public void border() {
        System.out.println("Welcome to the Oregon Trail!");
    }

    public void checkIfCanDrive() {
        if (age >= 18) {
            System.out.println("Ok, you are eligible to drive!");
        } else {
            System.out.println("Hey, you are under the age to drive!");
            System.exit(0);
        }
    }








}
