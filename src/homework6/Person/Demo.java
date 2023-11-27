package homework6.Person;

public class Demo {
    public static void main(String[] args) {
        Person[] people = new Person[10];

        Person petar = new Person("Petar", "Petrov", 21, "male");
        Person ivayla = new Person("Ivayla", "Georgieva", 17, "female");
        Person teodor = new Person("Teodor", "Petrov", 21, "male");

        Student hristo = new Student("Hristo", "Veselinov", 20, "male", 4.60);
        Student filip = new Student("Filip", "Filipov", 22, "male", 5.75);
        Student ralica = new Student("Ralica", "Dimitrov", 20, "female", 3.40);

        Lector ivan = new Lector("Ivan", "Genev", 32, "male", 120);
        Lector dimitar = new Lector("Dimitar", "Sabev", 28, "male", 90);
        Lector jivka = new Lector("Jivka", "Yordanova", 41, "female", 180);

        people[0] = petar;
        people[1] = ivayla;
        people[2] = teodor;

        people[3] = hristo;
        people[4] = filip;
        people[5] = ralica;

        people[6] = ivan;
        people[7] = dimitar;
        people[8] = jivka;

        for (int index = 0; index < people.length; index++) {
            Person person = people[index];
            if (person == null) {
                continue;
            }

            if (person instanceof Student) {
                ((Student) person).showStudentInfo();
                System.out.println();
            } else if (person instanceof Lector) {
                ((Lector) person).showLectorInfo();
                System.out.println();
            } else {
                person.showPersonInfo();
                System.out.println();
            }
        }

        for (int index = 0; index < people.length; index++) {
            Person person = people[index];
            if (person == null) {
                continue;
            }

            if (person instanceof Lector) {
                double sumOfOvertime = ((Lector) person).calculateOvertime(4);
                System.out.println("For 4 hours of overtime " + person.getFullName() + " will earn: " + sumOfOvertime);
            }
        }
    }
}
