package homework5.Task1Car;

import java.util.Arrays;
import java.util.Objects;

public class CarDemo {
    public static void main(String[] args) {
        // ---------------------------------------------------------
        // task - 1: Add extra methods in class Car:
        //    void accelerate()
        //    void changeGearUp()
        //    void changeGearDown()
        //    void changeGear(int nexGear)
        //    void changeColor(String newColor)
        //
        //    Write logic in all change gear methods that validates the gear before changing min is 1, max is 5.
        //    ---
        //    Add 2 constructors under class Person:
        //    - Default Constructor: it sets age to 0 and weight to 5
        //    - Constructor with params: the constructor should have the following params – String name, long personal Number, boolean is Male
        //
        //    Set constructor chain: constr with params -> default.
        //
        //    Change the Person class to contains array of Friends. The arrays should have 3 elements.
        //    ---
        //    Add extra methods in class Car:
        //    boolean isMoreExpensive(Car car)
        //
        //    double calcPriceForScrap(double metalPrice)
        //    Price = metalPrice * coef
        //    The coef starts from 0.2 and depends on the color and if it is a sport car:
        //    If black or white: 0.05 is added to the coef
        //    If the car is sport: 0.05 is added to the coef
        //
        //    Test the code in class CarDemo.
        // ---------------------------------------------------------

        Car vw = new Car("Golf", "Diesel", "black", 240, 5000);
        Person vwOwner = new Person("Ivaylo", 123456789, true);
        vwOwner.setAge(18);
        vwOwner.setWeight(75);
        vw.assignOwner(vwOwner);

        Person jivko = new Person("Jivko", 1012131415, true);
        jivko.setAge(25);
        jivko.setWeight(73);

        Person pavleta = new Person("Pavleta", 1112131415, false);
        pavleta.setAge(16);
        pavleta.setWeight(53);

        Person ivan = new Person("Ivan", 1213141516, true);
        ivan.setAge(21);
        ivan.setWeight(82);

        Person mihaela = new Person("Mihaela", 1314151617, true);
        mihaela.setAge(22);
        mihaela.setWeight(48);

        vwOwner.addFriend(jivko);
        vwOwner.addFriend(pavleta);
        vwOwner.addFriend(ivan);

        vwOwner.printFriendsInfo();
        jivko.printFriendsInfo();
        pavleta.printFriendsInfo();
        ivan.printFriendsInfo();

        jivko.addFriend(pavleta);
        jivko.addFriend(ivan);
        jivko.addFriend(mihaela);
        jivko.printFriendsInfo();

        Car audi = new Car("A4", "Petrol", "red", 260, 12000);
//        audi.assignOwner(ivan);

        vw.accelerate();
        vw.accelerate();
        vw.accelerate();

        vw.changeGearUp();
        vw.accelerate();
        vw.changeGearUp();
        vw.changeGearUp();
        vw.accelerate();
        vw.accelerate();
        vw.accelerate();
        vw.accelerate();
        vw.changeGearUp();
        vw.changeGearUp();

        vw.changeGearDown();
        vw.changeGearDown();
        vw.changeGearDown();
        vw.changeGearDown();
        vw.changeGearDown();

        vw.changeGear(6);
        vw.changeGear(2);

        System.out.println(audi.isMoreExpensive(vw));
        System.out.println(audi.calculatePriceForScrap(5));
        System.out.println(vw.calculatePriceForScrap(3));

        audi.changeColor("white");
        System.out.println(audi.calculatePriceForScrap(5));

        CarOwner ivanOwner = new CarOwner("Ivan", 1234567891, true);
        ivanOwner.buyCar(vw);
        ivanOwner.driveCar();

        CarOwner dimitarOwner = new CarOwner("Ivan", 1234567891, true);
        CarSeller seller = new CarSeller("Teodor", 2134567891, true);
        seller.setCarForSale(audi);
        seller.showCar();
        seller.sellCar(seller.getCarForSale(), dimitarOwner);

        Bus schoolBus = new Bus("Siemens", "diesel", "white", 160, 5000000, 8, 10);
        schoolBus.addPassenger(jivko);
        schoolBus.addPassenger(mihaela);
        schoolBus.addPassenger(pavleta);

        ivan.catchABus(schoolBus);
    }
}
