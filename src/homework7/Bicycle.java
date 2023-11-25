package homework7;

public class Bicycle extends Vehicle  {
    private static final int HORSE_POWERS = 0;
    private static final int SEATS = 3;
    private static final int MAX_SPEED = 45;
    private static final int WHEEL_SIZE = 16;
    private static final boolean CAN_PERFORM_STUNTS = true;

    public Bicycle(int year, Company company, double price) {
        super(year, company, price, SEATS, MAX_SPEED, WHEEL_SIZE, HORSE_POWERS);
        setCanPerformStunts(CAN_PERFORM_STUNTS);
    }

    @Override
    public void performStunt() {
        System.out.println("Performing rear tire riding...");
    }

    @Override
    public void honk() {
        System.out.println("dzunn... dzunnn...");
    }
}
