package design_patterns.structural.facade;

public class BillingService {
    public void processBill(String order) {
        System.out.println("Processing bill for " + order);
    }
}
