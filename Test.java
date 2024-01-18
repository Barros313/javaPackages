import utilities.Clear;
import utilities.constants.Constant;

import java.util.Scanner;

public class Test {
    static Constant.Length length = new Constant.Length();
    static final int alphabetLength = length.Alphabet("english");
    static char alphabet[] = new char[alphabetLength];

    public static void main(String args[]) {
        if (!verifyParameters(args)) {
            return;
        }

        Clear.clearScreen();
        Scanner scan = new Scanner(System.in);
    }

    static boolean verifyParameters(String input[]) {        
        if (input.length != 1 || !verifyChar(input[0])) {
            System.out.println("Usage: java Main Substitution [key]");
            return false;
        }


        if (input[0].length() != alphabetLength) {
            System.out.println("Key must contain " + alphabetLength + " characters.");
            return false;
        }

        for (int i = 0; i < alphabetLength; i++) {
            alphabet[i] = (char)(65 + i);
        }

        for (char i : alphabet) {
            System.out.print(i);
        }
        System.out.println();


        return true;
    }

    static boolean verifyChar(String input) {
        char inputArray[] = new char[input.length()];
        inputArray = input.toCharArray();

        for (char i : inputArray) {
            if (!Character.isAlphabetic(i)) {
                return false;
            }
        }

        return true;
    }
}
