import java.util.Scanner;

public class Human extends Player {



    public void guess() {
        Scanner s = new Scanner(System.in);
        do {
            System.out.println("Player" + serial + " needs to enter a number between 0 and 9");
            while (!s.hasNextInt()) {
                System.out.println("That not a number!");
                s.next(); // this is important!
            }
            setNumber(s.nextInt());
        } while (getNumber() > 9 || getNumber() < 0);
        System.out.println("I'm guessing " + getNumber());
    }


    }

