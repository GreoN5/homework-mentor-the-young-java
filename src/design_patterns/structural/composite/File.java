package design_patterns.structural.composite;

public class File implements IFileElement {
    private String name;

    public File(String name) {
        this.name = name;
    }

    @Override
    public void showDetails() {
        System.out.println("File: " + getName());
    }

    @Override
    public String getName() {
        return name;
    }
}
