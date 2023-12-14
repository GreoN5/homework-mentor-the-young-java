package homework10;

import java.util.*;

public class Task1 {
    public static void main(String[] args) {
        // ---------------------------------------------------------
        // task - 1:
        //    Write a program which creates a concordance of characters occurring in a string (i.e., which characters occur where in a string).
        //    Read the string from the command line (by the user).
        //    Example:
        //    Input:
        //    Hello World
        //
        //    Output:
        //    {d=[10], o=[4, 7], r=[8], W=[6], H=[0], l=[2, 3, 9], e=[1]}
        // ---------------------------------------------------------

        Scanner scanner = new Scanner(System.in);

        System.out.println("Write a custom string: ");
        String input = scanner.nextLine();

        String cleanInput = input.strip();

        while (cleanInput.isBlank()) {
            System.out.println("Sorry you have entered an empty string. Please enter non-empty string: ");
            cleanInput = scanner.nextLine().strip();
        }

        Map<Character, ArrayList<Integer>> charOccurrences = new HashMap<>();

        for (int index = 0; index < cleanInput.length(); index++) {
            char inputChar = cleanInput.charAt(index);
            if (Character.isWhitespace(inputChar)) {
                continue;
            }

            if (charOccurrences.containsKey(inputChar)) {
                charOccurrences.get(inputChar).add(index);
            } else {
                ArrayList<Integer> indexesOccurred = new ArrayList<>();
                indexesOccurred.add(index);

                charOccurrences.put(inputChar, indexesOccurred);
            }
        }

        System.out.println(charOccurrences);

        scanner.close();
    }
}
