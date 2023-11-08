package homework3;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Task5 {
    public static void main(String[] args) {
        // ---------------------------------------------------------
        // task - 5: Write a program where the user must enter a single word (string).
        //    The program to check if the entered string is a palindrome.
        //    Note: Palindrome – a word that is read left-to-right and right-to-left in the same way.
        //
        //    Example:
        //    Input:
        //    kayak
        //    wow
        //    test
        //
        //    Output:
        //    kayak is palindrome.
        //    wow is palindrome.
        //    test is not a palindrome.
        // ---------------------------------------------------------

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter a string of single word: ");
        String str = scanner.nextLine();

        Pattern oneWordPattern = Pattern.compile("\\w+");
        Matcher oneWordMatcher = oneWordPattern.matcher(str);

        boolean isValidStringOfOneWord = oneWordMatcher.matches();
        if (!isValidStringOfOneWord) {
            System.out.println("You must enter only one word.");
        } else {
            boolean isPalindrome = true;

            for (int i = 0; i < str.length() / 2; i++) {
                if (str.charAt(i) != str.charAt(str.length() - 1 - i)) {
                    isPalindrome = false;
                    break;
                }
            }

            System.out.println(str + (isPalindrome ? " is " : " is not ") + "palindrome.");
        }
    }
}
