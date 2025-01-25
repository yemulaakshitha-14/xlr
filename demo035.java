import java.util.Scanner;

public class demo035 {
    public static void main(String[] args) {
        Scanner s1 = new Scanner(System.in);

        System.out.print("Enter the first number: ");
        int num1 = s1.nextInt();

        System.out.print("Enter the second number: ");
        int num2 = s1.nextInt();

        System.out.println("Before swapping: num1 = " + num1 + ", num2 = " + num2);

        // Swapping using a third variable
        int temp = num1;
        num1 = num2;
        num2 = temp;

        System.out.println("After swapping: num1 = " + num1 + ", num2 = " + num2);
    }
}