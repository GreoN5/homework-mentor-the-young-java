package homework3;

import java.util.Scanner;

public class Task10 {
    public static void main(String[] args) {
        // ---------------------------------------------------------
        // task - 10: Write a Java program to remove the specific letters from a string and return the new string.
        //    Specific letters: "p", "q", or "r".
        // ---------------------------------------------------------
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter a string: ");
        String str = scanner.nextLine();

        String cleanedStr = str.replaceAll("[pqr]+", "");

        System.out.println("Original string: " + str);
        System.out.println("Cleaned string: " + cleanedStr);
    }
}
