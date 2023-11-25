package homework7;

public abstract class Vehicle {
    private static final int MIN_SPEED = 0;
    private static final int EMPTY_SEATS = 0;
    private static final int MIN_SEATS_FOR_DRIVER = 1;
    private static final double COEF_CALCULATE_NEXT_SPEED = 0.1;
    private static final int DRIVE_START_COEF_SPEED = 4;
    private static final int DRIVE_ACCELERATE_COEF_SPEED = 4;

    protected int year;
    protected Company company;
    protected double price;
    protected int seats;
    protected int currentFreeSeats;
    protected int maxSpeed;
    protected int currentSpeed;
    protected int horsePowers;
    protected int wheelSizeInInches;
    protected boolean canPerformStunts;
    private boolean isDriverInside;

    public Vehicle() {
        currentSpeed = MIN_SPEED;
        isDriverInside = false;
    }

    public Vehicle(int year, Company company, double price, int seats, int maxSpeed, int horsePowers) {
        this();

        this.year = year;
        this.company = company;
        this.price = price;
        this.seats = seats;
        currentFreeSeats = seats;
        this.maxSpeed = maxSpeed;
        this.horsePowers = horsePowers;
    }

    public Vehicle(int year, Company company, double price, int seats, int maxSpeed, int wheelSizeInInches, int horsePowers) {
        this(year, company, price, seats, maxSpeed, horsePowers);

        this.wheelSizeInInches = wheelSizeInInches;
    }

    protected void setCanPerformStunts(boolean canPerformStunts) {
        this.canPerformStunts = canPerformStunts;
    }

    public int getSeats() {
        return seats;
    }

    public int getCurrentSpeed() {
        return currentSpeed;
    }

    public void mount() {
        if (currentFreeSeats > EMPTY_SEATS) {
            System.out.println("You are driving the vehicle as a driver.");
            currentFreeSeats--;
            isDriverInside = true;
        } else {
            System.out.println("Vehicle is already fully occupied.");
        }
    }

    public void rideAsPassenger() {
        if (currentFreeSeats == EMPTY_SEATS) {
            System.out.println("Vehicle is already fully occupied.");
        } else {
            if (currentFreeSeats == MIN_SEATS_FOR_DRIVER && !isDriverInside) {
                System.out.println("There is only driver's place in this vehicle.");
                mount();
            } else {
                System.out.println("You are now a passenger in the vehicle.");
                currentFreeSeats--;
            }
        }
    }

    public boolean hasFreeSeats() {
        return currentFreeSeats > EMPTY_SEATS;
    }

    public void drive() {
        currentSpeed += (maxSpeed / DRIVE_START_COEF_SPEED);
        System.out.println("Current speed of vehicle: " + currentSpeed);
    }

    public void accelerate() {
        double newSpeed = currentSpeed + (maxSpeed * COEF_CALCULATE_NEXT_SPEED);

        if (newSpeed >= maxSpeed) {
            System.out.println("Sorry you have reached your max speed of " + maxSpeed + ". You have to slow down.");
            currentSpeed = (maxSpeed / DRIVE_ACCELERATE_COEF_SPEED);
        } else {
            currentSpeed = (int) newSpeed;
            System.out.println("Current speed will be increased by 10% from the max: " + newSpeed);
        }
    }

    public void slowDown() {
        double newSpeed = currentSpeed - (maxSpeed * COEF_CALCULATE_NEXT_SPEED);

        if (newSpeed <= MIN_SPEED) {
            stop();
        } else {
            System.out.println("Current speed will be decreased by 10%: " + newSpeed);
            currentSpeed = (int) newSpeed;
        }
    }

    public void stop() {
        System.out.println("The vehicle has stopped.");
        currentSpeed = MIN_SPEED;
    }

    public void printVehicleInfo() {
        System.out.print(
                "Vehicle:\n" +
                "Year manufacture - " + year + "\n" +
                "Company - " + company.getName() + "\n" +
                "Price - " + price + "\n" +
                "Seats - " + seats + "\n" +
                "Current free seats - " + currentFreeSeats + "\n" +
                "Max speed - " + maxSpeed + "\n" +
                "Horse powers - " + horsePowers + "\n" +
                "Wheel size - " + wheelSizeInInches + "\n");
    }

    public void honk() {
        System.out.println("beep... beep");
    }

    public void performStunt() {
        if (canPerformStunts) {
            System.out.println("Performing stunts...");
        } else {
            System.out.println("Vehicle cannot perform stunts.");
        }
    }
}
