package homework6.Animal;

public class Animal {
    private static final String DEFAULT_TYPE = "dog";
    private static final String DEFAULT_NAME = "Rex";
    private static final String DEFAULT_SOUND = "woof-woof";

    private String type;
    private String name;
    private String sound;

    public Animal() {
        type = DEFAULT_TYPE;
        name = DEFAULT_NAME;
        sound = DEFAULT_SOUND;
    }

    public Animal(String type) {
        this();
        setType(type);
    }

    public Animal(String type, String name) {
        this(type);
        this.name = name;
    }

    public Animal(String type, String name, String sound) {
        this(type, name);
        this.sound = sound;
    }

    private void setType(String type) {
        if (type.isBlank()) {
            System.out.println("The type of animal should not be empty!");
        } else {
            this.type = type.strip().toLowerCase();
        }
    }

    public String getType() {
        return type;
    }

    public String getName() {
        return name;
    }

    public void makeSound() {
        System.out.println(sound);
    }
}
