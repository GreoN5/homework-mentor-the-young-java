package homework2.Arrays;

import java.util.Arrays;

public class Task11 {
    public static void main(String[] args) {
        // ---------------------------------------------------------
        // task - 11: We have two one-dimensional arrays with natural numbers. Create a program that compares all numbers
        //    with the same indexes from both arrays and writes in a third array the smaller of the two numbers. At the end print the console the following:
        //    -	the content of all three arrays
        //    -	the sum of the three arrays
        //    -	the product of the elements of the last array
        // ---------------------------------------------------------

        int[] firstArr = { 18, 19, 32, 1, 3, 4, 5, 6, 7, 8 };
        int[] secondArr = { 1, 2, 3, 4, 5, 16, 17, 18, 27, 11 };

        if (firstArr.length != secondArr.length) {
            System.out.println("Arrays cannot be compared.");
        } else {
            int[] minValueArr = new int[firstArr.length];

            for (int i = 0; i < minValueArr.length; i++) {
                minValueArr[i] = Math.min(firstArr[i], secondArr[i]);
            }

            System.out.println("First array: " + Arrays.toString(firstArr));
            System.out.println("Second array: " + Arrays.toString(secondArr));
            System.out.println("Third array: " + Arrays.toString(minValueArr));

            int sumOfAllArrays = 0;
            for (int i = 0; i < firstArr.length; i++) {
                sumOfAllArrays += firstArr[i] + secondArr[i] + minValueArr[i];
            }

            System.out.println("The sum of the 3 arrays: " + sumOfAllArrays);

            // calculate product of last array
            int productOfThirdArr = minValueArr[0];
            for (int i = 1; i < minValueArr.length; i++) {
                productOfThirdArr *= minValueArr[i];
            }

            System.out.println("The product of the elements of the third array: " + productOfThirdArr);
        }
    }
}
