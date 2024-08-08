
import java.util.Scanner;

public class practical6 {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        // Taking three strings and their repeat counts from the user
        System.out.println("Enter the first string:");
        String str1 = s.nextLine();
        System.out.println("How many times do you want to repeat the first string?");
        int n1 = s.nextInt();
        s.nextLine(); // Consume newline left-over

        System.out.println("Enter the second string:");
        String str2 = s.nextLine();
        System.out.println("How many times do you want to repeat the second string?");
        int n2 = s.nextInt();
        s.nextLine(); // Consume newline left-over

        System.out.println("Enter the third string:");
        String str3 = s.nextLine();
        System.out.println("How many times do you want to repeat the third string?");
        int n3 = s.nextInt();
        s.nextLine(); // Consume newline left-over

        // Repeating the first 3 characters of each string the specified number of times
        String res1 = wanttorepeat(str1, n1);
        System.out.println("Result for the first string: " + res1);

        String res2 = wanttorepeat(str2, n2);
        System.out.println("Result for the second string: " + res2);

        String res3 = wanttorepeat(str3, n3);
        System.out.println("Result for the third string: " + res3);

        System.out.println("\n ISHA PATEL_23DIT045");
    }

    public static String wanttorepeat(String str, int n) {
        int r = 3;

        // Adjust r if the string length is less than 3
        if (r > str.length()) {
            r = str.length();
        }

        // Extract the substring of the first 3 characters (or less if the string is shorter)
        String sc = str.substring(0, r);
        String res = "";

        // Repeat the substring n times
        for (int i = 0; i < n; i++) {
            res += sc;
        }

        return res;
    }
}
