package homework2.Loops;

import java.util.Scanner;

public class Task9 {
    public static void main(String[] args) {
        // ---------------------------------------------------------
        // Задача 9
        //    -	Да се разпише програма, която чете числа от клавиатурата.
        //    -	Когато се въведе числото 0, програмата да спре да чете повече числа от конзолата.
        //    -	Да се изведат най-малкото и най-голямото число от всички въведени числа.
        // ---------------------------------------------------------

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter a number: ");
        int number = scanner.nextInt();

        int min, max;
        min = max = number;

        while (number != 0) {
            System.out.println("Enter a number: ");
            number = scanner.nextInt();

            if (number >= max) {
                max = number;
            } else if (number <= min) {
                min = number;
            }
        }

        System.out.println("Min: " + min);
        System.out.println("Max: " + max);
    }
}
