package homework2.Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {
        // ---------------------------------------------------------
        // task - 3: Write a program that accepts two integers from the user.
        //    Then create an array with 10 elements in the following way:
        //    -	The first 2 elements of the array are the entered number.
        //    -	Each subsequent element of the array is equal to the sum of the previous 2 elements in the array and if the index is:
        //    o	even multiply the sum by 3
        //    o	odd divide the sum by 2
        // ---------------------------------------------------------

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter A: ");
        int numberA = scanner.nextInt();

        System.out.println("Enter B: ");
        int numberB = scanner.nextInt();

        int[] arr = new int[10];
        arr[0] = numberA;
        arr[1] = numberB;

        for (int i = 2; i < arr.length; i++) {
            int previousSum = arr[i - 1] + arr[i - 2];

            if (i % 2 == 0) {
                arr[i] = previousSum * 3;
            } else {
                arr[i] = previousSum / 2;
            }
        }

        System.out.println(Arrays.toString(arr));
    }
}
