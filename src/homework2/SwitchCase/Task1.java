package homework2.SwitchCase;

import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        // ---------------------------------------------------------
        // Задача 1
        //    -	Да се въведе char от клавиатурата.
        //    -	При въведен char Y / y да се изпринти в конзолата Yes
        //    -	При въведен char N / n да се изпринти в конзолата No
        //    -	Използвайте Switch
        // ---------------------------------------------------------

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter single character: ");
        char characterValue = scanner.next().charAt(0);

        switch (characterValue) {
            case 'Y':
            case 'y':
                System.out.println("Yes");
                break;
            case 'N':
            case 'n':
                System.out.println("No");
                break;
            default:
                System.out.println("Invalid character");
        }
    }
}
