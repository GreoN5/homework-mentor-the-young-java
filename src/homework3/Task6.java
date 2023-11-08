package homework3;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Task6 {
    public static void main(String[] args) {
        // ---------------------------------------------------------
        // task - 6: Write a program where the user must enter a string that contains letters and numbers.
        //    The program should output all the numbers from the string, as well as the sum of the numbers.
        //
        //    Example:
        //    Input:
        //    test12ing45how-12this65works
        //
        //    Output:
        //    12
        //    45
        //    -12
        //    65
        //    The sum of all numbers is: 110
        // ---------------------------------------------------------

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter a string letters and numbers: ");
        String str = scanner.nextLine();

        Pattern numbersPattern = Pattern.compile("-?\\d+");
        Matcher numbersMatcher = numbersPattern.matcher(str);

        int sum = 0;
        while (numbersMatcher.find()) {
            String numberStr = numbersMatcher.group();
            int number = Integer.parseInt(numberStr);

            System.out.println(number);
            sum += number;
        }

        System.out.println("The sum of all numbers found in the string is: " + sum);
    }
}
