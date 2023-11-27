package homework5.Task1Car;

public class CarSeller extends Person {
    private Car carForSale;

    public CarSeller(String name, long personalNumber, boolean isMale) {
        super(name, personalNumber, isMale);
    }

    public Car getCarForSale() {
        return carForSale;
    }

    public void setCarForSale(Car car) {
        if (car != null) {
            carForSale = car;
        }
    }

    public void showCar() {
        if (carForSale != null) {
            System.out.println("Model: " + carForSale.getModel() + "\n" +
                    "Color: " + carForSale.getColor() + "\n" +
                    "Fuel: " + carForSale.getFuel() + "\n" +
                    "Max speed: " + carForSale.getMaxSpeed() + "\n" +
                    "Price: " + carForSale.getPrice());
        } else {
            System.out.println("There is no car for sale right now.");
        }
    }

    public void sellCar(Car car, CarOwner buyer) {
        if (buyer != null && car != null) {
            buyer.buyCar(car);
            System.out.println("Owner " + buyer.getName() + " successfully bought " + car.getModel() + " from you.");
        } else {
            System.out.println("There was invalid car or buyer provided.");
        }
    }
}
