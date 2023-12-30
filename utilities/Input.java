package utilities;

import java.util.Scanner;

public class Input {
    public static int getInteger(String request, Scanner scanner) {
        int output = 0;
        boolean exceptionError = true;
        do {
            try {
                System.out.print(request);
                exceptionError = false;
                output = scanner.nextInt();
            } catch (Exception exc) {
                System.out.println("Incompatible input, try again");
                exceptionError = true;
                scanner.next();
            }
        } while (exceptionError);

        return output;
    }
}
