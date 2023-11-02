package homework1;

import java.util.Scanner;

public class Task5 {
    public static void main(String[] args) {
        // ---------------------------------------------
        // task - 5: Please enter 3 variables from the keyboard - time (integer type), amount of money (floating point number), am I at work (boolean type).
        // Write a program that makes a decision based on the data entered by the user in the following way:
        // If I'm at work, I'll be working and won't be able to go out.
        // If it's a day and I have more than 10$. I will go to the cinema.
        // If it's a day and I have less than 10$. or I don't have money, I'll go for a walk.
        // If it is night and I have more than 20$. I will go to a disco.
        // If it's night and I have less than 20$. I will go to sleep.
        // Display the solution as a message in the console.
        // --------------------------------------------

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter time: ");
        int time = scanner.nextInt();
        System.out.println("Enter amount of money: ");
        double amountOfMoney = scanner.nextDouble();
        System.out.println("Am I at work?: ");
        boolean atWork = scanner.nextBoolean();

        if (atWork) {
            System.out.println("I'll be working and won't be able to go out.");
        } else {
            // check whether it is day time
            if (time <= 18 && time >= 8) {
                if (amountOfMoney >= 10.0) {
                    System.out.println("I will go to the cinema.");
                } else {
                    System.out.println("I don't have money, I'll go for a walk.");
                }
            } else {
                if (amountOfMoney >= 20.0) {
                    System.out.println("I will go to a disco.");
                } else {
                    System.out.println("I will go to sleep.");
                }
            }
        }
    }
}
