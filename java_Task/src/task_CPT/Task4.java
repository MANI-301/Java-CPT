package task_CPT;

import java.util.HashSet;

public class Task4 {

	public static void main(String[] args) {
		HashSet<Integer> num1 = new HashSet<Integer>();
		
		HashSet<Integer> num2 = new HashSet<Integer>();
		
	
		
		for(int i=10;i<=50;i=i+10) {
			num1.add(i);
		}
		
		for(int i=30;i<=70;i=i+10) {
			num2.add(i);
		}
		
		
		common(num1,num2);
		unique(num1,num2);
	}
	
	private static void common(HashSet<Integer> num1, HashSet<Integer> num2) {
		HashSet<Integer> common = new HashSet<>(num1);
		common.retainAll(num2);
		System.out.println("Common Elements:" + common);
		
		
		
	}

   private static void unique(HashSet<Integer> num1, HashSet<Integer> num2) {
	   HashSet<Integer> unique = new HashSet<>(num1);
		unique.removeAll(num2);
		System.out.println("Unique elements in first set: " + unique);
		
	}

}
