import java.util.Scanner;

public class DEMO7 {
    public static void main(String[] args) {
        // Create a scanner object to take user input
        Scanner scanner = new Scanner(System.in);

        // Get the password input
        System.out.print("Enter your password: ");
        String password = scanner.nextLine();

        // Get the phone number input
        System.out.print("Enter your phone number: ");
        String phoneNumber = scanner.nextLine();

        // Get the age input
        System.out.print("Enter your age: ");
        int age = scanner.nextInt();

        // Display the input values (for demonstration purposes)
        System.out.println("\n--- User Information ---");
        System.out.println("Password: " + password);
        System.out.println("Phone Number: " + phoneNumber);
        System.out.println("Age: " + age);

        // Close the scanner
        scanner.close();
    }
}
