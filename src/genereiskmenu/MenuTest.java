package genereiskmenu;

public class MenuTest {
    public void run() {
        Menu menu = new Menu("MENU", "PleaseChoose",new String[] {"1. Play", "2. Exit"});
        int choice;

        menu.printMenu();
        menu.readChoice();
        choice = menu.readChoice();

        switch (choice) {
            case 1 -> System.out.println("You chose to play");
            case 2 -> System.out.println("You chose to exit");
            default -> {
                System.out.println("you chose an invalid option" + menu.readChoice());
            }
        }

    }

    public static void main(String[] args) {
        MenuTest testMenu = new MenuTest();
        testMenu.run();
    }
}
