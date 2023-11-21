import java.util.Scanner;

public class Solution3 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Read input: vehicle type, parking time, and payment
        int vehicleType = scanner.nextInt();
        int parkingTime = scanner.nextInt();
        int payment = scanner.nextInt();

        // Define parking fees
        int motorbikeFee = 2000;
        int carFee = 4000;
        int busFee = 9000;

        // Calculate parking fee based on vehicle type and parking time
        int parkingFee = 0;
        switch (vehicleType) {
            case 1:
                parkingFee = motorbikeFee * parkingTime;
                break;
            case 2:
                parkingFee = carFee * parkingTime;
                break;
            case 3:
                parkingFee = busFee * parkingTime;
                break;
        }

        // Check if the payment is exact, not enough, or requires change
        if (payment == parkingFee) {
            System.out.println("Exact money");
        } else if (payment < parkingFee) {
            System.out.println("You don't have enough money");
        } else {
            // Calculate change
            int change = payment - parkingFee;

            // Calculate the denominations of change
            int numTenThousands = change / 10000;
            change %= 10000;

            int numFiveThousands = change / 5000;
            change %= 5000;

            int numFiveHundreds = change / 500;
            change %= 500;

            int numHundreds = change / 100;

            // Print the denominations of change
            System.out.println("You get change of:");
            System.out.println(numTenThousands + " money 10.000");
            System.out.println(numFiveThousands + " money 5.000");
            System.out.println(numFiveHundreds + " coin 500");
            System.out.println(numHundreds + " coin 100");
        }
    }
}