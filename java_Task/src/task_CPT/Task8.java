package task_CPT;

import java.util.ArrayList;
import java.util.Collections;


public class Task8{

	

	public static void main(String[] args) {
		
		Employee e1 =new Employee(1,"mani",20000.0);
		Employee e2 =new Employee(2,"jeeva",10000.0);
		Employee e3 =new Employee(3,"tiru",50000.0);
		Employee e4 =new Employee(4,"balu",60000.0);
		Employee e5 =new Employee(5,"praveen",30000.0);
		
		ArrayList<Employee> list = new ArrayList<>();
		
		list.add(e1);
		list.add(e2);
		list.add(e3);
		list.add(e4);
		list.add(e5);
		
		Collections.sort(list);
		
		
		System.out.println("\nAfter sorting by salary (ascending):");
        list.forEach(System.out::println);
	}
	
}		
		 
		 
		
