package APracticePackage;

import java.util.*;

public class CollectionsEg1 {

	public static void main(String[] args) {
		List<String> list=new ArrayList();
		list.add("Santosh");
		list.add("Dinkar");
		list.add("Gadekar");
		System.out.println(list);
		List<String> list1=new ArrayList();
		list1.add("Mayuri");
		list1.add("Kailas");
		list1.add("Ravate");
		System.out.println(list1);
		list1.addAll(list);
		System.out.println(list1);
		list1.add(0, "Megha");
		System.out.println(list1);
		list1.addAll(0, list);
		System.out.println(list1);
		System.out.println(list1.get(3));
		System.out.println(list1.size());
		System.out.println(list1.remove(3));
		System.out.println(list1);
		System.out.println(list1.remove("Mayuri"));
		System.out.println(list1);
		System.out.println(list1.removeAll(list));
		System.out.println(list1);
		for(int i=0; i<list.size();i++) {
			
			if(list.get(i).equalsIgnoreCase("Santosh")) {
				list.remove(list.get(i));
			}
		}
		System.out.println(list);
	}

}
