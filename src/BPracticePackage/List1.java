package BPracticePackage;

import java.util.ArrayList;

public class List1 {
	public static void main(String[] args) {
		ArrayList<String> list = new ArrayList();
		list.add("abf");
		list.add("abbpf");
		list.add("abff");
		list.add("abfbf");
		System.out.println("The given string is " +list);
		System.out.println("The Output string is ");
		for (int i = list.size()-1; i>=0; i--) {
		if (list.get(i).contains("abb")) {
		list.remove(list.get(i));
		}
		
		}
		System.out.print(list);
	}
}
