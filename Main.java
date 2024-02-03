import exercises.*;
import utilities.*;

public class Main {
    public static void main(String args[]) {
        Clear.clearScreen();

        final int numberOfClasses = 9;

        final String classes[] = new String[numberOfClasses];

        classes[0] = "Cash";
        classes[1] = "Credit";
        classes[2] = "MarioLess";
        classes[3] = "MarioMore";
        classes[4] = "Scrabble";
        classes[5] = "Readability";
        classes[6] = "Caesar";
        classes[7] = "Bulbs";
        classes[8] = "Substitution";

        if (args.length < 1) {
            System.out.print("Class availables: \n\n");

            for (String i: classes) {
                System.out.println(i);
            }

            System.out.println("\nUsage: java 'class'");
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
            case "Caesar":
                Caesar.caesar(parameters);
                break;
            case "Bulbs":
                Bulbs.bulbs(parameters);
                break;
            case "Substitution":
                Substitution.substituion(parameters);
                break;
            default:
                System.out.println("Class not found.");
                return;
        }
    }
}