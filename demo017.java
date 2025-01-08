import java.util.Scanner;

public class demo017 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Prompt user for input
        System.out.print("Enter a number: ");
        int number = scanner.nextInt();

        // Calculate the sum of digits
        int sum = 0;
        while (number > 0) {
            int digit = number % 10; // Extract the last digit
            sum += digit;           // Add it to the sum
            number /= 10;           // Remove the last digit
        }

        // Output the result
        System.out.println("Sum of digits: " + sum);
    }
}