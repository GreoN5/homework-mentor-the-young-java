package design_patterns.behavioral.chain_of_responsibility;

public abstract class SupportStaff {
    protected SupportStaff nextHandler;

    public void setNextHandler(SupportStaff nextHandler) {
        this.nextHandler = nextHandler;
    }

    public abstract void handleRequest(String request);
}
