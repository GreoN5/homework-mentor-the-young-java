package homework3;

public class Task1 {
    public static void main(String[] args) {
        // ---------------------------------------------------------
        // task - 1: Write a method where the user enters a string that can contain lowercase and uppercase letters.
        //    The size of the string should not be greater than 50.
        //    Print to the console the entered string, but in uppercase letters.
        //    Print to the console the entered string, but in lowercase letters.
        //
        //    Example:
        //    Input:
        //    Hello Java
        //
        //    Output:
        //    HELLO JAVA, hello java
        // ---------------------------------------------------------

        String str = "Hello Java";

        System.out.println("Original string: " + str);

        System.out.println("Modified string: ");
        printToLowerAndUpperCase("Hello Java");
    }

    static void printToLowerAndUpperCase(String str) {
        if (str.length() > 50) {
            System.out.println("String is too long!");
        } else {
            System.out.println(str.toUpperCase().concat(", ").concat(str.toLowerCase()));
        }
    }
}
