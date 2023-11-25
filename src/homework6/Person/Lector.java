package homework6.Person;

public class Lector extends Person {
    private static final int EXPERIENCED_LECTOR_MIN_AGE = 30;
    private static final int WORK_DAY_HOURS = 8;
    private static final int OVERTIME_RATE = 2;

    private double dailySalary;

    public Lector(String firstName, String lastName, int age, String gender, double dailySalary) {
        super(firstName, lastName, age, gender);
        this.dailySalary = dailySalary;
    }

    public void showLectorInfo() {
        super.showPersonInfo();
        System.out.print("Daily salary: " + dailySalary + "\n");
    }

    public double calculateOvertime(double hours) {
        if (this.getAge() < EXPERIENCED_LECTOR_MIN_AGE) {
            return 0;
        }

        double hourlySalary = dailySalary / WORK_DAY_HOURS;

        return hours * (hourlySalary * OVERTIME_RATE);
    }
}
