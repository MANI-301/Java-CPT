package task_CPT;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Task5 {

	public static void main(String[] args) {
		HashMap<String, Integer> student = new HashMap<>();
		Scanner sc = new Scanner(System .in);
//		· Add 5 students
		student.put("mani", 100);
		student.put("tiru", 70);
		student.put("jeeva", 20);
		student.put("balu", 80);
		student.put("praveen", 35);

//		· Display all student names
		 System.out.println("Students are listed:");
		 System.out.println();
          for(String s : student.keySet()) {
        	  System.out.println(s);
          }
          
          
//		· Find marks of a specific student
          System.out.println();
          System.out.print("Enter Student name:");
          String name = sc.nextLine();
          
          if(student.containsKey(name)) {
              System.out.println();
        	  System.out.println("Marks of a specific student is " + name + " = " + student.get(name));
          }
          else {
        	  System.out.println();
        	  System.out.println("Student is not Found");
          }
         
          
//		· Display all students scoring above 75
          System.out.println();
          System.out.println("These Students are Scored 75+ ");
          for(Map.Entry<String,Integer> s: student.entrySet()) {
        	  if(s.getValue()>75) {
        	  System.out.println(s.getKey() + " = " + s.getValue());
        	  }
          }
          
		 
 	}
}
