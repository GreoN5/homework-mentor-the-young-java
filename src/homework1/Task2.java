package homework1;

import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        // ---------------------------------------------------------------------
        // task - 2: Please enter 2 different integers from the console (keyboard).
        // Record their sum, difference, product, remainder of division and integer division in separate variables.
        // At the end, please print the results to the console.
        // Do the same, but with numbers that are floating point.
        // ---------------------------------------------------------------------
        Scanner scanner = new Scanner(System.in);

        // integer operations
        System.out.println("Enter first integer value: ");
        int firstIntegerValue = scanner.nextInt();
        System.out.println("Enter second integer value: ");
        int secondIntegerValue = scanner.nextInt();

        int sumInteger = firstIntegerValue + secondIntegerValue;
        int differenceInteger = firstIntegerValue - secondIntegerValue;
        int productInteger = firstIntegerValue * secondIntegerValue;
        int remainderInteger = firstIntegerValue % secondIntegerValue;
        int integerDivisionInteger = firstIntegerValue / secondIntegerValue;

        System.out.println("\nInteger results: ");
        System.out.println("Sum: " + sumInteger);
        System.out.println("Difference: " + differenceInteger);
        System.out.println("Product: " + productInteger);
        System.out.println("Remainder of Division: " + remainderInteger);
        System.out.println("Integer Division: " + integerDivisionInteger);


        // floating point operations
        System.out.println("\nEnter first floating point value: ");
        double firstDoubleValue = scanner.nextDouble();
        System.out.println("Enter second floating point value: ");
        double secondDoubleValue = scanner.nextDouble();

        double sumDouble = firstDoubleValue + secondDoubleValue;
        double differenceDouble = firstDoubleValue - secondDoubleValue;
        double productDouble = firstDoubleValue * secondDoubleValue;
        double remainderDouble = firstDoubleValue % secondDoubleValue;
        double divisionDouble = firstDoubleValue / secondDoubleValue;

        System.out.println("\nFloating point results: ");
        System.out.println("Sum: " + sumDouble);
        System.out.println("Difference: " + differenceDouble);
        System.out.println("Product: " + productDouble);
        System.out.println("Remainder of Division: " + remainderDouble);
        System.out.println("Division: " + divisionDouble);
    }
}
