package utilities;

public class Clear {
    public static void clearScreen() {
        String os = System.getProperty("os.name").toLowerCase();

        try {
            if (os.contains("win")) {
                new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();
            } else {
                System.out.println("\033[H\033[2J");
                System.out.flush();
            }
        } catch (Exception exc) {
            System.out.println("Error clearing the screen: " + exc.getMessage());
        }
    }
}
