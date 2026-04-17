package task_CPT;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class Task9 {
    public static void main(String[] args) {

        ArrayList<Employee> list = new ArrayList<>();

        list.add(new Employee(1, "mani", 20000.0));
        list.add(new Employee(2, "jeeva", 10000.0));
        list.add(new Employee(3, "tiru", 50000.0));
        list.add(new Employee(4, "balu", 60000.0));
        list.add(new Employee(5, "praveen", 30000.0));

        Collections.sort(list, new Comparator<Employee>() {
            @Override
            public int compare(Employee e1, Employee e2) {
                return e1.name.compareTo(e2.name);   // alphabetical order
            }
        });

        System.out.println("Sorted by name (alphabetically):");
        list.forEach(System.out::println);

        Collections.sort(list, new Comparator<Employee>() {
            @Override
            public int compare(Employee e1, Employee e2) {
                return Double.compare(e2.salary, e1.salary);   // descending order
            }
        });

        System.out.println("\nSorted by salary (descending):");
        list.forEach(System.out::println);
    }
}