package homework3;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Task11 {
    public static void main(String[] args) {
        // ---------------------------------------------------------
        // task - 11: Write a Java program where the user must enter a string - email.
        //    The program should check is this a valid email string or not – use regex.
        //    Display the result in the console.
        // ---------------------------------------------------------

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter an email: ");
        String email = scanner.nextLine();

        Pattern emailPattern = Pattern.compile("^[\\w\\-.\\w]+([^., ][@])([\\w]+\\.){1}+[a-zA-Z]{2,4}$");
        Matcher emailMatcher = emailPattern.matcher(email.trim());

        boolean isValidEmail = emailMatcher.matches();
        if (isValidEmail) {
            System.out.println("Email is valid.");
        } else {
            System.out.println("Email is not valid.");
        }
    }
}
