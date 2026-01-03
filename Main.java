import java.util.ArrayList;
import java.util.Collections;

public class Main {
    public static void main(String[] args) {
        ArrayList<Person> people = new ArrayList<>();

        people.add(new Employee("John", "Lennon", "Musician", 27045.78));
        people.add(new Employee("George", "Harrison", "Guitarist", 50000.00));
        people.add(new Student("Ringo", "Starr", 2.0)); // GPA < 2.67, стипендии не будет
        people.add(new Student("Paul", "McCartney", 3.5)); // GPA > 2.67, будет стипендия

        Collections.sort(people);

        printData(people);
    }

    public static void printData(Iterable<Person> people) {
        for (Person p : people) {
            System.out.printf("%s earns %.2f tenge%n", p.toString(), p.getPaymentAmount());
        }
    }
}
