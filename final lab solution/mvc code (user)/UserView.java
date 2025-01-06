import java.util.Scanner;

public class UserView {
    private Scanner scanner = new Scanner(System.in);

    public void showMessage(String message) {
        System.out.println(message);
    }

    public user getInputForRegister() {
        System.out.println("Enter UserID: ");
        int userID = scanner.nextInt();
        scanner.nextLine(); 
        System.out.println("Enter Username: ");
        String userName = scanner.nextLine();
        System.out.println("Enter Password: ");
        String password = scanner.nextLine();
        return new user(userID, userName, password);
    }

    public user getInputForLogin() {
        System.out.println("Enter UserID: ");
        int userID = scanner.nextInt(); 
        scanner.nextLine(); 
        System.out.println("Enter Username: ");
        String userName = scanner.nextLine();
        System.out.println("Enter Password: ");
        String password = scanner.nextLine();
        return new user(userID, userName, password);
    }
}
