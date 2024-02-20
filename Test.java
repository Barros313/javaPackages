import utilities.Clear;

public class Test {
    public static void main(String args[]) {
        Clear.clearScreen();
<<<<<<< HEAD

        System.out.print("plaintext: ");
        String inputPlaintext = scan.nextLine();

        char plaintext[] = new char[inputPlaintext.length()];
        plaintext = (inputPlaintext).toCharArray();
        scan.close();

        char key[] = new char[alphabetLength];
        key = args[0].toCharArray();

        char ciphertext[] = new char[inputPlaintext.length()];
        for (int i = 0; i < inputPlaintext.length(); i++) {
            ciphertext[i] = switchChar(plaintext[i], key);
        }

        String outputCipherText = ciphertext.toString();

        System.out.print("ciphertext: ");
        for (char i : ciphertext) {
            System.out.print(i);
        }
        System.out.println();
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
=======
        System.out.println("Test");
>>>>>>> c45b030da0fb2ad419dd4d4488b29693b8475dc6
    }
}