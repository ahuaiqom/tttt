import java.util.Scanner;

public class test  {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input the lower bound and upper bound
        int lowerBound = scanner.nextInt();
        int upperBound = scanner.nextInt();

        if(lowerBound > upperBound) {
            System.out.println("Lower bound is greater than upper bound.");
        } else {
            long sum = 0;
            for (int i = lowerBound; i <= upperBound; i++) {
                if (isPrime(i)) {
                    sum += i;
                }
            }

            System.out.println("Total: " + sum);
        }
    }

    // Function to check if a number is prime
    public static boolean isPrime(int num) {
        if (num <= 1) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(num); i++) {
            if (num % i == 0) {
                return false;
            }
        }
        return true;
    }
}


