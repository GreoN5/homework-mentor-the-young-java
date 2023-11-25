package homework5.Task1Car;

public class CarOwner extends Person {
    private Car car;

    public CarOwner(String name, long personalNumber, boolean isMale) {
        super(name, personalNumber, isMale);
    }

    public Car getCar() {
        return car;
    }

    public void driveCar() {
        System.out.println(this.getName() + " is driving " + (getIsMale() ? "his" : "her") + " car:" + "\n" +
                "Model: " + car.getModel() + "\n" +
                "Color: " + car.getColor() + "\n" +
                "Fuel: " + car.getFuel() + "\n" +
                "Max speed: " + car.getMaxSpeed());
    }

    public void buyCar(Car car) {
        if (car == null) {
            System.out.println("Invalid car to buy.");
        } else {
            this.car = car;
            this.car.assignOwner(this);
        }
    }
}
