
import java.util.*;

public class practical8 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the string: ");
        String str = sc.nextLine();
        System.out.println("::::::::::Doubled string::::::::::");
        for (int i = 0; i < str.length(); i++) {

            for (int j = 0; j < 2; j++) {

                System.out.print(str.charAt(i));
            }
        }
        System.out.println("\n BY ISHA PATEL_23DIT045");

    }
};
