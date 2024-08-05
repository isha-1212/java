
import java.util.Scanner;

public class practical3 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter mobile number in the format +91-AA-BBB-CCCCC: ");
        String mobileNumber = scanner.nextLine();

        if (mobileNumber.matches("\\+91-\\d{2}-\\d{3}-\\d{5}")) {

            String[] arr = mobileNumber.split("-");
            String mobileSystemOperator = arr[1];
            String mobileSwitchingCode = arr[2];
            String uniqueSubscriberCode = arr[3];

            System.out.println("Mobile system operator code is: " + mobileSystemOperator);
            System.out.println("MSC is: " + mobileSwitchingCode);
            System.out.println("Unique code is: " + uniqueSubscriberCode);
        } else {
            System.out.println("Invalid mobile number format!!");
        }
        System.out.println("\n By ISHA PATEL_23DIT045");

    }
}
