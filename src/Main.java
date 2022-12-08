import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);


        /* brief introduction */
        System.out.println();
        System.out.println("Welcome to Road Trip!");
        System.out.println("---------------------");
        System.out.print("What is your name? ");
        String name = scan.nextLine();
        System.out.print("Hey " + name + ", how old are you? ");
        int age = scan.nextInt();

        /* object created */
        RoadTrip trip = new RoadTrip(name, age);

        /* methods being called on object */
        trip.checkIfCanDrive();
        trip.pickCar();
        trip.pickDestination();
        trip.play();


    }

}
