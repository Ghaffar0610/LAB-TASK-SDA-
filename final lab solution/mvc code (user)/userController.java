import java.util.Scanner;

public class userController {
    private UserView view;
    private user user;

    public userController(UserView view) {
        this.view = view;
    }

    public void register() {
        user = view.getInputForRegister();
        view.showMessage("User registered successfully!");
    }

    public void login() {
        if (user == null) {
            view.showMessage("No user registered! Please register first.");
            return;
        }
        user userInput = view.getInputForLogin();
        if (userInput.getUserName().equals(user.getUserName()) && userInput.getPassword().equals(user.getPassword())) {
            view.showMessage("Login successful!");
        } else {
            view.showMessage("Invalid credentials! Try again.");
        }
    }

    public void start() {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("1. Register");
            System.out.println("2. Login");
            System.out.println("3. Exit");
            int choice = scanner.nextInt();
            scanner.nextLine(); // consume newline

            switch (choice) {
                case 1:
                    register();
                    break;
                case 2:
                    login();
                    break;
                case 3:
                    return; // Exit
                default:
                    view.showMessage("Invalid choice! Try again.");
            }
        }
    }
}
