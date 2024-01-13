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
                Cash.cashFunction(args);
                break;
            case "Credit":
                Credit.credit(args);
                break;
            case "MarioLess":
                MarioLess.marioLess(args);
                break;
            case "MarioMore":
                MarioMore.marioMore(args);
                break;
            case "Scrabble":
                Scrabble.scrabble(args);;
                break;
            default:
                System.out.println("Class not found.");
                return;
        }
        System.out.println("Finished.");
    }
}