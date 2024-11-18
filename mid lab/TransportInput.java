import java.util.Scanner;

public class TransportInput {
    public String getTransportChoice() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Select Transport Mode:");
        System.out.println("1. Public Transport (Pay on Spot)");
        System.out.println("2. Own Vehicle (Pay as You Use)");
        System.out.println("3. University Transport (Advance Payment)");
        System.out.print("Enter your choice 1  or  2  or 3 : ");

        return scanner.nextLine();
    }
}

