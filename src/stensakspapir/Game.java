package stensakspapir;

public class Game {

    public void run() {
        System.out.println("----------------------------------------");
        System.out.println("|    VELKOMMEN TIL STEN, SAKS, PAPIER   |");
        System.out.println("----------------------------------------");
        Logic.play();
        Logic.displayResult();
    }

    public static void main(String[] args) {
        new Game().run();
    }
}
