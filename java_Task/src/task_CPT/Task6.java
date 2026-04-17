package task_CPT;

import java.util.HashMap;
import java.util.Map;

public class Task6 {
  public static void main(String[] args) {
	  
	String input = "java is easy and java is powerful";
	
	String[] words = input.split(" ");
	
	
	HashMap<String,Integer> freq = new HashMap<>();
	
	for(String word : words ) {
		 freq.put(word, freq.getOrDefault(word, 0)+1);	
		}
	
	for(Map.Entry<String, Integer> entry : freq.entrySet()) {
	        System.out.println(entry.getKey() +" = "+entry.getValue());
	}
  }
}


