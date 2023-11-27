package homework5.Task1Car;

public class Person {
    private static final int DEFAULT_AGE = 0;
    private static final int DEFAULT_WEIGHT = 5;
    private static final int MAX_FRIENDS_CAPACITY = 3;

    private String name;
    private long personalNumber;
    private int age;
    private int weight;
    private Person[] friends;
    private boolean isMale;

    public Person() {
        age = DEFAULT_AGE;
        weight = DEFAULT_WEIGHT;
        friends = new Person[MAX_FRIENDS_CAPACITY];
    }

    public Person(String name, long personalNumber, boolean isMale) {
        this();
        this.name = name;
        this.personalNumber = personalNumber;
        this.isMale = isMale;
    }

    public String getName() {
        return name;
    }

    public boolean getIsMale() {
        return isMale;
    }

    public void setAge(int age) {
        if (age > 0) {
            this.age = age;
        } else {
            System.out.println("Age should be greater than 0.");
        }
    }

    public void setWeight(int weight) {
        if (weight > 0) {
            this.weight = weight;
        } else {
            System.out.println("Weight should be greater than 0.");
        }
    }

    public void addFriend(Person newFriend) {
        boolean isAdded = false;
        for (int i = 0; i < MAX_FRIENDS_CAPACITY; i++) {
            if (friends[i] == null) {
                friends[i] = newFriend;
                isAdded = true;

                break;
            }
        }

        if (isAdded) {
            System.out.println("A new friend has been added with name - " + newFriend.name);

            for (int i = 0; i < MAX_FRIENDS_CAPACITY; i++) {
                if (newFriend.friends[i] == null) {
                    newFriend.friends[i] = this;
                    System.out.println(this.name + " has been added as a friend to " + newFriend.name);

                    break;
                }
            }
        } else {
            System.out.println(this.name + " has already reached its maximum capacity of friends.");
        }
    }

    public void printFriendsInfo() {
        for (int i = 0; i < MAX_FRIENDS_CAPACITY; i++) {
            Person friend = friends[i];
            if (friend == null) {
                continue;
            }

            System.out.println(friend.name + " - " + friend.age + " - " + (friend.isMale ? "male" : "female") + " - " + friend.weight + "kg");
        }
    }

    public void showPersonInfo() {
        System.out.println(name + " - " + age + " - " + (isMale ? "male" : "female") + " - " + weight + "kg");
    }

    public void catchABus(Bus bus) {
        bus.addPassenger(this);
    }
}
