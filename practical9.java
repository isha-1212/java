
import java.util.Scanner;

public class practical9 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the string: ");
        String inputString = scanner.nextLine();

        // Step 1: Determine the length of the string
        int strLength = inputString.length();
        System.out.println("Length of the string: " + strLength);

        // Step 2: Standardize the string to lower case
        String lowerCaseString = inputString.toLowerCase();
        System.out.println("Standardized string: " + lowerCaseString);

        // Example list of keywords or acronyms
        String[] keywordArray = {"alert", "admin", "login", "secure"};

        // Step 3: Highlight potential keywords or acronyms
        System.out.println("Potential keywords or acronyms found:");
        for (int index = 0; index < keywordArray.length; index++) {
            String currentKeyword = keywordArray[index];
            if (lowerCaseString.indexOf(currentKeyword) != -1) {
                System.out.println("Keyword found: " + currentKeyword);
            }
        }

        // Step 4: Check for palindromes
        System.out.println("Palindromes found:");
        for (int start = 0; start < strLength; start++) {
            for (int end = start + 2; end <= strLength; end++) {
                String substring = lowerCaseString.substring(start, end);
                if (isPalindrome(substring)) {
                    System.out.println("Palindrome found: " + substring);
                }
            }
        }

        // Step 5: Analyze character distribution and frequency
        int[] charFrequency = new int[256]; // Assuming ASCII character set

        for (int i = 0; i < lowerCaseString.length(); i++) {
            char currentChar = lowerCaseString.charAt(i);
            charFrequency[currentChar]++;
        }

        System.out.println("Character frequency distribution:");
        for (int i = 0; i < charFrequency.length; i++) {
            if (charFrequency[i] > 0) {
                System.out.println((char) i + ": " + charFrequency[i]);
            }
        }
        System.out.println("\n BY ISHA PATEL_23DIT045");
    }

    // Method to check if a string is a palindrome
    public static boolean isPalindrome(String text) {
        int leftPointer = 0, rightPointer = text.length() - 1;
        while (leftPointer < rightPointer) {
            if (text.charAt(leftPointer) != text.charAt(rightPointer)) {
                return false;
            }
            leftPointer++;
            rightPointer--;
        }
        return true; // Return true if the string is a palindrome
    }
}
