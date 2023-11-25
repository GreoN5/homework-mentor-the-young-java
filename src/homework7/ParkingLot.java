package homework7;

import java.util.Arrays;

public class ParkingLot {
    public static final int NON_OCCUPIED_PARKING = 0;

    private Vehicle[] vehicles;

    public ParkingLot(int capacityOfVehicles) {
        vehicles = new Vehicle[capacityOfVehicles];
    }

    public final int getOccupiedSpacesNumber() {
        return vehicles.length;
    }

    public void listAllVehicles() {
        for (int index = 0; index < vehicles.length; index++) {
            if (vehicles[index] != null) {
                System.out.print("Vehicle at place " + index + ":\n");
                vehicles[index].printVehicleInfo();
                System.out.print("\n");
            }
        }
    }

    public void listVehicleCharacteristics(Vehicle vehicle) {
        vehicle.printVehicleInfo();
    }

    /**
     *
     * @param index - take a vehicle from a certain parking lot
     * @return integer indicating the place of the vehicle taken or -1 if the vehicle does not exist
     */
    public Vehicle takeOutVehicle(int index) {
        if (index < 0 && index > vehicles.length - 1) {
            System.out.println("Invalid parking place.");
            return null;
        } else {
            Vehicle vehicle = vehicles[index];

            if (vehicle == null) {
                System.out.println("There is not any vehicle at this place.");
                return null;
            }

            System.out.println("You have taken: ");
            listVehicleCharacteristics(vehicle);

            vehicles[index] = null;
            vehicle.mount();

            return vehicle;
        }
    }

    public void parkVehicle(int index, Vehicle vehicle) {
        if (index < 0 && index > vehicles.length - 1) {
            System.out.println("Invalid parking place.");
        } else {
            if (vehicle == null) {
                System.out.println("There is not any vehicle provided.");
            } else if (vehicles[index] != null) {
                System.out.println("This parking space is already occupied. You have to find another.");
            } else {
                System.out.println("You have parked the vehicle: ");
                listVehicleCharacteristics(vehicle);

                vehicles[index] = vehicle;
            }
        }
    }

    public void parkMultipleVehicles(Vehicle[] vehicles) {
        if (vehicles.length > this.vehicles.length) {
            System.out.println("There are more vehicles than free parking spaces.");
        } else {
            this.vehicles = Arrays.copyOf(vehicles, this.vehicles.length);
        }
    }
}
