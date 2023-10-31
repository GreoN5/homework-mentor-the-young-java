package homework1;

import java.util.Scanner;

public class Task4 {
    public static void main(String[] args) {
        // ---------------------------------------------------
        // task - 4: Please enter 3 numbers from the console (keyboard) - A, B and C.
        // Swap their values in such a way that A takes B's value, B takes C's value and C takes A's old value.
        // ---------------------------------------------------
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter A: ");
        double numberA = scanner.nextDouble();
        System.out.println("Enter B: ");
        double numberB = scanner.nextDouble();
        System.out.println("Enter C: ");
        double numberC = scanner.nextDouble();

        System.out.println("\nBefore swapping: ");
        System.out.println("A: " + numberA);
        System.out.println("B: " + numberB);
        System.out.println("C: " + numberC);

        double pivot = numberA;
        numberA = numberB;
        numberB = numberC;
        numberC = pivot;

        System.out.println("\nAfter swapping: ");
        System.out.println("A: " + numberA);
        System.out.println("B: " + numberB);
        System.out.println("C: " + numberC);
    }
}
