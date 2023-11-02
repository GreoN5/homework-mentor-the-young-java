package homework1;

import java.util.Scanner;

public class Task7 {
    public static void main(String[] args) {
        // ----------------------------------------------------
        // Please enter 2 natural two-digit numbers from the keyboard - A and B.
        // Multiply the two numbers and store the result in a variable.
        // Check if the result is an even number.
        // Check that the last digit of the result is divisible by 3.
        // Display appropriate messages.
        // ----------------------------------------------------

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter A: ");
        int numberA = scanner.nextInt();
        System.out.println("Enter B: ");
        int numberB = scanner.nextInt();

        if (numberA <= 0 || numberB <= 0) {
            System.out.println("Invalid number.");
        } else {
            int resultMultiply = numberA * numberB;

            if (resultMultiply % 2 == 0) {
                System.out.println(resultMultiply + " - even");
            } else {
                System.out.println(resultMultiply + " - odd");
            }

            int lastDigit = resultMultiply % 10;
            if (lastDigit % 3 == 0) {
                System.out.println(lastDigit + " is divisible by 3");
            } else {
                System.out.println(lastDigit + " is not divisible by 3");
            }
        }
    }
}
