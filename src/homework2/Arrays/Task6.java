package homework2.Arrays;

import java.util.Arrays;

public class Task6 {
    public static void main(String[] args) {
        // ---------------------------------------------------------
        // task - 6: Write a program that reads 2 arrays, then compares them and displays a message whether they are the same or not.
        // ---------------------------------------------------------

        int[] firstArr = { 1, 2, 3, 4, 5, 6 };
        int[] secondArr = { 1, 2, 3, 4, 5, 6 };

        if (firstArr.length != secondArr.length) {
            System.out.println("Not identical.");
        } else {
            boolean isSameArr = true;

            for (int i = 0; i < firstArr.length; i++) {
                if (firstArr[i] != secondArr[i]) {
                    isSameArr = false;
                    break;
                }
            }

            System.out.println(isSameArr ? "Identical." : "Not identical.");
        }

        // Arrays.compare
        System.out.println(Arrays.compare(firstArr, secondArr) == 0 ? "Identical." : "Not identical.");
    }
}
