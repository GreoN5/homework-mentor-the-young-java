package design_patterns.structural.composite;

public class Demo {
    public static void main(String[] args) {
        File file1 = new File("File1");
        File file2 = new File("File2");
        File file3 = new File("File3");

        Folder folder1 = new Folder("Folder1");
        Folder folder2 = new Folder("Folder2");

        folder1.addFile(file1);
        folder1.addFile(file2);
        folder2.addFile(file3);
        folder2.addFile(folder1);

        folder1.showDetails();
        System.out.println();
        folder2.showDetails();

        System.out.println();
        folder2.removeFile(file3);
        folder2.showDetails();
    }
}
