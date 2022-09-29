package stensakspapir;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Player {
    Scanner in = new Scanner(System.in);
    Random random = new Random();
    private final String[] options = {"1: Sten", "2: Saks", "3: Papir"};
    private String choice;

    // GETTER ------------------------
    public String getChoice() {
        return choice;
    }

    // SETTER ------------------------
    public void setChoice(String choice) {
        this.choice = choice;
    }

    public void humanTurn() {
        int humanChoice;
        System.out.println("Please choose a hand! \n" + Arrays.toString(options));
        humanChoice = in.nextInt();

        if (humanChoice == 1) {
            setChoice("Sten");
        } else if (humanChoice == 2) {
            setChoice("Saks");
        } else if (humanChoice == 3) {
            setChoice("Papir");
        }
    }

    public void computerTurn() {
        int computerChoice;
        computerChoice = random.nextInt(options.length);

        if (computerChoice == 1) {
            setChoice("Sten");
        } else if (computerChoice == 2) {
            setChoice("Saks");
        } else {
            setChoice("Papir");
        }
    }
}
