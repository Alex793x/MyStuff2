package stensakspapir;

public class Logic {

    static int playerScore = 0;
    static int computerScore = 0;

    public static void displayResult() {
        if (playerScore > computerScore) {
            System.out.println("Du har vundet spillet! din score er " + playerScore + " og modstanders score " +
                    "er " + computerScore);
        } else {
            System.out.println("Du har Tabt spillet! din score er " + playerScore + " og modstanders score " +
                    "er " + computerScore);
        }
    }


    public static void play() {
        Player player = new Player();
        Player computer = new Player();

        for (int i = 0; i < 3; i++) {
            player.humanTurn();
            computer.computerTurn();

            if (player.getChoice().equals("Saks") && computer.getChoice().equals("Papir")) {
                System.out.println("Du vandt!");
                playerScore++;

            } else if (player.getChoice().equals("Sten") && computer.getChoice().equals("Saks")) {
                System.out.println("Du vandt!");
               playerScore++;

            } else if (player.getChoice().equals("Papir") && computer.getChoice().equals("Sten")) {
                System.out.println("Du vandt!");
                playerScore++;

            } else if (player.getChoice().equals("Sten") && computer.getChoice().equals("Papir")) {
                System.out.println("Du tabte!");
                computerScore++;

            } else if (player.getChoice().equals("Saks") && computer.getChoice().equals("Sten")) {
                System.out.println("Du tabte");
                computerScore++;

            } else if (player.getChoice().equals("Papir") && computer.getChoice().equals("Saks")) {
                System.out.println("Du tabte");
                computerScore++;

            } else {
                System.out.println("Uagjort! prøv igen");
                i--;
            }

        }
    }
}
