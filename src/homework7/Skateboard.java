package homework7;

public class Skateboard extends FourWheeledVehicle {
    private static final int SEATS = 1;
    private static final int DOORS = 0;
    private static final int MIN_WHEEL_SIZE = 2;
    private static final int MAX_WHEEL_SIZE = 3;
    private static final int MAX_SPEED = 20;
    private static final int HORSE_POWERS = 0;
    private static final boolean CAN_PERFORM_STUNTS = true;


    public Skateboard(int year, Company company, double price, int wheelSizeInInches) {
        super(year, company, price);
        super.setAllWheelDrive(false);

        setDoors(DOORS);
        setSeats(SEATS);
        setMaxSpeed(MAX_SPEED);
        setWheelSize(wheelSizeInInches);
        setHorsePowers(HORSE_POWERS);
        setCanPerformStunts(CAN_PERFORM_STUNTS);
    }

    @Override
    protected void setDoors(int doors) {
        if (doors == DOORS) {
            this.doors = DOORS;
        } else {
            System.out.println("Skateboard cannot have doors.");
        }
    }

    @Override
    protected void setMaxSpeed(int maxSpeed) {
        if (maxSpeed == MAX_SPEED) {
            this.maxSpeed = MAX_SPEED;
        } else {
            System.out.println("Skateboard cannot have different max speed than " + MAX_SPEED + ".");
        }
    }

    @Override
    protected void setSeats(int seats) {
        if (seats == SEATS) {
            this.seats = SEATS;
        } else {
            System.out.println("Skateboard cannot have different seats than " + SEATS + ".");
        }
    }

    @Override
    protected void setWheelSize(int wheelSize) {
        if (wheelSize >= MIN_WHEEL_SIZE && wheelSize <= MAX_WHEEL_SIZE) {
            this.wheelSizeInInches = wheelSize;
        } else {
            System.out.println("Invalid number of wheel size. Please provide a value between " + MIN_WHEEL_SIZE + " and " + MAX_WHEEL_SIZE);
        }
    }

    @Override
    protected void setHorsePowers(int horsePowers) {
        if (horsePowers == HORSE_POWERS) {
            this.horsePowers = HORSE_POWERS;
        } else {
            System.out.println("Skateboard cannot have different horse power than " + HORSE_POWERS + ".");
        }
    }

    @Override
    public void performStunt() {
        System.out.println("Performing ollie...");
    }

    @Override
    public void honk() {
        System.out.println("There is no honk on this type of vehicle.");
    }
}
