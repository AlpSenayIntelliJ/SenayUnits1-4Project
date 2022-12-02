import java.util.Scanner;
public class RoadTrip {
    Scanner scan = new Scanner(System.in);

    private String name;
    private int age;
    private String vehicle;
    private int money;

    public RoadTrip() { money = 1000; };

    public RoadTrip(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public void checkIfCanDrive() {
        if (age >= 18) {
            System.out.println("Ok, you are eligible to drive!");
            System.out.println("------------------------------");
        } else {
            System.out.println("Hey, you are under the age to drive!");
            System.exit(0);
        }
    }

    public void pickCar() {
        System.out.println("Select a vehicle for the road trip:");
        System.out.println("A. Sedan car");
        System.out.println("B. RV");
        System.out.println("C. Pickup truck");
        System.out.println("D. Golf cart");
        int speed1 = (int) (Math.random()*21+50);
        int speed2 = (int) (Math.random()*21+40);
        int speed3 = (int) (Math.random()*6+10)
        String carPick = scan.nextLine();
        if (carPick.equals("A")) {
            vehicle = "car";
            System.out.println("Ok, you have chosen a sedan car! This car will go " + speed1 + " miles per hour");
        }
        else if (carPick.equals("B")) {
            vehicle = "RV";
            System.out.println("Ok, you have chosen an RV! This RV will go " + speed2 + " miles per hour");
        }
        else if (carPick.equals("C")) {
            vehicle = "pickup truck";
            System.out.println("Ok, you have chosen a pickup truck! This truck will go " + speed1 + " miles per hour");
        }
        else if (carPick.equals("D")) {
            vehicle = "golf cart";
            System.out.println("Ok, you have chosen a golf cart! This cart will go " + speed3 + " miles per hour");
        }
        else {
            System.out.println("Please enter a valid input");

        }
    }

    public void pickDestination() {
        System.out.println("------------------------------");
        System.out.println("Select a destination:");
        System.out.println("A. Miami");
        System.out.println("B. Chicago");
        System.out.println("C. Boston");
        System.out.println("D. Washington DC");
        String carPick = scan.nextLine();
        if (carPick.equals("A")) {
            System.out.println("Ok, you have chosen to go to Miami! Your " + vehicle + " will get there in ");
        }
        else if (carPick.equals("B")) {
            System.out.println("Ok, you have chosen to go to Chicago! ");
        }
        else if (carPick.equals("C")) {
            System.out.println("Ok, you have chosen to go to Boston! ");
        }
        else if (carPick.equals("D")) {
            System.out.println("Ok, you have chosen to go to Washington DC! ");
        }
        else {
            System.out.println("Please enter a valid input");

        }
    }








}
