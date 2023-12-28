package design_patterns.behavioral.command;

public class SteakOrder implements ICommandOrder {
    private Kitchen kitchen;

    public SteakOrder(Kitchen kitchen) {
        this.kitchen = kitchen;
    }

    @Override
    public void execute() {
        kitchen.prepareSteak();
    }
}
