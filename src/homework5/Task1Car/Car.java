package homework5.Task1Car;

public class Car extends Vehicle {
    public Car() {
        super();
    }

    public Car(String model, String fuel, String color, int maxSpeed, double price) {
        super(model, fuel, color, maxSpeed, price);
    }

    public Car(String model, String fuel, String color, int maxSpeed, double price, int maxGear) {
        super(model, fuel, color, maxSpeed, price, maxGear);
    }
}
