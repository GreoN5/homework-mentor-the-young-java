package homework7;

public class DirtBike extends Motorcycle {
    private static final int SEATS = 1;
    private static final int MAX_SPEED = 150;
    private static final int HORSE_POWERS = 120;
    private static final int MIN_WHEEL_SIZE = 17;
    private static final int MAX_WHEEL_SIZE = 21;

    public DirtBike(int year, Company company, double price, int wheelSizeInInches) {
        super(year, company, price, SEATS, MAX_SPEED, HORSE_POWERS);
        setWheelSize(wheelSizeInInches);
        setCanPerformStunts(true);
    }

    @Override
    public void setWheelSize(int wheelSize) {
        if (wheelSize >= MIN_WHEEL_SIZE && wheelSize <= MAX_WHEEL_SIZE) {
            wheelSizeInInches = wheelSize;
        } else {
            System.out.println("Invalid wheel size. Please provide values between 17 and 21.");
        }
    }
}
