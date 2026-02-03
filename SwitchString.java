import java.util.Scanner;

public class SwitchString {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String choice;

        System.out.print("Enter a color: ");
        choice = sc.nextLine();

        switch (choice) {

            case "red":
                System.out.println("STOP");
                break;

            case "green":
                System.out.println("GO");
                break;

            case "yellow":
                System.out.println("READY");
                break;

            default:
                System.out.println("Invalid Color");
                break;
        }

        sc.close();
    }
}
