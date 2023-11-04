package homework2.Loops;

import java.util.Scanner;

public class Task7 {
    public static void main(String[] args) {
        // ---------------------------------------------------------
        // Задача 7
        //    -	Да се въведе положително цяло число от потребителя
        //    -	Да се изведе на екрана сбора на всички числа между 1 и въведеното число
        // 1.7.1 Входни данни
        //    •	12
        // 1.7.2 Изход
        //    •	78
        // ---------------------------------------------------------

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter a positive number: ");
        int number = scanner.nextInt();

        if (number <= 0) {
            System.out.println("Number must be positive.");
        } else {
            int sum = 0;
            for (int i = 1; i <= number; i++) {
                sum += i;
            }

            System.out.println("Sum is: " + sum);
        }
    }
}
