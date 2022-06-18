package BPracticePackage;

import java.util.ArrayList;
import java.util.List;

public class Collections {

	public static void main(String[] args) {
		List<Integer> list=new ArrayList();
		List<Integer> list1=new ArrayList();
		list.add(15);
		list.add(69);
		list.add(189);
		list.add(126);
		list.add(699);
		list1.add(697);
		list1.add(789);
		list1.add(369);
		list1.add(1234);
		list1.add(456);
		System.out.println(list);
		System.out.println(list1);
		list.addAll(list1);
		System.out.println(list);
		list.add(0, 00000);
		System.out.println(list);
		System.out.println(list.get(2));
		System.out.println(list.size());
		list.remove(6);
		System.out.println(list);
		list.removeAll(list1);
		System.out.println(list);
	}
}