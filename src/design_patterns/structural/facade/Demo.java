package design_patterns.structural.facade;

public class Demo {
    public static void main(String[] args) {
        Kitchen kitchen = new Kitchen();
        TableService tableService = new TableService();
        BillingService billing = new BillingService();
        WaiterFacade waiter = new WaiterFacade(kitchen, tableService, billing);

        waiter.completeOrder("Pasta", 5);
    }
}
