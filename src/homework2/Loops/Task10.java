package homework2.Loops;

import java.util.Scanner;

public class Task10 {
    public static void main(String[] args) {
        // ---------------------------------------------------------
        // Задача 10
        //    -	Да се въведе число от клавиатурата.
        //    -	Програмата да определи дали числото е просто.
        //    -	Какво е просто число? Това което се дели само на 1 и на себе си.
        // ---------------------------------------------------------

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter a number: ");
        int number = scanner.nextInt();

        boolean isPrime = true;

        if (number <= 1) {
            isPrime = false;
        } else if (number == 2 || number == 3) {
            isPrime = true;
        } else {
            for (int i = 4; i <= 9; i++) {
                if (number % i == 0) {
                    isPrime = false;
                    break;
                }
            }
        }

        System.out.println(isPrime ? "Prime number" : "Not a prime number");
    }
}
