package homework6.Animal;

import java.util.Scanner;

public class ShelterDemo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Shelter shelter = new Shelter(6, "ul. Dupnica 5", "+359892134859", "Animal's Studio");
        Animal[] animalsInShelter = new Animal[] {
                new Animal("dog", "Rex", "woof-woof"),
                new Animal("dog", "Max", "woof-woof"),
                new Animal("cat", "Mein", "meow"),
                new Animal("parrot", "Pavel", "pi-pi-pi"),
                new Animal("fish", "Goldy", "...."),
                new Animal("canary", "Jan", "piii-piii-piii-piiiiiii")
        };

        shelter.setAnimals(animalsInShelter);

        System.out.println("Welcome to " + shelter.getName());
        System.out.println("You can choose from the menu below:");
        while (true) {
            System.out.println("1: Show all animals");
            System.out.println("2: Adopt animal");
            System.out.println("3: Take a dog for a walk");
            System.out.println("4: Exit from our shelter");

            System.out.println("Which option do you choose?: ");
            int menuChoice = scanner.nextInt();

            boolean exit = false;
            switch (menuChoice) {
                case 1:
                    shelter.listAllAnimals();
                    break;
                case 2:
                    System.out.println("Which type of animal do you want to adopt?");
                    shelter.listAllAnimals();

                    System.out.println("Enter the type of the animal: ");
                    String animalTypeChoice = scanner.next();

                    Animal adoptedAnimal = shelter.adoptAnimal(animalTypeChoice);
                    while (adoptedAnimal == null) {
                        System.out.println("Sorry, but we do not have this type of animal.");
                        System.out.println("Please enter another type of animal from the list below: ");
                        shelter.listAllAnimals();

                        String typeChoice = scanner.next();
                        adoptedAnimal = shelter.adoptAnimal(typeChoice);
                    }

                    adoptedAnimal.makeSound();
                    System.out.println("Great choice!");

                    break;
                case 3:
                    System.out.println("Which type of animal do you want to take for a walk?");
                    shelter.listAllAnimals();

                    System.out.println("Enter the type of the animal: ");
                    String animalTypeForWalk = scanner.next();

                    while (!animalTypeForWalk.strip().equalsIgnoreCase("dog")) {
                        System.out.println("This type of animal cannot be taken for a walk. Please enter another one: ");
                        animalTypeForWalk = scanner.next();
                    }

                    System.out.println("How many of them do you want to take out for a walk?: ");
                    int animalsCount = scanner.nextInt();

                    shelter.takeDogForAWalk(animalsCount);
                    break;
                case 4:
                    exit = true;
                    break;
                default:
                    break;
            }

            if (exit) {
                System.out.println("Goodbye! Have a nice day and come back later again!");
                break;
            }
        }

        scanner.close();
    }
}
