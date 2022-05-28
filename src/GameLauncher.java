import java.util.Scanner;

public class GameLauncher {
    public static void main(String[] args)  {
        Scanner scanner = new Scanner(System.in);
        GuessGame game = new GuessGame();
                  game.startGame(1, 5);

    }
}