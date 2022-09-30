package stensakspapir;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Player {
    Scanner in = new Scanner(System.in);
    Random random = new Random();

    // ATTRIBUTES
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
        options(humanChoice);
    }

    public void computerTurn() {
        int computerChoice;
        computerChoice = random.nextInt(options.length);
        options(computerChoice);
    }

    public void options(int playerChoice) {
        if (playerChoice == 1) {
            setChoice("Sten");
        } else if (playerChoice == 2) {
            setChoice("Saks");
        } else {
            setChoice("Papir");
        }
    }
}
