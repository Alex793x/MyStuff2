package namethatday;

import java.util.Scanner;

public class NameThatDay {
    Scanner in = new Scanner(System.in);


    public void run() {
        DayPick randomDay = new DayPick();
        randomDay.dayChoice();

    }

    public static void main(String[] args) {
        new NameThatDay().run();
    }
}
