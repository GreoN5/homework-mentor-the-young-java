package homework1;

import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        // ---------------------------------------------------
        // task - 1: Read (as input) 3 numbers from the keyboard: A, B & C. The numbers are with floating point (double).
        // Check whether the number C is between A and B.
        // As output, you must display to the user an appropriate message about whether the number C is between the numbers A and B.
        // ---------------------------------------------------
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter A: ");
        double numberA = scanner.nextDouble();
        System.out.println("Enter B: ");
        double numberB = scanner.nextDouble();
        System.out.println("Enter C: ");
        double numberC = scanner.nextDouble();

        boolean isNumberCBetween = (numberA > numberC && numberB < numberC) || (numberA < numberC && numberB > numberC);
        if (isNumberCBetween) {
            System.out.println("Number " + numberC + " is between " + numberA + " and " + numberB);
        } else {
            System.out.println("Number " + numberC + " is not between " + numberA + " and " + numberB);
        }

        // ternary operator solution
        System.out.println("Number " + numberC + (isNumberCBetween ? " is between " : " is not between ") + numberA + " and " + numberB);
    }
}
