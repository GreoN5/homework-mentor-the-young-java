package homework10;

public class Utils {
    private Utils() {}

    public static void stopTheSystem(String message) {
        System.err.println(message);
        System.exit(-1);
    }
}
