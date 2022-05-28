import java.util.ArrayList;

public class GuessGame {
    ArrayList<Player> players = new ArrayList<>();
    boolean win = false;

    public void startGame(int human, int count) {

        for (int i = 0; i < human; i++) {
            Human player = new Human();
            players.add(player);}
        for (int i = 0; i < count - human; i++) {
            Player player = new Player();
            players.add(player);

        }

        int targetNumber = (int) (Math.random() * 10);

        while (!win) {

            System.out.println("I'm thinking of a number between 0 and 9...");

            for (Player player : players) {
                player.guess();
                System.out.println("Player" + player.serial + " guessed " + player.getNumber());
                if (player.getNumber() == targetNumber) {
                    player.setIsRight(true);
                    win = true;
                }

            } if (!win)
                System.out.println("repeat");
                    }
        System.out.println("We have a winner!");
        System.out.println("It was " + targetNumber);


        for (Player player : players)
            System.out.println("Player" + player.serial + " got it right? " + player.getIsRight());
    }
}
