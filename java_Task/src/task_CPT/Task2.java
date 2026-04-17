package task_CPT;

import java.util.ArrayList;

public class Task2 {
	public static void main(String[] args) {
		ArrayList<Integer> number = new ArrayList<>();
		
		for (int i=1;i<=10;i++) {
			number.add(i);
		}
		
		for(int i=0;i<number.size();i++) {
			if(number.get(i)%2==0) {
				number.remove(i);
			}
		}
		System.out.println(number);
		
	}

}
