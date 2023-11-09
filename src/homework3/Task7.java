package homework3;

import java.util.Scanner;

public class Task7 {
    public static void main(String[] args) {
        // ---------------------------------------------------------
        // task - 7: Write a program that accepts two integers from the user.
        //    The program calls the getTotal() method, which takes two integers and returns their sum.
        //    Store the result in a variable and print to the console.
        // ---------------------------------------------------------

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter number A: ");
        int numberA = scanner.nextInt();

        System.out.println("Enter number B: ");
        int numberB = scanner.nextInt();

        int result = getTotal(numberA, numberB);
        System.out.println("Sum of the numbers is: " + result);
    }

    static int getTotal(int firstNum, int secondNum) {
        return firstNum + secondNum;
    }
}
