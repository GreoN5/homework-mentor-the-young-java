package homework3;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Task4 {
    public static void main(String[] args) {
        // ---------------------------------------------------------
        // task - 4: Write a program where the user must enter a string of several words separated by a space.
        //    To print the entered string, but the first letters of the individual words should be uppercase, the rest should be lowercase.
        //    Example:
        //    Input:
        //    mY tEsT stRinG
        //
        //    Output:
        //    My Test String
        // ---------------------------------------------------------

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter a string of several words separated by a space: ");
        String str = scanner.nextLine();
        String trimmedStr = str.trim();

        Pattern severalWordsPattern = Pattern.compile("[A-Za-z ]+$");
        Matcher severalWordsMatcher = severalWordsPattern.matcher(trimmedStr);

        boolean isValidStringOfWords = severalWordsMatcher.matches();
        if (!isValidStringOfWords) {
            System.out.println("You must enter string of words separated by a space.");
        } else {
            String[] words = trimmedStr.split("\\s+");
            StringBuilder capitalizedString = new StringBuilder();

            for (int i = 0; i < words.length; i++) {
                String capitalizedWord = words[i].substring(0, 1).toUpperCase().concat(words[i].substring(1).toLowerCase());
                capitalizedString.append(capitalizedWord).append(i == words.length - 1 ? "" : " ");
            }

            System.out.println("Original string: " + str);
            System.out.println("Capitalized string: " + capitalizedString.toString());
        }
    }
}
