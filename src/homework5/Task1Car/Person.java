package homework5.Task1Car;

public class Person {
    private static final int DEFAULT_AGE = 0;
    private static final int DEFAULT_WEIGHT = 5;
    private static final int MAX_FRIENDS_CAPACITY = 3;

    String name;
    long personalNumber;
    int age;
    int weight;
    Person[] friends;
    boolean isMale;

    Person() {
        age = DEFAULT_AGE;
        weight = DEFAULT_WEIGHT;
        friends = new Person[MAX_FRIENDS_CAPACITY];
    }

    Person(String name, long personalNumber, boolean isMale) {
        this();
        this.name = name;
        this.personalNumber = personalNumber;
        this.isMale = isMale;
    }

    void addFriend(Person newFriend) {
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

    void printFriendsInfo() {
        for (int i = 0; i < MAX_FRIENDS_CAPACITY; i++) {
            Person friend = friends[i];
            if (friend == null) {
                continue;
            }

            System.out.println(friend.name + " - " + friend.age + " - " + (friend.isMale ? "male" : "female") + " - " + friend.weight + "kg");
        }
    }
}
