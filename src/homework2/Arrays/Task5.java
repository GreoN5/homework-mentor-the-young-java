package homework2.Arrays;

public class Task5 {
    public static void main(String[] args) {
        // ---------------------------------------------------------
        // task - 5: Write a program that creates an array with 10 elements and initializes each of the elements with a value equal to the index of the element multiplied by 4.
        //    Print the array in the console.
        // ---------------------------------------------------------

        int[] arr = new int[10];

        for (int i = 0; i < arr.length; i++) {
            arr[i] = i * 4;
        }

        for (int num: arr) {
            System.out.println(num);
        }
    }
}
