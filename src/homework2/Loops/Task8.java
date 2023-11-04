package homework2.Loops;

import java.util.Scanner;

public class Task8 {
    public static void main(String[] args) {
        // ---------------------------------------------------------
        // Задача 8
        //    -	Да се въведе положително цяло число (n).
        //    -	Да се изведе на екрана първите n на брой числа, които се делят на 3.
        //  1.8.1 Входни данни
        //    •	9
        //  1.8.2 Изход
        //    •	3, 6, 9, 12, 15, 18, 21, 24, 27
        // ---------------------------------------------------------

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter a positive number: ");
        int number = scanner.nextInt();

        if (number <= 0) {
            System.out.println("Invalid number.");
        } else {
            int i = 3;
            while(number > 0) {
                if (i % 3 == 0) {
                    System.out.println(i);
                    number--;
                }

                i += 3;
            }
        }
    }
}
