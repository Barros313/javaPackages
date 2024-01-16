package exercises;
import java.util.Scanner;

import utilities.*;

public class Caesar {
    public static void caesar(String args[]) {
        int key = 0;
        boolean validParameter = true;
        
        try {
            key = Integer.parseInt(args[0]);
        } catch(Exception ex) {
            validParameter = false;
        }
        
        if (args.length != 1 || !validParameter) {
            System.out.println("Usage: java Main Caesar [value]");
            return;
        } else if (key < 0) {
            System.out.println("Only compatible with positive integers");
            return;
        }

        Scanner scan = new Scanner(System.in);

        Clear.clearScreen();

        System.out.print("plaintext: ");
        String plaintext = scan.nextLine();
        scan.close();
        
        char plain[] = new char[plaintext.length()];
        plain = plaintext.toCharArray();
        char cipher[] = new char[plaintext.length()];

        for (int i = 0; i < plain.length; i++) {
            if (Character.isAlphabetic(plain[i])) {
                if (Character.isAlphabetic(plain[i] + (key % 26))) {
                    cipher[i] = (char)((int)(plain[i]) + (key % 26));
                } else {
                    cipher[i] = (char)((int)(plain[i]) - (26 - (key % 26)));
                }
            } else {
                cipher[i] = plain[i];
            }
        }

        String ciphertext = new String(cipher);

        System.out.println("ciphertext: " + ciphertext);
    }
}
