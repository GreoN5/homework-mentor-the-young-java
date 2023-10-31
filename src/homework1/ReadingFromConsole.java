package homework1;

import java.util.Scanner;

public class ReadingFromConsole {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter integer value: ");
        int integerNumber = scanner.nextInt();

        System.out.println("Enter floating point value: ");
        double floatingPointNumber = scanner.nextDouble();

        System.out.println("Enter boolean value (true or false): ");
        boolean booleanValue = scanner.nextBoolean();

        System.out.println("Enter single character: ");
        char characterValue = scanner.next().charAt(0);

        System.out.println("Enter string value: ");
        String stringValue = scanner.next();

        System.out.println(
                "Your entered values are: \n"
                + "Integer: " + integerNumber + ", \n"
                + "Floating point number: " + floatingPointNumber + ", \n"
                + "Boolean: " + booleanValue + ", \n"
                + "Char: " + characterValue + ", \n"
                + "String: " + stringValue + "\n");
    }
}
