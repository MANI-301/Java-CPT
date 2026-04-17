package task_CPT;

import java.util.ArrayList;

import java.util.Collections;
import java.util.Comparator;

public class Task7 {

	public static void main(String[] args) {
		ArrayList<Integer> number = new ArrayList<>();
		
		for(int i=10;i>=1;i--) {
			number.add(i);
		}
		
		
		Collections.sort(number);
		System.out.println("Ascending Order: "+number);
		System.out.println();
		Collections.sort(number,Comparator.reverseOrder());
        System.out.println("Descending Order: "+ number);
	}
}
