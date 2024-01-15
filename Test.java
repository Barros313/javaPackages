import utilities.*;
import java.util.Scanner;

public class Test {
    public static void main(String args[]) {
        Scanner scan = new Scanner(System.in);
        Clear.clearScreen();

        System.out.print("Text: ");
        String text = scan.nextLine();
        scan.close();

        char textArray[] = new char[text.length()];
        textArray = text.toCharArray();

        double numberOfWords = 1d;

        for (int i = 0; i < textArray.length; i++) {
            if (textArray[i] == ' ') {
                numberOfWords++;
            }
        }

        double index = Math.round(0.0588 * averageLetter(textArray, numberOfWords) - 0.296 * averageSentences(textArray, numberOfWords) - 15.8);

        boolean highGrade = index >= 16;
        boolean lowGrade = index < 1;

        if (highGrade) {
            System.out.println("Grade 16+");
        } else if (lowGrade) {
            System.out.println("Before Grade 1");
        } else {
            System.out.printf("Grade %.0f", index);
        }
    }

    static double averageLetter(char input[], double words) {
        double nonCharacter = 0d;

        for (int i = 0; i < input.length; i++) {
            if (!Character.isLetter(input[i])) {
                nonCharacter++;
            }
        }

        return (input.length - nonCharacter) / (words / 100);
    }

    static double averageSentences(char input[], double words) {
        double count = 0d;

        for (int i = 0; i < input.length; i++) {
            if (input[i] == '.' || input[i] == '!' || input[i] == '?') {
                count++;
            }
        }

        return count / (words / 100);
    }
}
