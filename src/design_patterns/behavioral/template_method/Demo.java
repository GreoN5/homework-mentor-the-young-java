package design_patterns.behavioral.template_method;

public class Demo {
    public static void main(String[] args) {
        FixBugsWorkDay fixBugsDay = new FixBugsWorkDay();
        MeetingsDay meetingsDay = new MeetingsDay();

        System.out.println("Fix bugs routine:");
        fixBugsDay.routine();

        System.out.println("\nMeetings routine:");
        meetingsDay.routine();
    }
}
