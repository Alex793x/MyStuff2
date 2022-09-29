package stensakspapir;

public class Game {

    public void run() {
        System.out.println("----------------------------------------");
        System.out.println("|   Welcome to STONE, PAPER, SCISSOR   |");
        System.out.println("----------------------------------------");
        Logic.play();
        Logic.displayResult();
    }

    public static void main(String[] args) {
        new Game().run();
    }
}
