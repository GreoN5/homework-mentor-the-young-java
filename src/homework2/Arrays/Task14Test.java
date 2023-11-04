package homework2.Arrays;

import java.util.Arrays;

public class Task14Test {
    public static void main(String[] args) {
        int[][] array = {
                { 1, 2, 3, 4 },
                { 5, 6, 7, 8 },
                { 9, 10, 11, 12 },
                { 13, 14, 15, 16 },
        };

        int[][] newArr = new int[array.length][array[0].length];

        for (int row = 0; row < array.length; row++) {
            int resultArrayRow = 0;

            for (int column = array[row].length - 1; column >= 0; column--) {
                newArr[resultArrayRow][row] = array[row][column];
                resultArrayRow++;
            }
        }

        System.out.println(Arrays.toString(newArr[0]));
        System.out.println(Arrays.toString(newArr[1]));
        System.out.println(Arrays.toString(newArr[2]));
        System.out.println(Arrays.toString(newArr[3]));
    }
}
