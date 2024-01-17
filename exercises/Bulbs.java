package exercises;
import java.util.Scanner;

import utilities.*;

public class Bulbs {
    static final int BITS_IN_BYTE = 8;
    public static void bulbs(String args[]) {
        Clear.clearScreen();
        Scanner scan = new Scanner(System.in);

        System.out.print("Message: ");
        String input = scan.nextLine();

        scan.close();

        char message[] = new char[input.length()];
        message = input.toCharArray();

        int bit[][] = new int[message.length][BITS_IN_BYTE];

        for (int i = 0; i < message.length; i++) {
            int charValue = (int)(message[i]);

            for (int j = BITS_IN_BYTE - 1; j >= 0; j--) {
                int sample = (int)(Math.pow(2, j));
                if (sample <= charValue) {
                    bit[i][BITS_IN_BYTE - 1 - j] = 1;
                    charValue -= sample;
                }
            }
        }

        for (int i = 0; i < message.length; i++) {
            for (int j = 0; j < BITS_IN_BYTE; j++) {
                System.out.print(bit[i][j]);
            }
            System.out.print("\n");
        }
    }
}
