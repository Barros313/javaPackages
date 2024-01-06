import utilities.*;
import java.util.Scanner;

public class Credit {
    public static void main(String args[]) {
        Scanner scan = new Scanner(System.in);
        Clear.clearScreen();

        long card = Input.getLong("Number: ", scan);
        int cardLength = Long.toString(card).length();

        boolean checkCard = cardLength >= 13 && cardLength <= 16;
        boolean checkSum = checkSum(card, cardLength);
        
        System.out.println("Card number: " + card);
        System.out.println("Card Length: " + cardLength);
        System.out.println("Sum result: " + checkSum);
        
        if (!checkCard || !checkSum) {
            System.out.println("Invalid");
            return;
        } 

        System.out.println("Valid");
    }

    static boolean checkSum(long input, int inputLength) {
        int sum = 0;

        for (int i = 0; i < inputLength; i++) {
            long digit = getDigit(input, i);
            if (i % 2 != 0) {
                digit *= 2;

                if (digit >= 10) {
                    long sample = getDigit(digit, 1) + getDigit(digit, 0);
                    digit = sample;
                }

                sum += digit;
            } else {
                sum += digit;
            }
        }

        if (sum % 10 != 0) {
            return false;
        }

        return true;
    }

    static long getDigit(long number, int index) {
        if (index == 0)
            return number % 10;

        return getDigit(number / 10, index - 1);
    }
}
