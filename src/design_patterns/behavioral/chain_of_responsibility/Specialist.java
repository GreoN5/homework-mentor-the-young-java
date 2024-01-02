package design_patterns.behavioral.chain_of_responsibility;

public class Specialist extends SupportStaff {
    private static final String POSSIBLE_REQUEST = "GPU question";

    @Override
    public void handleRequest(String request) {
        if (canHandle(request)) {
            System.out.println("Handled by Specialist");
        } else if (nextHandler != null) {
            nextHandler.handleRequest(request);
        }
    }

    private boolean canHandle(String request) {
        if (request.equals(POSSIBLE_REQUEST)) {
            return true;
        }

        return false;
    }
}
