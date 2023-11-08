package homework3;

import java.util.Scanner;

public class Task9 {
    public static void main(String[] args) {
        // ---------------------------------------------------------
        // task - 9: Write a program that accepts a single integer from the user (as a string).
        //    The program calls the factorial() method, which accepts an integer and returns the factorial of the given number.
        //    Store the result in a variable and print to the console with an appropriate message.
        // ---------------------------------------------------------

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter a number: ");
        int number = scanner.nextInt();

        int factorialOfNum = factorial(number);
        System.out.println("Factorial of " + number + " is " + factorialOfNum);
    }

    static int factorial(int num) {
        if (num == 0) {
            return 1;
        }

        int result = 1;
        for (int i = 1; i <= num; i++) {
            result *= i;
        }

        return result;
    }
}
