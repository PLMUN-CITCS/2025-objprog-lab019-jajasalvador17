import java.util.Scanner;

public class FactorialCalculator {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int number = getNonNegativeInteger(scanner); // Get valid input
        long factorial = calculateFactorial(number); // Calculate factorial

        System.out.println("The factorial of " + number + " is: " + factorial);
        scanner.close();
    }

    // Method 1: getNonNegativeInteger()
    public static int getNonNegativeInteger(Scanner scanner) {
        int number;
        do {
            System.out.print("Enter a non-negative integer: ");
            number = scanner.nextInt();
            if (number < 0) {
                System.out.println("Invalid input. Please enter a non-negative integer.");
            }
        } while (number < 0);
        return number;
    }

    // Method 2: calculateFactorial(n)
    public static long calculateFactorial(int n) {
        if (n == 0) {
            return 1; // Base case: factorial of 0 is 1
        } else {
            long factorial = 1;
            for (int i = 1; i <= n; i++) {
                factorial *= i;
            }
            return factorial;
        }
    }
}