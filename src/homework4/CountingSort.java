package homework4;

import java.util.Arrays;

public class CountingSort {
    public static void main(String[] args) {
        int[] array = new int[] { 2, 9, 7, 4, -5, 4, 1, 0, 8, 4 };

        System.out.println(Arrays.toString(array));
        countingSort(array);
        System.out.println(Arrays.toString(array));
    }

    static void countingSort(int[] array) {
        int maxNum = array[0];
        int minNum = array[0];

        for (int i = 0; i < array.length; i++) {
            if (array[i] > maxNum) {
                maxNum = array[i];
            }

            if (array[i] < minNum) {
                minNum = array[i];
            }
        }

        int[] countArray = new int[maxNum - minNum + 1];
        for (int i = 0; i < array.length; i++) {
            countArray[array[i] - minNum]++;
        }
        System.out.println(Arrays.toString(countArray));

        int indexCountArr = 0;
        int indexSortedArr = 0;
        while (indexCountArr < countArray.length) {
            if (countArray[indexCountArr] > 0) {
                array[indexSortedArr] = indexCountArr + minNum;

                countArray[indexCountArr]--;
                indexSortedArr++;
            } else {
                indexCountArr++;
            }
        }
    }
}
