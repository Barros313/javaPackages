import utilities.*;

import java.util.Scanner;

public class Main {
    public static void main(String args[]) {
        Scanner scan = new Scanner(System.in);
        Clear.clearScreen();
        
        Integer populationStartingSize = 0, populationEndingSize = 0, years = 0;

        while (true) {
            populationStartingSize = Input.getInteger("Starting Size: ", scan);
            
            boolean isValid = populationStartingSize >= 9;
            
            if (isValid)
                break;

            System.out.println("Insert a size bigger than or equal to 9");
        }

        while (true) {
            populationEndingSize =Input.getInteger("Ending Size: ", scan);

            boolean isValid = populationEndingSize >= populationStartingSize;

            if (isValid)
                break;

            System.out.println("Insert a size bigger than or equal to " + populationStartingSize);
        }

        int progress = populationStartingSize;
        while (progress < populationEndingSize) {
            progress += (progress/3) - (progress/4);
            years++;
        }

        System.out.println("Years: " + years);
        scan.close();
    }
}