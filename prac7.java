
// import java.util.Scanner;
// public class CountNines {
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         System.out.println("Enter the size of the array: ");
//         int n = sc.nextInt();
//         int[] arr = new int[n];
//         System.out.println("Enter the elements of the array: ");
//         for (int i = 0; i < n; i++) {
//             arr[i] = sc.nextInt();
//         }
//         int count = 0;
//         for (int i = 0; i < n; i++) {
//             if (arr[i] == 9) {
//                 count++;
//             }
//         }
//         System.out.println("9 is repeating " + count + " times in the array.");
//         System.out.println("\n BY ISHA PATEL_23DIT045");
//     }
// }
import java.util.Scanner;

public class prac7 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the input string: ");
        String str = sc.nextLine();
        String str1 = "fox";
        String str2 = "cat";
        String result = str.replace(str1, str2);
        System.out.println("Modified string: " + result);
        System.out.println("\n BY ISHA PATEL_23DIT045");
    }
}
