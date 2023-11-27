package homework5.Task1Car;

public class Vehicle {
    private static final int MAX_GEAR_DEFAULT = 5;
    private static final int MIN_GEAR = 1;
    private static final double BASE_COEF_SCRAP = 0.2;
    private static final double COLOR_COEF_SCRAP = 0.05;
    private static final int SPORT_VEHICLE_SPEED = 250;
    private static final int DEFAULT_CURRENT_SPEED = 0;
    private static final int DEFAULT_GEAR = 1;

    private String model;
    private int maxSpeed;
    private int currentSpeed;
    private String fuel;
    private String color;
    private int currentGear;
    private int maxGear;
    private double price;
    private Person owner;

    public Vehicle() {
        currentSpeed = DEFAULT_CURRENT_SPEED;
        currentGear = DEFAULT_GEAR;
    }

    public Vehicle(String model, String fuel, String color, int maxSpeed, double price) {
        this();
        this.model = model;
        this.fuel = fuel;
        this.color = color;
        this.maxSpeed = maxSpeed;
        this.price = price;
        maxGear = MAX_GEAR_DEFAULT;
    }

    public Vehicle(String model, String fuel, String color, int maxSpeed, double price, int maxGear) {
        this();
        this.model = model;
        this.fuel = fuel;
        this.color = color;
        this.maxSpeed = maxSpeed;
        this.price = price;
        this.maxGear = maxGear;
    }

    public String getModel() {
        return model;
    }

    public String getColor() {
        return color;
    }

    public String getFuel() {
        return fuel;
    }

    public int getCurrentSpeed() {
        return currentSpeed;
    }

    public int getMaxSpeed() {
        return maxSpeed;
    }

    public double getPrice() {
        return price;
    }

    public void accelerate() {
        if (currentSpeed < maxSpeed) {
            currentSpeed++;
        } else {
            System.out.println("You have reached the max speed of your vehicle.");
        }
    }

    public void changeGearUp() {
        if (currentGear == maxGear) {
            System.out.println("Max gear of " + maxGear + " is reached.");
        } else {
            currentGear++;
        }
    }

    public void changeGearDown() {
        if (currentGear == MIN_GEAR) {
            System.out.println("Min gear of 1 is reached.");
        } else {
            currentGear--;
        }
    }

    public void changeGear(int nextGear) {
        if (nextGear >= MIN_GEAR && nextGear <= maxGear) {
            currentGear = nextGear;
            System.out.println("Gear changed to: " + nextGear);
        } else {
            System.out.println("Invalid gear!");
        }
    }

    public void changeColor(String newColor) {
        String clearColor = newColor.strip();

        if (clearColor.isBlank()) {
            System.out.println("Invalid color.");
        } else {
            color = clearColor;
        }
    }

    public boolean isMoreExpensive(Vehicle vehicle) {
        if (vehicle == null) {
            System.out.println("Invalid vehicle!");
            return false;
        }

        return this.price > vehicle.price;
    }

    public double calculatePriceForScrap(double metalPrice) {
        double coef = BASE_COEF_SCRAP;
        if (color.equals("black") || color.equals("white")) {
            coef += COLOR_COEF_SCRAP;
        }

        // check if the vehicle is sport type
        if (maxSpeed >= SPORT_VEHICLE_SPEED) {
            coef += COLOR_COEF_SCRAP;
        }

        return price * (metalPrice * coef);
    }

    public void assignOwner(Person person) {
        if (owner == null) {
            owner = person;
            System.out.println("Owner of " + model + " is now " + person.getName());
        } else {
            System.out.println("There is already owner of " + model + " with the name of " + this.owner.getName());
        }
    }
}
