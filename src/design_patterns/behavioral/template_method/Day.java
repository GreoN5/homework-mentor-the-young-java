package design_patterns.behavioral.template_method;

public abstract class Day {
    public final void routine() {
        wakeUp();
        work();
        returnHome();
        relax();
        sleep();
    }

    protected void wakeUp() {
        System.out.println("Wake up and get ready.");
    }

    protected abstract void work();

    protected void returnHome() {
        System.out.println("Return home.");
    }

    protected void relax() {
        System.out.println("Relax for a while.");
    }

    protected void sleep() {
        System.out.println("Go to sleep.");
    }
}
