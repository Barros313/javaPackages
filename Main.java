import exercises.*;
import utilities.*;

public class Main {
    public static void main(String args[]) {
        Clear.clearScreen();

        if (args.length < 1) {
            System.out.println("Usage: java 'classname'");
            return;
        }

        String classname = args[0];

        String parameters[] = new String[args.length - 1];
        for (int i = 1; i < args.length; i++) {
            parameters[i - 1] = args[i];
        }

        switch (classname) {
            case "Cash":
                Cash.cashFunction(parameters);
                break;
            case "Credit":
                Credit.credit(parameters);
                break;
            case "MarioLess":
                MarioLess.marioLess(parameters);
                break;
            case "MarioMore":
                MarioMore.marioMore(parameters);
                break;
            case "Scrabble":
                Scrabble.scrabble(parameters);
                break;
            case "Readability":
                Readability.readability(parameters);
                break;
            default:
                System.out.println("Class not found.");
                return;
        }
    }
}