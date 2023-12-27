package design_patterns.structural.decorator;

public class Demo {

    public static void main(String[] args) {
        ICar myBasicCar = new BasicCar();

        ICar sportCar = new SportCar(myBasicCar);
        System.out.println("Sport car description: " + sportCar.getDescription());
        System.out.println("Sport car price: $" + sportCar.getPrice());

        ICar luxuryCar = new LuxuryCar(myBasicCar);
        System.out.println("Luxury car description: " + luxuryCar.getDescription());
        System.out.println("Luxury car price: $" + luxuryCar.getPrice());

        ICar luxurySportCar = new LuxuryCar(sportCar);
        System.out.println("Luxury sport car description: " + luxurySportCar.getDescription());
        System.out.println("Luxury sport car price: $" + luxurySportCar.getPrice());
    }
}
