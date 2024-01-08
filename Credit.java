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

        if (!checkCard || !checkSum) {
            System.out.println("Invalid");
            return;
        } 

        long firstDigits = (getDigit(card, cardLength - 1) * 10) + getDigit(card, cardLength - 2);
        
        boolean mastercardDigits = firstDigits >= 51 && firstDigits <= 55;
        boolean amexDigits = firstDigits == 34 || firstDigits == 37;
        boolean visaDigits = firstDigits >= 40 && firstDigits <= 49;

        boolean mastercardLength = cardLength == 16;
        boolean amexLength = cardLength == 15;
        boolean visaLength = cardLength == 13 || cardLength == 16;

        // System.out.println("First Digits: " + firstDigits);
        // System.out.println("Length: " + cardLength);
        // System.out.println("Check Sum: " + checkSum);

        // System.out.println("amexDigitsCheck: " + amexDigits);
        // System.out.println("amexLengthCheck: " + amexLength);

        if (mastercardDigits && mastercardLength) {
            System.out.println("Mastercard");
        } else if (amexDigits && amexLength) {
            System.out.println("Amex");
        } else if (visaDigits && visaLength) {
            System.out.println("Visa");
        } else {
            System.out.println("Invalid");
            return;
        }
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
