package homework4;

import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        // ---------------------------------------------------------
        // task - 1: Напишете метод, който да прочете 2 въведени от потребителя стринга.
        //    Метода трябва да провери дали някой от въведените стрингове е на края на другия (не е case sensitivity).
        //    1.9.1 Входни данни
        //    •	qwerty and rty
        //    •	rty and querty
        //    1.9.2 Изход
        //    •	true
        //    •	true
        // ---------------------------------------------------------
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter a string:");
        String str = scanner.nextLine();

        System.out.println("Enter another string:");
        String strToCompare = scanner.nextLine();

        System.out.println(isAtEndOfString(str, strToCompare));
    }

    static boolean isAtEndOfString(String str, String strToCompare) {
        boolean isAtEnd;
        String lowerCasedStr = str.toLowerCase();
        String lowerCaseStrToCompare = strToCompare.toLowerCase();

        if (lowerCasedStr.length() > lowerCaseStrToCompare.length()) {
            isAtEnd = lowerCasedStr.endsWith(lowerCaseStrToCompare);
        } else {
            isAtEnd = lowerCaseStrToCompare.endsWith(lowerCasedStr);
        }

        return isAtEnd;
    }
}
