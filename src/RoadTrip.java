import java.util.Scanner;
public class RoadTrip {
    Scanner scan = new Scanner(System.in);

    private String name;
    private int age;
    private Vehicle vehicle;
    private String destination;
    private int hours;

    public RoadTrip() {  };

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
            System.out.println("c. Atlanta");
            System.out.println("d. Montreal");
            destPick = scan.nextLine();
        }
        switch (destPick) {
            case "a" -> {
                distance = 1289;
                destination = "Miami";
            }
            case "b" -> {
                distance = 790;
                destination = "Chicago";
            }
            case "c" -> {
                distance = 871;
                destination = "Atlanta";
            }
            default -> {
                distance = 372;
                destination = "Montreal";
            }
        }
        hours = distance / vehicle.getSpeed();
        System.out.println("Ok, you have chosen to go to " + destination + "! Your " + vehicle +
                " will get there in about " + (hours) + " hours!");
        System.out.println("------------------------------");
    }

     public void play() {
        System.out.println("Let the road trip begin!");
        System.out.println("------------------------------");
        for (int i = 0; i < hours;) {
            int hoursTrav = Math.min((int) (Math.random()*6+1), hours-i);
            i += hoursTrav;


            if (hoursTrav == 1) {
                System.out.println("You have gone " + hoursTrav + " hour!");
                System.out.println("------------------------------");
                if (hoursTrav == hours) {
                    System.out.println("Hooray you have made it to " + destination + "!\n------------------------------");
                    System.exit(0);
                }
            } else {
                System.out.println("You have gone " + hoursTrav + " hours!");
                System.out.println("------------------------------");
                if (hoursTrav == hours) {
                    System.out.println("Hooray you have made it to " + destination + "!\n------------------------------");
                    System.exit(0);
                }
            }


            int generateStory = (int) (Math.random() * 7 + 1);

            if (generateStory == 1) {
                System.out.print("Would you like to take a food break? y n ");
                String userAnswer1 = scan.nextLine();
                if (userAnswer1.equals("y")) {
                    int genFoodNum = (int) (Math.random() * 3 + 1);
                    if (genFoodNum == 1) {
                        System.out.println("Ok, you went to go eat at McDonald's");
                    } else if (genFoodNum == 2) {
                        System.out.println("Ok, you went to go eat at Wendy's");
                    } else {
                        System.out.println("Ok, you went to go eat at Arby's");
                    }
                }
            } else if (generateStory == 2) {
                System.out.print("Some math for you so you are not dozing off sleeping while driving: What is 7*6? ");
                int userAnswer2 = scan.nextInt();
                if (userAnswer2 == 42) {
                    System.out.println("Ok, continue driving");
                } else {
                    System.out.println("Cop pulls you over while he spots you sleeping, tells you to put your hands up and brings you to the nearest mental hospital");
                    System.out.println("------------------------------");
                    System.exit(0);
                }
            } else if (generateStory == 3) {
                System.out.print("Cop pulls you over and asks for your driving license. What is your name? ");
                String userAnswer3 = scan.nextLine();
                if (userAnswer3.equals(name)) {
                    System.out.println("Ok, you can pass");
                } else {
                    System.out.println("You have failed the stop. The cop suspects you have a fake ID");
                    System.out.println("------------------------------");
                    System.exit(0);
                }
            } else if (generateStory == 4) {
                System.out.print("There is a road bump in front of you. Enter a speed to pass it successfully: ");
                int userAnswer4 = scan.nextInt();
                if (userAnswer4 >= 7) {
                    System.out.println("Oh no, you went too fast and your " + vehicle + " broke down");
                    System.out.println("------------------------------");
                    System.exit(0);
                } else {
                    System.out.println("Ok, you can pass");
                }
            } else if (generateStory == 5) {
                System.out.print("There is a stop sign ahead, stop or go? ");
                String userAnswer5 = scan.nextLine();
                if (userAnswer5.equals("stop")) {
                    System.out.println("Ok, you can pass");
                } else {
                    System.out.println("Oh no, you went too fast and you hit a pedestrian!\nCops pull up and arrest you");
                    System.out.println("------------------------------");
                    System.exit(0);
                }
            } else if (generateStory == 6) {
                System.out.print("The traffic light is about to turn red, stop or go? ");
                String userAnswer6 = scan.nextLine();
                if (userAnswer6.equals("stop")) {
                    System.out.println("Ok, you can pass");
                } else {
                    System.out.println("Cop spots you zooming past a red light, pulls you over you get a ticket. He tells you next time you do that you are done...");
                    System.out.println("------------------------------");
                }
            } else if (generateStory == 7) {
                System.out.print("You are on the very left lane on the highway and there is someone tailgating you. Let them pass (l) or act stubborn? (a) ");
                String userAnswer7 = scan.nextLine();
                if (userAnswer7.equals("l")) {
                    System.out.println("Ok, they passed you and no conflicts arose");
                } else {
                    System.out.println("BOOM! The angry driver hits your " + vehicle + " from behind and zooms off into the distance...");
                    System.out.println("------------------------------");
                    System.exit(0);
                }
            } else {
                int crashChance = (int) (Math.random() * 5 + 1);
                if (crashChance == vehicle.getRisk()) {
                    int genNum = (int) ((Math.random() * 3 + 1));
                    if (genNum == 1) {
                        System.out.print("Oh no! You were invovled in a multi-vehicle accident!\nYou weren't able to make it to " + destination + " :(");
                    } else if (genNum == 2) {
                        System.out.print("Oh no! You had a head-on accident with a drunk driver!\nYou weren't able to make it to " + destination + " :(");
                    } else {
                        System.out.print("Oh no! You hit the side of the highway by accident!\nYou weren't able to make it to " + destination + " :(");
                    }
                    System.out.println("\n------------------------------");
                    System.exit(0);
                } else {
                    System.out.println("Peaceful driving...");
                }
            }
        }
    }
}