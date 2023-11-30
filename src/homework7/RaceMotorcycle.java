package homework7;

public class RaceMotorcycle extends Motorcycle {
    private static final int SEATS = 2;
    private static final int MAX_SPEED = 250;
    private static final int HORSE_POWERS = 200;
    private static final int MIN_WHEEL_SIZE = 18;
    private static final int MAX_WHEEL_SIZE = 22;

    public RaceMotorcycle(int year, Company company, double price, int wheelSizeInInches) {
        super(year, company, price, SEATS, MAX_SPEED, HORSE_POWERS);
        setWheelSize(wheelSizeInInches);
    }

    @Override
    protected void setWheelSize(int wheelSize) {
        if (wheelSize >= MIN_WHEEL_SIZE && wheelSize <= MAX_WHEEL_SIZE) {
            wheelSizeInInches = wheelSize;
        } else {
            System.out.println("Invalid wheel size. Please provide values between 18 and 22.");
        }
    }
}
