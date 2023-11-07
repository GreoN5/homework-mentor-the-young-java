package homework2.Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class Task8 {
    public static void main(String[] args) {
        // ---------------------------------------------------------
        // task - 8: Write a program in which the user enters an array,
        //    then turns the elements of the array (this should be a change to affect the array itself) in reverse order and outputs them.
        //    Solve the problem with:
        //    -	one additional array
        //    -	no additional arrays
        // ---------------------------------------------------------

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number of elements in the array: ");
        int n = scanner.nextInt();

        int[] arr = new int[n];

        System.out.println("Enter the elements of the array:");
        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }

        // one additional array
        int[] newArr = new int[arr.length];
        for (int i = 0; i < arr.length; i++) {
            newArr[i] = arr[arr.length - 1 - i];
        }

        System.out.println("Original array: " + Arrays.toString(arr));
        System.out.println("Reversed additional array: " + Arrays.toString(newArr));

        // no additional array
        int left = 0;
        int right = arr.length - 1;

        while (left < right) {
            int temp = arr[left];
            arr[left] = arr[right];
            arr[right] = temp;

            left++;
            right--;
        }

        System.out.println("Original array: " + Arrays.toString(arr));
    }
}
