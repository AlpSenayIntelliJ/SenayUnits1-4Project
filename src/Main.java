import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Welcome to Road Trip!");
        //trip.border();
        System.out.print("What is your name?");
        String name = scan.nextLine();
        System.out.println();
        System.out.print("Hey " + name + ", how old are you?");
        int age = scan.nextInt();
        //trip.checkIfCanDrive();
    }

}
