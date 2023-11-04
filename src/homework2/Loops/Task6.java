package homework2.Loops;

import java.util.Scanner;

public class Task6 {
    public static void main(String[] args) {
        // ---------------------------------------------------------
        // Задача 6
        //    -	Да се въведат две разични цели числа от потребителя.
        //    -	Да се изведат на екрана всички числа от интервала.
        //  1.6.1 Входни данни
        //    •	17, 30
        //  1.6.2 Изход
        //    •	17 18 19 20 21 22 23 24 25 26 27 28 29 30
        // ---------------------------------------------------------

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter A: ");
        int numberA = scanner.nextInt();

        System.out.println("Enter B: ");
        int numberB = scanner.nextInt();

        if (numberA > numberB) {
            for (int i = numberB; i <= numberA; i++) {
                System.out.println(i);
            }
        } else if (numberA < numberB) {
            for (int i = numberA; i <= numberB; i++) {
                System.out.println(i);
            }
        } else {
            System.out.println("Both numbers are equal.");
        }
    }
}
