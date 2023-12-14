package homework10;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class Task2 {
    private static final int RANDOM_NUMBERS_CAPACITY = 20;
    private static final int MIN_NUMBERS_CAPACITY = 1;
    private static final int FIRST_INDEX = 0;
    private static final int MIN_POSSIBLE_NUMBER = 0;
    private static final int MAX_POSSIBLE_NUMBER = 5000;

    public static void main(String[] args) {
        // ---------------------------------------------------------
        // task - 2:
        //    Write a program which creates ArrayList with 20 random numbers between 0 and 5000.
        //    •	The user enters a random number, the program must say if the list contains that number. If yes, show the index, otherwise show appropriate message.
        //    •	Find min and max number in the list.
        //    •	Show all the elements of the list.
        // ---------------------------------------------------------

        Scanner scanner = new Scanner(System.in);
        List<Integer> numbersStorage = new ArrayList<>(RANDOM_NUMBERS_CAPACITY);

        int countRemaining = RANDOM_NUMBERS_CAPACITY;
        while (countRemaining >= MIN_NUMBERS_CAPACITY) {
            Random random = new Random();
            int number = random.nextInt(5001);

            if (numbersStorage.contains(number)) {
                continue;
            }

            numbersStorage.add(number);
            countRemaining--;
        }

        System.out.println("Enter random number in the range of [0-5000]: ");
        int numberInput = scanner.nextInt();

        if (numbersStorage.contains(numberInput)) {
            System.out.println("Number is at " + numbersStorage.indexOf(numberInput) + " position.");
        } else {
            System.out.println("Number is not present in the storage.");
        }

        printMinAndMaxNumberFromList(numbersStorage);

        System.out.println("All numbers: " + numbersStorage);
    }

    private static void printMinAndMaxNumberFromList(List<Integer> nums) {
        if (nums == null) {
            Utils.stopTheSystem("Numbers are invalid.");
        }

        int max = nums.get(FIRST_INDEX);
        int min = nums.get(FIRST_INDEX);

        for (int index = FIRST_INDEX + 1; index < nums.size(); index++) {
            int currentNumber = nums.get(index);

            if (currentNumber > max) {
                max = currentNumber;
            }

            if (currentNumber < min) {
                min = currentNumber;
            }
        }

        System.out.println("Max number is: " + max);
        System.out.println("Min number is: " + min);
    }
}
