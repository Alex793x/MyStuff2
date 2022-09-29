package namethatday;

import java.util.Scanner;

public class DayPick {
    Scanner in = new Scanner(System.in);


    public void dayChoice() {

        int choice = 0;
        do {
            System.out.print("Enter day of Week (1-7): ");
            choice = in.nextInt();
            switch (choice) {
                case 1 -> System.out.println("I call that day " + Days.MONDAY);
                case 2 -> System.out.println("I call that day " + Days.TUESDAY);
                case 3 -> System.out.println("I call that day " + Days.WEDNESDAY);
                case 4 -> System.out.println("I call that day " + Days.THURSDAY);
                case 5 -> System.out.println("I call that day " + Days.FRIDAY);
                case 6 -> System.out.println("I call that day " + Days.SATURDAY);
                case 7 -> System.out.println("I call that day " + Days.SUNDAY);
                default -> System.out.println("I call that Unknown day");
            }
        } while (choice > 0 && choice < 8);
    }
}
