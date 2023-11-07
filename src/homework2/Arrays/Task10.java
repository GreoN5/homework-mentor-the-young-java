package homework2.Arrays;

public class Task10 {
    public static void main(String[] args) {
        // ---------------------------------------------------------
        // task - 10: A sequence of natural numbers we will call zigzag if the following conditions are met for its elements:
        //    N1 < N2 > N3 < N4 > N5 < … > Ni < Nj > … < Nn
        //    or
        //    N1 > N2 < N3 > N4 < N5 > … < Ni > Nj < … > Nn
        //
        //    Write a program that checks whether a sequence of numbers entered into a one-dimensional array meet the above requirements.
        // ---------------------------------------------------------

        int[] firstArr = { 1, 6, 3, 7, 2, 9, -2, 12, 5 };
        int[] secondArr = { 1, 2, 3, 4, 5, 6, 7, 8, 9 };

        boolean isFirstZigZag = isArrayZigZag(firstArr);
        boolean isSecondZigZag = isArrayZigZag(secondArr);

        System.out.println(isFirstZigZag ? "Array is zig-zag." : "Array is not zig-zag.");
        System.out.println(isSecondZigZag ? "Array is zig-zag." : "Array is not zig-zag.");
    }

    static boolean isArrayZigZag(int[] array) {
        boolean isZigZag = false;
        int length = array.length % 2 == 0 ? array.length - 1 : array.length; // catch index out of bounds exception

        for (int i = 1; i < length; i += 2) {
            if ((array[i] > array[i - 1] && array[i] > array[i + 1]) || (array[i] < array[i - 1] && array[i] < array[i + 1])) {
                if (array.length % 2 == 0 && i == length - 2) {
                    // check for last item in array, since it will not be checked
                    if (array[i + 1] < array[i + 2]) {
                        isZigZag = true;
                        break;
                    }

                    isZigZag = false;
                    break;
                }

                isZigZag = true;
            } else {
                isZigZag = false;
                break;
            }
        }

        return isZigZag;
    }
}
