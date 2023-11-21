import java.util.Scanner;

public class Eat2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("**********");
        System.out.println("Eat v2.0");
        System.out.println("by Ahua");
        System.out.println("**********\n");

        String userInput;
        do {
            System.out.print("Do you want to start eating? (y/n): ");
            userInput = scanner.nextLine();

            if (userInput.equalsIgnoreCase("y")) {
                System.out.println("Feed");
                String feedAgain;
                do {
                    System.out.print("Do you want to feed again? (y/n): ");
                    feedAgain = scanner.nextLine();
                } while (!feedAgain.equalsIgnoreCase("y") && !feedAgain.equalsIgnoreCase("n"));

                if (feedAgain.equalsIgnoreCase("n")) {
                    System.out.println("Eating stops");
                    break;
                }
            } else if (!userInput.equalsIgnoreCase("n")) {
                System.out.println("Invalid input. Please enter 'y' or 'n'.");
            }
        } while (!userInput.equalsIgnoreCase("n"));

        scanner.close();
    }
}
