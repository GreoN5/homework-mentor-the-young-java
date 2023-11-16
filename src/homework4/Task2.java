package homework4;

import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        // ---------------------------------------------------------
        // task - 2: Напишете метод, който да прочете въведен от потребителя стринг.
        //    Метода трябва да проверява дали въведения стринг съдържа „щастлив символ“.
        //    Един символ е „щастлив“, когато същия символ се намира от ляво или от дясно на него.
        //    1.10.1 Входни данни
        //    •	azzlea
        //    •	azmzlea
        //    1.10.2 Изход
        //    •	true
        //    •	false
        // ---------------------------------------------------------
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter a string:");
        String str = scanner.nextLine();

        System.out.println(doesStringContainHappySymbol(str));
    }

    static boolean doesStringContainHappySymbol(String str) {
        boolean isHappySymbol = false;

        for (int i = 1; i < str.length() - 1; i += 2) {
            System.out.println(i + " " + str.charAt(i));
            if (str.charAt(i) == str.charAt(i - 1) || str.charAt(i) == str.charAt(i + 1)) {
                isHappySymbol = true;
                break;
            }
        }

        return isHappySymbol;
    }
}
