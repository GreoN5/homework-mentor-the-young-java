package homework2.Arrays;

import java.util.Arrays;

public class Task9 {
    public static void main(String[] args) {
        // ---------------------------------------------------------
        // task - 9: Write a program that reads array with 10 numbers and exchanged places of elements with indexes:
        //    -	0 and 1, 8 and 9 via third variable
        //    -	2 and 3 by addition / subtraction
        //    -	4 and 5 by multiplication
        //    -	6 and 7 by bitwise operations (optional) or by third variable
        // ---------------------------------------------------------

        int[] arr = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
        System.out.println("Original array: " + Arrays.toString(arr));

        // swap 0 and 1, 8 and 9 elements
        int temp = arr[0];
        arr[0] = arr[1];
        arr[1] = temp;

        temp = arr[8];
        arr[8] = arr[9];
        arr[9] = temp;

        // swap 2 and 3 by addition/subtraction
        arr[2] = arr[2] + arr[3];
        arr[3] = arr[2] - arr[3];
        arr[2] = arr[2] - arr[3];

        // swap 4 and 5 by multiplication
        arr[4] = arr[4] * arr[5];
        arr[5] = arr[4] / arr[5];
        arr[4] = arr[4] / arr[5];

        // swap 6 and 7 by bitwise operations
        arr[6] = arr[6] ^ arr[7];
        arr[7] = arr[6] ^ arr[7];
        arr[6] = arr[6] ^ arr[7];

        System.out.println("Swapped values array: " + Arrays.toString(arr));
    }
}
