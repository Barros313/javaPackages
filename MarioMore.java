import utilities.*;

import java.util.Scanner;


public class MarioMore {
    public static void main(String args[]) {
        Scanner scan = new Scanner(System.in);
        Clear.clearScreen();
        
        Integer height = 0;

        while (true) {
            height = Input.getInteger("Height: ", scan);

            boolean isValid = height >= 1 && height <= 8;

            if (isValid)
                break;

            System.out.println("Height must be between range 1 and 8");
        }

        for (int i = 0; i < height; i++) {
            for (int j = height -1; j > i; j--) {
                System.out.print(" ");
            }

            for (int j = 0; j < i + 1; j++) {
                System.out.print("#");
            }

            System.out.print("  ");

            for (int j = 0; j < 1 + i; j++) {
                System.out.print("#");
            }

            System.out.print("\n");
        }
    }
}