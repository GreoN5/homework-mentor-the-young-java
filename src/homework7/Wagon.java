package homework7;

public class Wagon extends FourWheeledVehicle {
    private static final int SEATS = 5;
    private static final int DOORS = 0;
    private static final int MIN_WHEEL_SIZE = 18;
    private static final int MAX_WHEEL_SIZE = 23;
    private static final int MIN_MAX_SPEED = 30;
    private static final int MAX_SPEED = 50;
    private static final int MIN_HORSE_POWERS = 1;
    private static final int MAX_HORSE_POWERS = 2;
    private static final boolean CAN_PERFORM_STUNTS = false;

    public Wagon(int year, Company company, double price, int maxSpeed, int wheelSizeInInches, int horsePowers) {
        super(year, company, price);
        super.setAllWheelDrive(false);

        setDoors(DOORS);
        setSeats(SEATS);
        setMaxSpeed(maxSpeed);
        setWheelSize(wheelSizeInInches);
        setHorsePowers(horsePowers);
        setCanPerformStunts(CAN_PERFORM_STUNTS);
    }

    @Override
    protected void setDoors(int doors) {
        if (doors == DOORS) {
            this.doors = DOORS;
        } else {
            System.out.println("Wagon cannot have doors.");
        }
    }

    @Override
    protected void setMaxSpeed(int maxSpeed) {
        if (maxSpeed >= MIN_MAX_SPEED && maxSpeed <= MAX_SPEED) {
            this.maxSpeed = maxSpeed;
        } else {
            System.out.println("Invalid number of max speed. Please provide a value between " + MIN_MAX_SPEED + " and " + MAX_SPEED);
        }
    }

    @Override
    protected void setSeats(int seats) {
        if (seats == SEATS) {
            this.seats = SEATS;
        } else {
            System.out.println("Wagon cannot have different seats than " + SEATS + ".");
        }
    }

    @Override
    protected void setWheelSize(int wheelSize) {
        if (wheelSize >= MIN_WHEEL_SIZE && wheelSize <= MAX_WHEEL_SIZE) {
            this.wheelSizeInInches = wheelSize;
        } else {
            System.out.println("Invalid number of doors. Please provide a value between " + MIN_WHEEL_SIZE + " and " + MAX_WHEEL_SIZE);
        }
    }

    @Override
    protected void setHorsePowers(int horsePowers) {
        if (horsePowers >= MIN_HORSE_POWERS && horsePowers <= MAX_HORSE_POWERS) {
            this.horsePowers = horsePowers;
        } else {
            System.out.println("Invalid number of doors. Please provide a value between " + MIN_HORSE_POWERS + " and " + MAX_HORSE_POWERS);
        }
    }

    @Override
    public void honk() {
        System.out.println("There is no honk on this type of vehicle");
    }
}
