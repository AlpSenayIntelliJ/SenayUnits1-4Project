import java.util.Scanner;
public class RoadTrip {
    Scanner scan = new Scanner(System.in);

    private String name;
    private int age;
    private String vehicle;
    private int money;
    private int speed;

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
        System.out.println("a. Sedan car");
        System.out.println("b. RV");
        System.out.println("c. Pickup truck");
        System.out.println("d. Golf cart");
        int speed1 = (int) (Math.random()*21+50);
        int speed2 = (int) (Math.random()*21+40);
        int speed3 = (int) (Math.random()*6+10);
        String carPick = scan.nextLine();
        while (!carPick.equals("a") && !carPick.equals("b") && !carPick.equals("c") && !carPick.equals("d")) {
            System.out.println("------------------------------");
            System.out.println("Please enter a valid input");
            System.out.println("------------------------------");
            System.out.println("Select a vehicle for the road trip:");
            System.out.println("a. Sedan car");
            System.out.println("b. RV");
            System.out.println("c. Pickup truck");
            System.out.println("d. Golf cart");
            carPick = scan.nextLine();
        }
        if (carPick.equals("a")) {
            vehicle = "car";
            System.out.println("Ok, you have chosen a sedan car! This car will go " + speed1 + " miles per hour");
            speed = speed1;
        }
        else if (carPick.equals("b")) {
            vehicle = "RV";
            System.out.println("Ok, you have chosen an RV! This RV will go " + speed2 + " miles per hour");
            speed = speed2;
        }
        else if (carPick.equals("c")) {
            vehicle = "pickup truck";
            System.out.println("Ok, you have chosen a pickup truck! This truck will go " + speed1 + " miles per hour");
            speed = speed1;
        }
        else if (carPick.equals("d")) {
            vehicle = "golf cart";
            System.out.println("Ok, you have chosen a golf cart! This cart will go " + speed3 + " miles per hour");
            speed = speed3;
        }
        else {
            System.out.println("Please enter a valid input");

        }
    }

    public void pickDestination() {
        System.out.println("------------------------------");
        System.out.println("Select a destination:");
        System.out.println("a. Miami");
        System.out.println("b. Chicago");
        System.out.println("c. Boston");
        System.out.println("d. Washington DC");
        String destPick = scan.nextLine();
        int distance = 0;
        while (!destPick.equals("a") && !destPick.equals("b") && !destPick.equals("c") && !destPick.equals("d")) {
            System.out.println("------------------------------");
            System.out.println("Please enter a valid input");
            System.out.println("------------------------------");
            System.out.println("Select a destination:");
            System.out.println("a. Miami");
            System.out.println("b. Chicago");
            System.out.println("c. Boston");
            System.out.println("d. Washington DC");
            destPick = scan.nextLine();
        }
        if (destPick.equals("a")) {
            distance = 1289;
            System.out.println("Ok, you have chosen to go to Miami! Your " + vehicle +
                    " will get there in about " + (distance/speed) + " hours!");
            System.out.println("------------------------------");
        }
        else if (destPick.equals("b")) {
            distance = 790;
            System.out.println("Ok, you have chosen to go to Chicago! Your " + vehicle +
                    " will get there in about " + (distance/speed) + " hours!");
            System.out.println("------------------------------");
        }
        else if (destPick.equals("c")) {
            distance = 216;
            System.out.println("Ok, you have chosen to go to Boston! Your " + vehicle +
                    " will get there in about " + (distance/speed) + " hours!");
            System.out.println("------------------------------");
        }
        else if (destPick.equals("d")) {
            distance = 226;
            System.out.println("Ok, you have chosen to go to Washington DC! Your " + vehicle +
                    " will get there in about " + (distance/speed) + " hours!");
            System.out.println("------------------------------");
        }
        else {
            System.out.println("Please enter a valid input");

        }
    }








}
