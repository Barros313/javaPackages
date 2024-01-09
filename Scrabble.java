import utilities.*;
import java.util.Scanner;

public class Scrabble {
    public static void main(String args[]) {
        Clear.clearScreen();
        Scanner scan = new Scanner(System.in);

        System.out.print("Player 1: ");
        String playerOneInput = scan.nextLine();

        System.out.print("Player 2: ");
        String playerTwoInput = scan.nextLine();

        scan.close();

        return;
    }

    static int calculateScore(String input) {
        return 0;
    }
}
