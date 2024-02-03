package exercises;

import utilities.Clear;
import java.util.Scanner;


public class Substitution {
    static final int alphabetLength = 26;
    static char alphabet[] = new char[alphabetLength];

    public static void substituion(String args[]) {
        if (!verifyParameters(args)) {
            return;
        }

        Scanner scan = new Scanner(System.in);
        Clear.clearScreen();

        System.out.print("plaintext: ");
        String inputPlaintext = scan.nextLine();

        char plaintext[] = new char[inputPlaintext.length()];
        plaintext = (inputPlaintext).toCharArray();
        scan.close();

        char defaultKey[] = new char[alphabetLength];
        defaultKey = args[0].toCharArray();

        char key[] = new char[defaultKey.length];

        for (int i = 0; i < defaultKey.length; i++) {
            key[i] = Character.toUpperCase(defaultKey[i]);
        }

        char ciphertext[] = new char[inputPlaintext.length()];
        for (int i = 0; i < inputPlaintext.length(); i++) {
            ciphertext[i] = switchChar(plaintext[i], key);
        }

        String outputCipherText = new String(ciphertext);

        System.out.println("ciphertext: " + outputCipherText);
    }

    static char switchChar(char input, char codedAlphabet[]) {
        if (!Character.isAlphabetic(input)) {
            return input;
        }

        char output = input;

        for (int i = 0; i < alphabetLength; i++) {
            if (Character.toUpperCase(input) == alphabet[i]) {
                if (Character.isUpperCase(input)) {
                    output = codedAlphabet[i];
                } else {
                    output = Character.toLowerCase(codedAlphabet[i]);
                }
            }
        }

        return output;
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

        char characters[] = new char[input[0].length()];
        characters = (input[0].toUpperCase()).toCharArray();

        for (int i = 0; i < alphabetLength; i++) {
            alphabet[i] = (char)(65 + i);
        }

        char verify[] = new char[characters.length];

        for (int i = 0; i < alphabetLength; i++) {
            for (int j = 0; j <alphabetLength; j++) {
                if (characters[i] == alphabet[j]) {
                    verify[j] = 1;
                    break;
                }
            }
        }

        for (int i = 0; i < alphabetLength; i++) {
            if (verify[i] != 1) {
                System.out.println("Invalid alphabet.");
                return false;
            }
        }

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