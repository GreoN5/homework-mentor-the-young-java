package homework1;

import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {
        // -----------------------------------------------
        // task - 3: Please enter 2 different numbers from the console (keyboard).
        // As output, they should be printed in ascending order.
        // And then they should be printed in descending order as well.
        // --------------------------------------------------

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter first number: ");
        double firstNumberValue = scanner.nextDouble();
        System.out.println("Enter second number: ");
        double secondNumberValue = scanner.nextDouble();

        double min, max;
        if (firstNumberValue < secondNumberValue) {
            min = firstNumberValue;
            max = secondNumberValue;
        } else {
            min = secondNumberValue;
            max = firstNumberValue;
        }

        if (min == max) {
            System.out.println("Both numbers are equal: ");
            System.out.println(min + ", " + max);
        } else {
            System.out.println("\nAscending order: ");
            System.out.println(min + ", " + max);

            System.out.println("\nDescending Order:");
            System.out.println(max + ", " + min);
        }
    }
}
