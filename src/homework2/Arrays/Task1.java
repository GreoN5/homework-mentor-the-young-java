package homework2.Arrays;

public class Task1 {
    public static void main(String[] args) {
        // ---------------------------------------------------------
        // task - 1: Write a program that read the array and find the largest number multiple of 5 in the array.
        // ---------------------------------------------------------

        int[] arr = { 1, 4, 5, 2, 7, 10, 14, 55, 17, 25, 15, 12 };

        int max = arr[0];
        for (int num : arr) {
            if (num % 5 == 0 && num >= max) {
                max = num;
            }
        }

        System.out.println("Max divisible by 5 is: " + max);
    }
}
