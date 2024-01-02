package design_patterns.behavioral.template_method;

public class MeetingsDay extends Day {
    @Override
    protected void work() {
        System.out.println("Attending meetings at work.");
    }
}
