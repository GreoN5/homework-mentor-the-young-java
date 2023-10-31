package homework1;

import java.util.Scanner;

public class Task11 {
    public static void main(String[] args) {
        // ----------------------------------------------------
        // Please enter a three-digit natural number.
        // Perform a check between each of the three digits of this number and based on the check display a message:
        //	The numbers are equal.
        //	Ascending order.
        //	Descending order.
        //	Try with another number.
        // ----------------------------------------------------

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter a three-digit natural number: ");
        int number = scanner.nextInt();

        if (number >= 100 && number <= 999) {
            int thirdDigit = number % 10;
            int secondDigit = (number / 10) % 10;
            int firstDigit = number / 100;

            if (firstDigit == secondDigit && secondDigit == thirdDigit) {
                System.out.println("The numbers are equal.");
            } else if (firstDigit < secondDigit && secondDigit < thirdDigit) {
                System.out.println("Ascending order.");
            } else if (firstDigit > secondDigit && secondDigit > thirdDigit) {
                System.out.println("Descending order.");
            } else {
                System.out.println("Try with another number.");
            }
        } else {
            System.out.println("Invalid number in range.");
        }
    }
}
