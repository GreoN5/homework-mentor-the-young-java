package homework2.Arrays;

import java.util.Scanner;

public class Task14 {
    public static void main(String[] args) {
        // ---------------------------------------------------------
        // task - 14: Enter elements in a two-dimensional array of arbitrary dimension.
        //    Write a program that outputs the values of the elements in a two-dimensional array after it has been rotated by -90 degrees.
        //    Input:
        //	  1,  2,  3,  4
        //    5,  6,  7,  8
        //    9,  10, 11, 12
        //    13, 14, 15, 16
        //
        //    Output:
        //    4, 8, 12, 16
        //    3, 7, 11, 15
        //    2, 6, 10, 14
        //    1, 5,  9, 13
        // ---------------------------------------------------------

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter number of rows of the 2d array: ");
        int rows = scanner.nextInt();

        System.out.print("Enter number of columns of the 2d array: ");
        int columns = scanner.nextInt();

        int[][] arr = new int[rows][columns];

        System.out.print("Enter each number of the array: ");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                arr[i][j] = scanner.nextInt();
            }
        }

        int[][] newArr = new int[rows][columns];

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                newArr[i][j] = arr[j][arr.length - 1 - i];
            }
        }

        System.out.println("Old array: ");
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.print(arr[i][j] + " ");
            }

            System.out.println();
        }

        System.out.println();
        System.out.println();

        System.out.println("New array: ");
        for (int i = 0; i < newArr.length; i++) {
            for (int j = 0; j < newArr[i].length; j++) {
                System.out.print(newArr[i][j] + " ");
            }

            System.out.println();
        }

    }
}
