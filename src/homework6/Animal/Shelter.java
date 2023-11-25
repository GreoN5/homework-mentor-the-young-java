package homework6.Animal;

public class Shelter {
    private static final int DEFAULT_ANIMAL_CAPACITY = 5;
    private static final String DEFAULT_ADDRESS = "ul. Georgi Hadjiev #5";
    private static final String DEFAULT_PHONE_NUMBER = "+359882123348";
    private static final String DEFAULT_NAME = "Beatriz Shelter";

    private String address;
    private String phoneNumber;
    private String name;
    private Animal[] animals;

    public Shelter() {
        address = DEFAULT_ADDRESS;
        phoneNumber = DEFAULT_PHONE_NUMBER;
        name = DEFAULT_NAME;
        animals = new Animal[DEFAULT_ANIMAL_CAPACITY];
    }

    public Shelter(int animalsCapacity) {
        this();
        animals = new Animal[animalsCapacity];
    }

    public Shelter(int animalsCapacity, String address) {
        this(animalsCapacity);
        this.address = address;
    }

    public Shelter(int animalsCapacity, String address, String phoneNumber) {
        this(animalsCapacity, address);
        setPhoneNumber(phoneNumber);
    }

    public Shelter(int animalsCapacity, String address, String phoneNumber, String name) {
        this(animalsCapacity, address, phoneNumber);
        this.name = name;
    }

    public String getName() {
        return name;
    }

    private void setPhoneNumber(String phoneNumber) {
        if (phoneNumber.matches("^\\+359\\d{9}$")) {
            this.phoneNumber = phoneNumber;
        } else {
            System.out.println("Invalid phone number!");
        }
    }

    public void setAnimals(Animal[] animals) {
        if (this.animals.length < animals.length) {
            System.out.println("There is not enough space for all animals.");
        } else {
            for(int index = 0; index < animals.length; index++) {
                if (this.animals[index] == null) {
                    this.animals[index] = animals[index];
                }
            }
        }
    }

    public Animal adoptAnimal(String type) {
        Animal adoptedAnimal = null;

        for (int index = 0; index < animals.length; index++) {
            if (animals[index].getType().equals(type)) {
                adoptedAnimal = animals[index];
                animals[index] = null;
                break;
            }
        }

        return adoptedAnimal;
    }

    public void takeDogForAWalk(int number) {
        int countOfDogs = 0;
        for (int index = 0; index < animals.length; index++) {
            if (animals[index] == null) {
                continue;
            }

            if (animals[index].getType().equals("dog")) {
                countOfDogs++;
            }
        }

        if (countOfDogs == 0) {
            System.out.println("There are no dogs in the shelter");
        } else if (countOfDogs < number) {
            System.out.println("There are fewer dogs than required.");
        } else {
            makeSoundOfDogsWhenWalking(number);
        }
    }

    public void listAllAnimals() {
        for (int index = 0; index < animals.length; index++) {
            Animal animalInShelter = animals[index];

            if (animalInShelter != null) {
                System.out.print(
                        "animal #" + (index + 1) + ":\n" +
                                "type: " + animalInShelter.getType() + "\n" +
                                "name: " + animalInShelter.getName() + "\n" +
                                "sound: ");
                animalInShelter.makeSound();
                System.out.print("\n");
            }
        }
    }

    private void makeSoundOfDogsWhenWalking(int number) {
        int countOfSounds = 0;

        for (int index = 0; index < animals.length; index++) {
            if (countOfSounds == number) {
                break;
            }

            if (animals[index] == null) {
                continue;
            }

            if (animals[index].getType().equals("dog")) {
                animals[index].makeSound();
                countOfSounds++;
            }
        }
    }
}
