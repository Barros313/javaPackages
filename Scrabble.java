import utilities.*;
import java.util.Scanner;

public class Scrabble {
    public static void main(String args[]) {
        if (args.length != 1) {
            System.err.println("Usage: java Scrabble value");
            return;
        }

        Clear.clearScreen();
        Scanner scan = new Scanner(System.in);

        System.out.print("Player 1: ");
        String playerOneInput = scan.nextLine();

        System.out.print("Player 2: ");
        String playerTwoInput = scan.nextLine();

        System.out.println("1: " + playerOneInput);
        System.out.println("2: " + playerTwoInput);

        scan.close();

        return;
    }

    static int calculateScore(String input) {
        return 0;
    }
}
