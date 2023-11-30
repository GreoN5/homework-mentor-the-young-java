package homework7;

public abstract class Motorcycle extends Vehicle {
    private static final boolean CAN_PERFORM_STUNTS = true;

    public Motorcycle(int year, Company company, double price, int seats, int maxSpeed, int horsePowers) {
        super(year, company, price, seats, maxSpeed, horsePowers);
        setCanPerformStunts(CAN_PERFORM_STUNTS);
    }

    @Override
    public void performStunt() {
        System.out.println("Performing rear tire riding...");
    }

    protected abstract void setWheelSize(int wheelSize);
}
