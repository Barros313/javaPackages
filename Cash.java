import utilities.*;
import java.util.Scanner;

public class Cash {
    static Scanner scan = new Scanner(System.in);

    public static void main(String args[]) {
        Clear.clearScreen();

        int cents = getCents();

        int quarters = calculateQuarters(cents);
        cents -= quarters * 25;

        int dimes = calculateDimes(cents);
        cents -= dimes * 10;

        int nickels = calculateNickels(cents);
        cents -= nickels * 5;

        int pennies = calculatePennies(cents);
        cents -= cents - pennies;

        int coins = quarters + dimes + nickels + pennies;

        System.out.println(coins);
        scan.close();
    }

    static int getCents() {
        int change = -1;

        while (true) {
            change = Input.getInteger("Change owed: ", scan);

            boolean isValid = change >= 0;

            if (isValid) {
                return change;
            }

            System.out.println("Negative values are not accepted!");
        }
    }

    static int calculateQuarters(int change) {
        return change / 25;
    }

    static int calculateDimes(int change) {
        return change / 10;
    }

    static int calculateNickels(int change) {
        return change / 5;
    }

    static int calculatePennies(int change) {
        return change;
    }
}
