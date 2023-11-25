package homework7;

public class Jeep extends FourWheeledVehicle {
    private static final int MIN_MAX_SPEED = 180;
    private static final int MAX_SPEED = 240;
    private static final int MIN_SEATS = 3;
    private static final int MAX_SEATS = 6;
    private static final int MIN_WHEEL_SIZE = 19;
    private static final int MAX_WHEEL_SIZE = 24;
    private static final int MIN_HORSE_POWERS = 140;
    private static final int MAX_HORSE_POWERS = 200;
    private static final boolean CAN_PERFORM_STUNTS = false;

    public Jeep(int year, Company company, double price, int doors, int maxSpeed, int seats, int wheelSizeInInches, int horsePowers) {
        super(year, company, price);
        super.setAllWheelDrive(true);

        setDoors(doors);
        setMaxSpeed(maxSpeed);
        setSeats(seats);
        setWheelSize(wheelSizeInInches);
        setHorsePowers(horsePowers);
        setCanPerformStunts(CAN_PERFORM_STUNTS);
    }

    @Override
    protected void setDoors(int doors) {
        if (doors >= MIN_DOORS && doors <= MAX_DOORS) {
            this.doors = doors;
        } else {
            System.out.println("Invalid number of doors. Please provide a value between " + MIN_DOORS +  " and " + MAX_DOORS);
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
        if (seats >= MIN_SEATS && seats <= MAX_SEATS) {
            this.seats = seats;
        } else {
            System.out.println("Invalid number of doors. Please provide a value between " +  MIN_SEATS + " and " + MAX_SEATS);
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
}
