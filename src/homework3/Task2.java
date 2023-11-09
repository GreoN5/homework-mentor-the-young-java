package homework3;

import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        // ---------------------------------------------------------
        // task - 2: Write a program where the user must enter two strings.
        //    - The program to check which of the two strings is longer.
        //    - The program to print the length of the two strings.
        //
        //    Example:
        //    Input:
        //    short, longString
        //
        //    Output:
        //    The longest string is: longString
        //    short – 5, longString - 10
        // ---------------------------------------------------------

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter a string: ");
        String strA = scanner.nextLine();

        System.out.println("Enter another string: ");
        String strB = scanner.nextLine();

        if (strA.length() > strB.length()) {
            System.out.println("The longest string is: " + strA);
        } else if (strB.length() > strA.length()) {
            System.out.println("The longest string is: " + strB);
        } else {
            System.out.println("Both string are of equal length:");
        }

        System.out.println(strA + " - " + strA.length() + ", " + strB + " - " + strB.length());
    }
}
