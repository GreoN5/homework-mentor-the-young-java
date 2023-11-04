package homework2.Arrays;

import java.util.Arrays;

public class Task4 {
    public static void main(String[] args) {
        // ---------------------------------------------------------
        // task - 4: Write a program that reads an array and print whether it is mirrored. The following arrays are mirrored:
        // ---------------------------------------------------------

        int[] arr = { 3 };

        if (arr.length == 1) {
            System.out.println("Array is mirrored.");
        } else {
            boolean isMirroredArray = false;

            for (int i = 0; i < arr.length / 2; i++) {
                if (arr[i] == arr[arr.length - 1 - i]) {
                    isMirroredArray = true;
                } else {
                    isMirroredArray = false;
                    break;
                }
            }

            System.out.println(isMirroredArray ? "Array is mirrored." : "Array is not mirrored.");
        }
    }
}
