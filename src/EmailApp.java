import java.util.Scanner;

public class EmailApp {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Prompt the user for their first name
        System.out.print("Enter your first name: ");
        String firstName = scanner.nextLine();

        // Prompt the user for their last name
        System.out.print("Enter your last name: ");
        String lastName = scanner.nextLine();

        // Create an Email instance with the provided first name and last name
        Email em1 = new Email(firstName, lastName);

        // Display the email information
        System.out.println(em1.showInfo());

        scanner.close();
    }
}
