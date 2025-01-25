import java.util.Scanner;

public class demo034 {
    public static void main(String[] args) {
        Scanner s1 = new Scanner(System.in);

        System.out.print("Enter an uppercase character: ");
        char ch = s1.next().charAt(0);

        if (ch >= 'A' && ch <= 'Z') {
            char lowerCaseChar = (char) (ch + 32);
            System.out.println("Lowercase: " + lowerCaseChar);
        } else {
            System.out.println("The entered character is not an uppercase letter.");
        }
    }
}