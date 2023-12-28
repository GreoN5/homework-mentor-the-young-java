package design_patterns.behavioral.template_method;

public class FixBugsWorkDay extends Day {
    @Override
    protected void work() {
        System.out.println("Fixing bugs at work.");
    }
}
