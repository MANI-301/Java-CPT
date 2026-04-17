package task_CPT;

import java.util.ArrayList;

public class Task1 {
	 public static void main(String[] args) {
		ArrayList<String> student = new ArrayList<>();
		student.add("Mani");
		student.add("Tiru");
		student.add("jeeva");
		student.add("darmick");
		student.add("praveen");
		
		System.out.println("List of Students:");
		System.out.println();
		for(int i=0;i<student.size();i++) {
			System.out.println((i+1+". ") + student.get(i))  ;
		}
		
		System.out.println();
		System.out.println("Total number of students --- " + student.size());
	}

}
