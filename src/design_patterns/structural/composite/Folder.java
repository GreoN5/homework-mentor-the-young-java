package design_patterns.structural.composite;

import java.util.ArrayList;
import java.util.List;

public class Folder implements IFileElement {
    private String name;
    private List<IFileElement> files = new ArrayList<>();

    public Folder(String name) {
        this.name = name;
    }

    public void addFile(IFileElement file) {
        files.add(file);
    }

    public void removeFile(IFileElement file) {
        files.remove(file);
    }

    @Override
    public void showDetails() {
        System.out.println("Folder: " + name);
        for(IFileElement file : files) {
            file.showDetails();
        }
    }

    @Override
    public String getName() {
        return name;
    }
}
