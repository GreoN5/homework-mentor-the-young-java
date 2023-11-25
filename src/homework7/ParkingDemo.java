package homework7;

import java.util.Random;
import java.util.Scanner;

public class ParkingDemo {
    public static int MIN_PEOPLE_IN_VEHICLE = 0;
    public static int MAX_PEOPLE_IN_VEHICLE = 7;
    public static int DRIVER_OCCUPIED_SEAT = 1;

    public static void main(String[] args) {
        ParkingLot parking = new ParkingLot(20);

        Company volvo = new Company("Volvo");
        Company renault = new Company("Renault");
        Company bmw = new Company("BMW");
        Company audi = new Company("Audi");
        Company vw = new Company("VW");

        Bicycle volvoBicycle = new Bicycle(2020, volvo, 1000);
        Bicycle bmwBicycle = new Bicycle(2021, bmw, 1200);

        Car audiCar = new Car(2015, audi, 15000, true, 4, 240, 5, 19, 150);
        Car renaultCar = new Car(2022, renault, 25000, false, 4, 210, 4, 18, 100);

        DirtBike dirtBikeVW = new DirtBike(2019, vw, 4000, 18);
        DirtBike dirtBikeRenault = new DirtBike(2017, renault, 4100, 17);

        Jeep jeepVolvo = new Jeep(2001, volvo, 10000, 2, 190, 5, 21, 170);
        Jeep jeepAudi = new Jeep(2008, audi, 18000, 4, 200, 6, 24, 200);

        RaceMotorcycle raceMotorcycleBWM = new RaceMotorcycle(2017, bmw, 7200, 19);
        RaceMotorcycle raceMotorcycleAudi = new RaceMotorcycle(2012, audi, 6000, 20);

        Scooter scooterRenault = new Scooter(2016, renault, 3000, 12);
        Scooter scooterVolvo = new Scooter(2014, volvo, 3300, 13);

        Skateboard skateboardVW = new Skateboard(2022, vw, 1000, 2);
        Skateboard skateboardVolvo = new Skateboard(2023, volvo, 1100, 2);

        Wagon wagonAudi = new Wagon(2023, audi, 10000, 40, 19, 1);
        Wagon wagonBMW = new Wagon(2020, bmw, 8000, 50, 22, 2);

        Vehicle[] vehicles = new Vehicle[] {
                volvoBicycle, bmwBicycle,
                audiCar, renaultCar,
                dirtBikeVW, dirtBikeRenault,
                jeepAudi, jeepVolvo,
                raceMotorcycleAudi, raceMotorcycleBWM,
                scooterRenault, scooterVolvo,
                skateboardVolvo, skateboardVW,
                wagonAudi, wagonBMW
        };

        parking.parkMultipleVehicles(vehicles);

        Scanner scanner = new Scanner(System.in);
        boolean isOutOfParking = false;

        while (true) {
            System.out.println("Menu - \n" +
                    "1: Take out vehicle\n" +
                    "2: List all vehicles\n" +
                    "3: Exit\n");
            System.out.println("Choose 1 of the options: ");

            int choiceOfAction = scanner.nextInt();
            switch (choiceOfAction) {
                case 1:
                    parking.listAllVehicles();
                    System.out.println("Choose one of the vehicles you want to take out:");

                    int choiceOfVehicle = scanner.nextInt();
                    while (choiceOfVehicle < ParkingLot.NON_OCCUPIED_PARKING || choiceOfVehicle > parking.getOccupiedSpacesNumber()) {
                        System.out.println("Invalid parking space. Please choose another one that is valid in range(" + ParkingLot.NON_OCCUPIED_PARKING + ", " + parking.getOccupiedSpacesNumber() + "):");
                        choiceOfVehicle = scanner.nextInt();
                    }

                    Vehicle chosenVehicle = parking.takeOutVehicle(choiceOfVehicle);
                    Random random = new Random();

                    int passengersToTakeIn = random.nextInt(MIN_PEOPLE_IN_VEHICLE, MAX_PEOPLE_IN_VEHICLE);

                    while(chosenVehicle.hasFreeSeats()) {
                        chosenVehicle.rideAsPassenger();
                    }

                    if (chosenVehicle.getSeats() < passengersToTakeIn) {
                        System.out.println((passengersToTakeIn - chosenVehicle.getSeats() - DRIVER_OCCUPIED_SEAT) + " passengers cannot get into the vehicle.");
                    }

                    Utils.accelerateVehicle(chosenVehicle);

                    System.out.println("1: Start again\n" +
                            "2: Park vehicle");
                    System.out.println("What do you wish to do?: ");

                    int choiceOfContinuing = scanner.nextInt();
                    switch (choiceOfContinuing) {
                        case 1:
                            Utils.accelerateVehicle(chosenVehicle);
                            break;
                        case 2:
                            parking.parkVehicle(choiceOfVehicle, chosenVehicle);
                            break;
                        default:
                            System.out.println("You have chosen not a valid option. Vehicle will be parked.");
                            parking.parkVehicle(choiceOfVehicle, chosenVehicle);
                            break;
                    }

                    break;
                case 2:
                    parking.listAllVehicles();
                    break;
                case 3:
                    isOutOfParking = true;
                    break;
                default:
                    break;
            }

            if (isOutOfParking) {
                break;
            }
        }

        scanner.close();
    }
}
