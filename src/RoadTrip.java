import java.util.Scanner;
public class RoadTrip {
    Scanner scan = new Scanner(System.in);

    private String name;
    private int age;
    private Vehicle vehicle;
    private int money;

    public RoadTrip() { money = 1000; };

    public RoadTrip(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public void checkIfCanDrive() {
        if (age >= 18) {
            System.out.println("Ok, you are eligible to drive!");
        } else {
            System.out.println("Hey, you are under the age to drive!");
            System.exit(0);
        }
    }

    public void pickCar() {
        String carPick = "";
        while (!carPick.equals("a") && !carPick.equals("b") && !carPick.equals("c") && !carPick.equals("d")) {
            System.out.println("------------------------------");
            System.out.println("Select a vehicle for the road trip:");
            System.out.println("a. Sedan car");
            System.out.println("b. RV");
            System.out.println("c. Pickup truck");
            System.out.println("d. Golf cart");
            carPick = scan.nextLine();
        }
        vehicle = switch (carPick) {
            case "a" -> new Vehicle("sedan car", (int) (Math.random() * 21 + 50), 1);
            case "b" -> new Vehicle("RV", (int) (Math.random() * 21 + 40), 5);
            case "c" -> new Vehicle("pickup truck", (int) (Math.random() * 21 + 50), 2);
            default -> new Vehicle("golf cart", (int) (Math.random() * 6 + 10), 3);
        };
        System.out.println("Ok, you have chosen a " + vehicle + "! This will go at a speed of " + vehicle.getSpeed() + " miles per hour");
    }

    public void pickDestination() {
        String destPick = "";
        int distance = 0;
        while (!destPick.equals("a") && !destPick.equals("b") && !destPick.equals("c") && !destPick.equals("d")) {
            System.out.println("------------------------------");
            System.out.println("Select a destination:");
            System.out.println("a. Miami");
            System.out.println("b. Chicago");
            System.out.println("c. Boston");
            System.out.println("d. Washington DC");
            destPick = scan.nextLine();
        }
        switch (destPick) {
            case "a" -> {
                distance = 1289;
                destPick = "Miami";
            }
            case "b" -> {
                distance = 790;
                destPick = "Chicago";
            }
            case "c" -> {
                distance = 216;
                destPick = "Boston";
            }
            default -> {
                distance = 226;
                destPick = "Washington DC";
            }
        }
        System.out.println("Ok, you have chosen to go to " + destPick + "! Your " + vehicle +
            " will get there in about " + (distance / vehicle.getSpeed()) + " hours!");
                System.out.println("------------------------------");
    }
}
