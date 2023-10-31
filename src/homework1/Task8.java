package homework1;

import java.util.Scanner;

public class Task8 {
    public static void main(String[] args) {
        // ----------------------------------------------------
        // Please enter a three-digit number from the keyboard, without the digit 0 in this number.
        // Check if the entered number is divisible by each of its digits.
        // ----------------------------------------------------

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter three-digit number without 0 in it: ");
        int number = scanner.nextInt();

        if (number < 111 || number > 999) {
            System.out.println("Number out of range.");
        } else {
            int thirdDigit = number % 10;
            int secondDigit = (number / 10) % 10;
            int firstDigit = number / 100;

            if (firstDigit == 0 || secondDigit == 0 || thirdDigit == 0) {
                System.out.println("Invalid number - contains 0.");
            } else {
                boolean isDivisibleByFirstDigit = number % firstDigit == 0;
                boolean isDivisibleBySecondDigit = number % secondDigit == 0;
                boolean isDivisibleByThirdDigit = number % thirdDigit == 0;

                System.out.println(number + " is " + (isDivisibleByFirstDigit ? "" : "not") + " divisible by its first digit.");
                System.out.println(number + " is " + (isDivisibleBySecondDigit ? "" : "not") + " divisible by its second digit.");
                System.out.println(number + " is " + (isDivisibleByThirdDigit ? "" : "not") + " divisible by its third digit.");
            }
        }
    }
}
