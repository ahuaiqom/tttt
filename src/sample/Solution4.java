import java.util.Scanner;

public class Solution4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input an integer from the user
        System.out.print("Enter an integer: ");
        int number = scanner.nextInt();

        // Determine if the number is even or odd
        String type;
        if (number % 2 == 0) {
            type = "even";
        } else {
            type = "odd";
        }

        // Determine if the number is small or large
        String size;
        if (number < 50) {
            size = "small";
        } else {
            size = "large";
        }

        // Output the result
        System.out.println(number + " is an " + type + " and " + size + " number");

        // Close the scanner
        scanner.close();
    }
}