import java.util.Scanner;

public class test003 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number of participants: ");
        int numberOfParticipants = scanner.nextInt();
        scanner.nextLine(); 

        boolean allYes = true;
        int i = 1;

        do {
            System.out.println("Participant " + i + ", do you say yes? (yes/no): ");
            String reply = scanner.nextLine();
            if (!reply.equalsIgnoreCase("yes")) {
                allYes = false;
            }
            i++;
        } while (i <= numberOfParticipants);

        if (allYes) {
            for (int j = 0; j < numberOfParticipants; j++) {
                System.out.println("Happy Sankranthi!");
            }
        } else {
            System.out.println("Not everyone said yes.");
        }

        scanner.close();
    }
}