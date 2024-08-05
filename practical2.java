
import java.util.Scanner;

public class practical2 {

    private static final char[] letters = {
        'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 'I', 'J', 'K', 'L', 'M', 'N', 'O', 'P', 'Q', 'R', 'S', 'T', 'U', 'V', 'W', 'X', 'Y', 'Z',
        '1', '2', '3', '4', '5', '6', '7', '8', '9', '0'
    };

    private static final String[] morseCode = {
        ".-", "-...", "-.-.", "-..", ".", "..-.", "--.", "....", "..", ".---", "-.-", ".-..", "--", "-.", "---", ".--.", "--.-", ".-.", "...", "-",
        "..-", "...-", ".--", "-..-", "-.--", "--..",
        ".----", "..---", "...--", "....-", ".....", "-....", "--...", "---..", "----.", "-----"
    };

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("**********Choose OPTION**********:");
        System.out.println("1. String to Morse code");
        System.out.println("2. Morse code to String");

        int choice = scanner.nextInt();
        scanner.nextLine();
        if (choice == 1) {
            System.out.print("Enter the string to convert to Morse code: ");
            String in = scanner.nextLine().toUpperCase();
            System.out.println("Morse code is: " + convertToMorse(in));
        } else if (choice == 2) {
            System.out.print("Enter the Morse code to convert to string: ");
            String in = scanner.nextLine();
            System.out.println("String: " + convertToString(in));
        } else {
            System.out.println("Invalid choice!!!");
        }
        System.out.println("\n By ISHA PATEL_23DIT045");

    }

    private static String convertToMorse(String input) {
        StringBuilder morseBuilder = new StringBuilder();
        char[] charArray = input.toCharArray();

        for (int i = 0; i < charArray.length; i++) {
            char c = charArray[i];
            if (c == ' ') {
                morseBuilder.append(" / ");
            } else {
                int index = findLetterIndex(c);
                if (index != -1) {
                    morseBuilder.append(morseCode[index]).append(" ");
                } else {
                    morseBuilder.append("? ");
                }
            }
        }

        return morseBuilder.toString().trim();
    }

    private static String convertToString(String input) {
        StringBuilder stringBuilder = new StringBuilder();
        String[] morseWords = input.split(" / ");

        for (int i = 0; i < morseWords.length; i++) {
            String word = morseWords[i];
            String[] morseChars = word.split(" ");

            for (int j = 0; j < morseChars.length; j++) {
                String morseChar = morseChars[j];
                int index = findMorseIndex(morseChar);
                if (index != -1) {
                    stringBuilder.append(letters[index]);
                } else {
                    stringBuilder.append("?");
                }
            }
            stringBuilder.append(" ");
        }

        return stringBuilder.toString().trim();
    }

    private static int findLetterIndex(char letter) {
        for (int i = 0; i < letters.length; i++) {
            if (letters[i] == letter) {
                return i;
            }
        }
        return -1;
    }

    private static int findMorseIndex(String morse) {
        for (int i = 0; i < morseCode.length; i++) {
            if (morseCode[i].equals(morse)) {
                return i;
            }
        }
        return -1;
    }
}
