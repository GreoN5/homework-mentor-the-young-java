package homework2.Arrays;

import java.util.Arrays;

public class Task2 {
    public static void main(String[] args) {
        // ---------------------------------------------------------
        // task - 2: Write a program that reads an array and creates a new array from it. Half
        //  of the elements of the new array must exactly be like the second half of the original, and the other half are the same elements, but in reverse order. Bring the new array to the screen.
        //  Example:
        //  Input:
        //  [1, 2, 3, 4, 5, 6, 7, 8, 9, 10]
        //  Output:
        //  [6, 7, 8, 9, 10, 10, 9, 8, 7, 6]
        // ---------------------------------------------------------

        int[] arr = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
        int halfLength = arr.length / 2;

        for (int i = 0; i < arr.length; i++) {
            if (i < halfLength) {
                arr[i] = arr[i + halfLength];
                arr[i + halfLength] = arr[arr.length - 1 - i];
            } else {
                arr[i] = arr[arr.length - 1 - i];
            }
        }

        System.out.println(Arrays.toString(arr));
    }
}
