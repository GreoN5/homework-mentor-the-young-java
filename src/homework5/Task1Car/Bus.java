package homework5.Task1Car;

public class Bus extends Vehicle {
    private static final int DEFAULT_CAPACITY_PASSENGERS = 15;

    private Person[] passengers;

    public Bus() {
        super();
        passengers = new Person[DEFAULT_CAPACITY_PASSENGERS];
    }

    public Bus(String model, String fuel, String color, int maxSpeed, double price, int passengersCapacity) {
        super(model, fuel, color, maxSpeed, price);
        passengers = new Person[passengersCapacity];
    }

    public Bus(String model, String fuel, String color, int maxSpeed, double price, int maxGear, int passengersCapacity) {
        super(model, fuel, color, maxSpeed, price, maxGear);
        passengers = new Person[passengersCapacity];
    }

    public void addPassenger(Person passenger) {
        for (int index = 0; index < passengers.length; index++) {
            if (passengers[index] == null) {
                passengers[index] = passenger;
                break;
            }
        }
    }

    public void printPassengersInfo() {
        for (int index = 0; index < passengers.length; index++) {
            if (passengers[index] != null) {
                passengers[index].showPersonInfo();
            }
        }
    }
}
