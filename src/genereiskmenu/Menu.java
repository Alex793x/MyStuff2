package genereiskmenu;

import java.util.Arrays;
import java.util.Scanner;

public class  Menu {
    Scanner in = new Scanner(System.in);
    private String menuHeader;
    private String leadText;
    private String[] menuItems;

    // Setter ------------------
    public void setMenuHeader(String menuHeader) {
        this.menuHeader = menuHeader;
    }

    public void setLeadText(String leadText) {
        this.leadText = leadText;
    }

    public void setMenuItems(String[] menuItems) {
        this.menuItems = menuItems;
    }


    // Getter -------------------
    public String getMenuHeader() {
        return menuHeader;
    }

    public String getLeadText() {
        return leadText;
    }

    public String[] getMenuItems() {
        return menuItems;
    }


    //CONSTRUCTOR
    public Menu(String menuHeader, String leadText, String[] menuItems) {
        setMenuHeader(menuHeader);
        setMenuItems(menuItems);
        setLeadText(leadText);

    }

    // Printing Menu
    public void printMenu() {
        System.out.println(getMenuHeader());
        System.out.println(Arrays.toString(getMenuItems()));
        System.out.println(getLeadText());
    }

    public int readChoice() {
        int userInput = 0;
        boolean isInt = true;

        do {
            System.out.println("Please enter number: ");
            if (in.hasNextInt()) {
                userInput = in.nextInt();
                isInt = false;
            } else {
                System.out.println("Not valid input, please enter a number");
            }

        } while (isInt);
        return userInput;
    }

}
