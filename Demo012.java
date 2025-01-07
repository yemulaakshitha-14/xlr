import java.util.Scanner;

public class Demo012 {
    public static void main(String[] args) {
        // Create a Scanner object to take input from the user
        Scanner scanner = new Scanner(System.in);

        // Ask the user to enter the radius of the circle
        System.out.print("Enter the radius of the circle: ");
        double radius = scanner.nextDouble();

        // Calculate the area of the circle using the formula: area = π * radius^2
        double area = Math.PI * Math.pow(radius, 2);

        // Display the result
        System.out.println("The area of the circle with radius " + radius + " is: " + area);

        // Close the scanner object to prevent memory leaks
        scanner.close();
    }
}