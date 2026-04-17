package task_CPT;

import java.util.ArrayList;
import java.util.HashSet;

public class Task3 {

	public static void main(String[] args) {
		ArrayList<String> city = new ArrayList<>();
		city.add("chennai");
		city.add("mumbai");
		city.add("delhi");
		city.add("chennai");
		city.add("pune");
		city.add("pune");
		
		System.out.println("Duplicated ArrayList Elements: " + city);
		System.out.println();
		
		HashSet<String> uniqueCity = new HashSet<>();
		
		uniqueCity.addAll(city);
		
		System.out.println("Unique ArrayList Elements: " + uniqueCity);
	}
}
