package homework1;

import java.util.Scanner;

public class Task6 {
    public static void main(String[] args) {
        // ----------------------------------------------------
        // Please enter 1 four-digit natural number from the keyboard that falls within the range [1000 – 9999].
        // Form 2 new two-digit numbers from the entered number:
        // The first number is formed by the 1st and 4th digits.
        // The second number is formed by the 2nd and 3rd digits.
        // Compare the newly obtained two-digit numbers. Display an appropriate message.
        // ----------------------------------------------------

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter 1 four-digit number that falls within the range [1000 – 9999]: ");
        int number = scanner.nextInt();

        if (number < 1000 || number > 9999) {
            System.out.println("Range of numbers exceeded.");
        } else {
            int fourthDigit = number % 10;
            int thirdDigit = (number / 10) % 10;
            int secondDigit = (number / 100) % 10;
            int firstDigit = (number / 1000) % 10;

            int firstNewNumber = firstDigit * 10 + fourthDigit;
            int secondNewNumber = secondDigit * 10 + thirdDigit;

            if (firstNewNumber > secondNewNumber) {
                System.out.println(firstNewNumber + " > " + secondNewNumber);
            } else {
                System.out.println(firstNewNumber + " < " + secondNewNumber);
            }
        }
    }
}
