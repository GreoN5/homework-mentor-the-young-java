package homework3;

import java.util.Scanner;

public class Task8 {
    public static void main(String[] args) {
        // ---------------------------------------------------------
        // task - 8: Write a program that accepts a single integer from the user.
        //    The program calls the isOdd() method, which accepts an integer and returns a boolean value.
        //    The method to return true if the entered number is odd and false if it is even.
        //    Store the result in a variable and print to the console with an appropriate message.
        // ---------------------------------------------------------

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter a number: ");
        int number = scanner.nextInt();

        boolean isOddNumber = isOdd(number);
        System.out.println(number + (isOddNumber ? " is " : " is not ") + "odd.");
    }

    static boolean isOdd(int num) {
        return num % 2 != 0;
    }
}
