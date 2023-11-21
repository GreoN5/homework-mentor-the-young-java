package homework5.Task1Car;

public class Car {
    private static final int MAX_GEAR = 5;
    private static final int MIN_GEAR = 1;
    private static final double BASE_COEF_SCRAP = 0.2;
    private static final double COLOR_COEF_SCRAP = 0.05;
    private static final int SPORT_CAR_SPEED = 250;
    private static final int DEFAULT_CURRENT_SPEED = 0;
    private static final int DEFAULT_GEAR = 1;

    String model;
    int maxSpeed;
    int currentSpeed;
    String fuel;
    String color;
    int currentGear;
    double price;
    Person owner;

    Car() {
        currentSpeed = DEFAULT_CURRENT_SPEED;
        currentGear = DEFAULT_GEAR;
    }

    Car(String model, String fuel, String color, int maxSpeed, double price) {
        this();
        this.model = model;
        this.fuel = fuel;
        this.color = color;
        this.maxSpeed = maxSpeed;
        this.price = price;
    }

    void accelerate() {
        if (currentSpeed < maxSpeed) {
            currentSpeed++;
        } else {
            System.out.println("You have reached the max speed of your car.");
        }
    }

    void changeGearUp() {
        if (currentGear == MAX_GEAR) {
            System.out.println("Max gear of 5 reached.");
        } else {
            currentGear++;
        }
    }

    void changeGearDown() {
        if (currentGear == MIN_GEAR) {
            System.out.println("Min gear of 1 reached.");
        } else {
            currentGear--;
        }
    }

    void changeGear(int nextGear) {
        if (nextGear >= MIN_GEAR && nextGear <= MAX_GEAR) {
            currentGear = nextGear;
            System.out.println("Gear changed to: " + nextGear);
        } else {
            System.out.println("Invalid gear!");
        }
    }

    void changeColor(String newColor) {
        String clearColor = newColor.strip();

        if (clearColor.isBlank()) {
            System.out.println("Invalid color.");
        } else {
            color = clearColor;
        }
    }

    boolean isMoreExpensive(Car car) {
        if (car == null) {
            System.out.println("Invalid car!");
            return false;
        }

        return this.price > car.price;
    }

    double calculatePriceForScrap(double metalPrice) {
        double coef = BASE_COEF_SCRAP;
        if (color.equals("black") || color.equals("white")) {
            coef += COLOR_COEF_SCRAP;
        }

        // check if the car is sport car
        if (maxSpeed >= SPORT_CAR_SPEED) {
            coef += COLOR_COEF_SCRAP;
        }

        return price * (metalPrice * coef);
    }

    void assignOwner(Person person) {
        if (owner == null) {
            owner = person;
            System.out.println("Owner of " + model + " is now " + person.name);
        } else {
            System.out.println("There is already owner of " + model + " with the name of " + owner.name);
        }
    }
}
