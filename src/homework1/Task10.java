package homework1;

import java.util.Scanner;

public class Task10 {
    public static void main(String[] args) {
        // ----------------------------------------------------
        // Please enter a natural number from the keyboard in the range [0-24].
        // Based on the number entered, print a message that welcomes you. Business logic should be based on the following intervals:
        //	5-10 – Good morning
        //	11-18 – Good day
        //	19-23 – Good evening
        //	24-5 – Why aren't you sleeping?
        // ----------------------------------------------------

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter an integer in the range [0-24]: ");
        int number = scanner.nextInt();

        if (number < 0 || number > 24) {
            System.out.println("Invalid number of range.");
        } else {
            if (number == 24 || number <= 5) {
                System.out.println("Why aren't you sleeping?");
            } else if (number <= 10) {
                System.out.println("Good morning.");
            } else if (number <= 18) {
                System.out.println("Good day.");
            } else {
                System.out.println("Good evening.");
            }
        }
    }
}
