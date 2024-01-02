package design_patterns.behavioral.command;

public class PastaOrder implements ICommandOrder {
    private Kitchen kitchen;

    public PastaOrder(Kitchen kitchen) {
        this.kitchen = kitchen;
    }

    @Override
    public void execute() {
        kitchen.preparePasta();
    }
}
