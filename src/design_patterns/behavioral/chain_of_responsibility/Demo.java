package design_patterns.behavioral.chain_of_responsibility;

public class Demo {
    public static void main(String[] args) {
        CustomerService customerService = new CustomerService();
        Specialist specialist = new Specialist();
        Manager manager = new Manager();

        customerService.setNextHandler(specialist);
        specialist.setNextHandler(manager);

        customerService.handleRequest("GPU question");
    }
}
