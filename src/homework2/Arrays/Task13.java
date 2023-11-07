package homework2.Arrays;

import java.util.Scanner;

public class Task13 {
    public static void main(String[] args) {
        // ---------------------------------------------------------
        // task - 13: You have a square two-dimensional array of natural numbers whose values are entered from the console (by the user).
        //    The program should print the sum of each of the diagonals of the array.
        //    Example:
        //    Input:
        //    1, 4, 6, 3
        //    5, 9, 7, 2
        //    4, 8, 1, 9
        //    2, 3, 4, 5
        //
        //    Output:
        //    The main diagonal sum is: 16
        //    The second diagonal sum is: 20
        // ---------------------------------------------------------

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the size of the square matrix: ");
        int matrixSize = scanner.nextInt();

        int[][] matrix = new int[matrixSize][matrixSize];
        System.out.print("Enter each number of the matrix: ");

        for (int i = 0; i < matrixSize; i++) {
            for (int j = 0; j < matrixSize; j++) {
                matrix[i][j] = scanner.nextInt();
            }
        }

        int mainDiagonalSum = 0;
        int secondDiagonalSum = 0;
        for (int i = 0; i < matrixSize; i++) {
            mainDiagonalSum += matrix[i][i];
            secondDiagonalSum += matrix[i][matrixSize - 1 - i];
        }

        System.out.println("The main diagonal sum is: " + mainDiagonalSum);
        System.out.println("The second diagonal sum is: " + secondDiagonalSum);
    }
}
