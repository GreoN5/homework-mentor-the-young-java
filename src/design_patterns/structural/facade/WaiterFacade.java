package design_patterns.structural.facade;

public class WaiterFacade {
    private Kitchen kitchen;
    private TableService tableService;
    private BillingService billing;

    public WaiterFacade(Kitchen kitchen, TableService tableService, BillingService billing) {
        this.kitchen = kitchen;
        this.tableService = tableService;
        this.billing = billing;
    }

    public void completeOrder(String order, int tableNumber) {
        System.out.println("Order received for " + order);
        tableService.setTable(tableNumber);
        kitchen.prepareMeal(order);
        billing.processBill(order);
        System.out.println("Order served and billed.");
    }
}
