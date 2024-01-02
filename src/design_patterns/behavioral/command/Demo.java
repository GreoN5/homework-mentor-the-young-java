package design_patterns.behavioral.command;

public class Demo {
    public static void main(String[] args) {
        Kitchen kitchen = new Kitchen();
        SteakOrder steakOrder = new SteakOrder(kitchen);
        PastaOrder pastaOrder = new PastaOrder(kitchen);

        Waiter waiter = new Waiter();
        waiter.takeOrder(steakOrder);
        waiter.takeOrder(pastaOrder);
    }
}
