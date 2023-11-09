package homework3;

import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {
        // ---------------------------------------------------------
        // task - 3: Write a program where the user must enter two strings.
        //    The program should merge the two strings and print the newly obtained one.
        //    Example:
        //    Input:
        //    Hello to; Java world
        //
        //    Output:
        //    Hello to Java world
        // ---------------------------------------------------------

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter a string: ");
        String strA = scanner.nextLine();

        System.out.println("Enter another string: ");
        String strB = scanner.nextLine();

        String concatenatedStr = strA.concat(strB);

        System.out.println("Separated strings: ");
        System.out.println(strA);
        System.out.println(strB);

        System.out.println("Merged strings: ");
        System.out.println(concatenatedStr);
    }
}
