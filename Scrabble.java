import utilities.*;
import java.util.Scanner;

public class Scrabble {
    public static void main(String args[]) {
        Clear.clearScreen();
        Scanner scan = new Scanner(System.in);

        System.out.print("Player 1: ");
        char playerOneInput[] = scan.nextLine().toCharArray();

        System.out.print("Player 2: ");
        char playerTwoInput[] = scan.nextLine().toCharArray();
        scan.close();

        int playerOneScore = calculateScore(playerOneInput);
        int playerTwoScore = calculateScore(playerTwoInput);

        boolean playerOneWins = playerOneScore > playerTwoScore;
        boolean playerTwoWins = playerOneScore < playerTwoScore;

        if (playerOneWins) {
            System.out.println("Player 1 wins!");
        } else if (playerTwoWins) {
            System.out.println("Player 2 wins!");
        } else {
            System.out.println("Tie!");
        }

        return;
    }

    static int calculateScore(char input[]) {
        final int alphabetLength = 26;
        final int asciiAlphabetFirstLetter = 65;

        char letters[] = new char[alphabetLength];

        for (int i = 0; i < alphabetLength; i++) {
            letters[i] = (char)(i + asciiAlphabetFirstLetter);
        }

        int points[] = {1, 3, 3, 2, 1, 4, 2, 4, 1, 8, 5, 1, 3, 1, 1, 3, 10, 1, 1, 1, 1, 4, 4, 8, 4, 10};

        int score = 0;

        for (int i = 0; i < input.length; i++) {
            for (int j = 0; j < alphabetLength; j++) {
                if (toUpperCase(input[i]) == letters[j]) {
                    score += points[j];
                    break;
                }
            }
        }

        return score;
    }

    static char toUpperCase(char character) {
        boolean lowercase = character >= 97 && character <= 122;

        if (lowercase) {
            return (char)((int)(character) - 32);
        }

        return character;
    }
}
