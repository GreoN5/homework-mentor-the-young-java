package homework7;

import java.util.Scanner;

public class Utils {
    private static int STOPPED_VEHICLE_SPEED = 0;

    private Utils() {}

    public static void accelerateVehicle(Vehicle vehicle) {
        Scanner scanner = new Scanner(System.in);
        vehicle.drive();

        while (true) {
            System.out.println("Do you wish to speed up the vehicle?(y/Y/n/N): ");
            char choiceOfSpeeding = scanner.next().charAt(0);

            switch (choiceOfSpeeding) {
                case 'y':
                case 'Y':
                    vehicle.accelerate();
                    break;
                case 'n':
                case 'N':
                    vehicle.slowDown();
                    break;
                default:
                    System.out.println("Invalid choice. Please choose between y/Y/n/N: ");
                    break;
            }

            if (vehicle.getCurrentSpeed() == STOPPED_VEHICLE_SPEED) {
                break;
            }
        }
    }
}
