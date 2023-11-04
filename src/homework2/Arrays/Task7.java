package homework2.Arrays;

public class Task7 {
    public static void main(String[] args) {
        // ---------------------------------------------------------
        // task - 7: Write a program that finds and outputs the longest sequence of identical sequential elements in an array.
        // ---------------------------------------------------------

        int[] arr = { 1, 1, 2, 2, 3, 4, 4, 4, 5, 5, 6, 7, 7, 7, 7, 7, 7, 8, 8, 9, 10 };

        int num = arr[0];
        int maxOccurrences = 1;
        int maxNumOccur = 0;
        int maxNumMaxOccurrences = 0;
        for (int i = 1; i < arr.length; i++) {
            int nextNum = arr[i];

            if (nextNum == num) {
                maxOccurrences++;
            } else {
                if (maxOccurrences > maxNumMaxOccurrences) {
                    maxNumMaxOccurrences = maxOccurrences;
                    maxNumOccur = num;
                }

                num = nextNum;
                maxOccurrences = 1;
            }
        }

        for (int i = 0; i < maxNumMaxOccurrences; i++) {
            System.out.print(maxNumOccur + " ");
        }
    }
}
