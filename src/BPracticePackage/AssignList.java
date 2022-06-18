package BPracticePackage;

import java.util.ArrayList;
import java.util.List;

public class AssignList {
	public static List<String> display(String s){
		List<String> list1=new ArrayList();
		list1.add("abf");
		list1.add("abbpf");
		list1.add("abbff");
		list1.add("abbfbf");
		for(int i=list1.size()-1; i>=0;i--) {
		if(list1.get(i).startsWith(s)) {
		list1.remove(list1.get(i));
		}
		}
		return list1;
		}

	public static void main(String[] args) {
		System.out.println(display("abb"));
	}
}
