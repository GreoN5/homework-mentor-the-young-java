package homework7;

public abstract class FourWheeledVehicle extends Vehicle {
    public static final int MIN_DOORS = 2;
    public static final int MAX_DOORS = 4;

    protected int doors;
    private boolean isAllWheelDrive;

    public FourWheeledVehicle(int year, Company company, double price) {
        this.year = year;
        this.company = company;
        this.price = price;
    }

    protected void setAllWheelDrive(boolean allWheelDrive) {
        this.isAllWheelDrive = allWheelDrive;
    };

    protected abstract void setDoors(int doors);
    protected abstract void setMaxSpeed(int maxSpeed);
    protected abstract void setSeats(int seats);
    protected abstract void setWheelSize(int wheelSize);
    protected abstract void setHorsePowers(int horsePowers);

    @Override
    public void printVehicleInfo() {
        super.printVehicleInfo();

        System.out.print("4x4 - " + isAllWheelDrive + "\n" +
                "Doors - " + doors + "\n");
    }
}
