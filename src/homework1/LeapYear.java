package homework1;

public class LeapYear {
    public static void main(String[] args) {
        int year = 2023;

        if ((year % 4 == 0 && year % 100 != 0) || year % 400 == 0) {
            System.out.println("Leap year");
        } else {
            System.out.println("Not a leap year");
        }
    }
}
