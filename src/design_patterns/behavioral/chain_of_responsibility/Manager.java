package design_patterns.behavioral.chain_of_responsibility;

public class Manager extends SupportStaff {
    @Override
    public void handleRequest(String request) {
        System.out.println("Handled by Manager");
    }
}
