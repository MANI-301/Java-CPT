package task_CPT;

public class Employee implements Comparable<Employee> {

	int id;
	String name;
	double salary;
	
	public Employee(int id, String name, double salary) {
		super();
		this.id = id;
		this.name = name;
		this.salary = salary;
	}
	public int compareTo(Employee other) {
        // Sort by salary in ascending order
        return Double.compare(this.salary, other.salary);
    }

    @Override
    public String toString() {
        return "Employee{id=" + id + ", name='" + name + "', salary=" + salary + "}";
	
	 
	 
    }
}
