package APracticePackage;

import java.util.*;

public class CollectionsEg2 {

	public List<String> display(String s){
		List<String> list1=new ArrayList();
		list1.add("abbf");
		list1.add("abpf");
		list1.add("abbff");
		list1.add("abfbf");
		for(int i=0; i<list1.size();i++) {
			if(list1.get(i).startsWith(s)) {
				list1.remove(list1.get(i));
			}
		}
		
		return list1;
	}
	public static void main(String[] args) {
		CollectionsEg2 Object=new CollectionsEg2();
		System.out.println(Object.display("abb"));
	}

}
