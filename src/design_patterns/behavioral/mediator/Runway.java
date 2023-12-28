package design_patterns.behavioral.mediator;

public class Runway {
    private boolean isAvailable;

    public Runway() {
        isAvailable = true;
    }

    public boolean isAvailable() {
        return isAvailable;
    }

    public void setAvailable(boolean isAvailable) {
        this.isAvailable = isAvailable;
    }
}
