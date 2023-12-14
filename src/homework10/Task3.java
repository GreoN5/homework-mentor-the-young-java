package homework10;

import java.util.*;
import java.util.stream.Collectors;

public class Task3 {
    private static final int MAX_PERCENTAGE = 100;

    public static void main(String[] args) {
        // ---------------------------------------------------------
        // task - 3:
        //    Write a program which displays a list of the most common letters in text entered by the user.
        //    The program to output statistical information about the frequency of occurrence of the letters, not distinguishing between uppercase and lowercase letters.
        //    The letters should be arranged according to the frequency of occurrence in the text. On each line, write the letter, the number of occurrences,
        //    as well as a graph to illustrate the percentage of occurrences (using the "#" symbol).
        //    Example:
        //    Input:
        //    “His name is Slim Shady!”
        //
        //    Output:
        //    Most common letters:
        //    S:  4   ####################
        //    I:   3   ###############
        //    A:  2   ##########
        //    H:  2  ##########
        //    M: 2  ##########
        //    D:  1  #####
        //    E:   1  #####
        //    L:   1  #####
        //    N:  1  #####
        //    Y:   1  #####
        //    Example 2:
        //    Input:
        //    aaaAaAAyAAaA
        //
        //    Output:
        //    Most common letters:
        //    A: 11  ####################
        //    Y:   1  ##
        //    Example 3:
        //    Input:
        //    cbaz
        //
        //    Output:
        //    Most common letters:
        //    A: 1  ####################
        //    B: 1  ####################
        //    C: 1  ####################
        //    Z: 1  ####################
        // ---------------------------------------------------------

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter a text: ");
        String text = scanner.nextLine();

        String cleanString = getCleanString(text);

        while (text.isBlank()) {
            System.out.println("Sorry, you have entered an empty text!");
            System.out.println("Enter a text: ");
            text = scanner.nextLine();

            cleanString = getCleanString(text);
        }

        Map<Character, Integer> letterOccurrences = new TreeMap<>();

        for (int index = 0; index < cleanString.length(); index++) {
            char letter = cleanString.charAt(index);
            char uppercaseLetter = Character.toUpperCase(letter);

            if (letterOccurrences.containsKey(uppercaseLetter)) {
                letterOccurrences.put(uppercaseLetter, letterOccurrences.get(uppercaseLetter) + 1);
            } else {
                letterOccurrences.put(uppercaseLetter, 1);
            }
        }

        Map<Character, Integer> sortedLetterCounts = letterOccurrences.entrySet().stream().sorted((entry1, entry2) -> entry2.getValue().compareTo(entry1.getValue())).
                collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue, (e1, e2) -> e1, LinkedHashMap::new));

        int textLength = cleanString.length();

        System.out.println("Most common letters: ");
        for(Map.Entry<Character, Integer> entry : sortedLetterCounts.entrySet()) {
            char letter = entry.getKey();
            double count = entry.getValue();

            double percentageOfWhole = ((count / textLength) * MAX_PERCENTAGE);

            String graph = "#".repeat((int)percentageOfWhole / 4);
            System.out.println(letter + ": " + (int)count + " " + graph);
        }
    }

    private static String getCleanString(String str) {
        return str.replaceAll("[\\s\\W]", "");
    }
}
