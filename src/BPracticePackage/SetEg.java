package BPracticePackage;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

public class SetEg {

	public static void main(String[] args) {
		Set<Integer> set=new HashSet();
		Set<Integer> set1=new TreeSet();
		set.add(5);
		set.add(0);
		set.add(16);
		set.add(8);
		set.add(15);
		set.add(9);
		set.add(9);
		set1.add(88);
		set1.add(155);
		set1.add(99);
		set1.add(94);
		System.out.println(set);
		set1.addAll(set);
		System.out.println(set1);
		set1.removeAll(set);
		System.out.println(set1);
		Iterator v=set.iterator();
		while(v.hasNext()) {
			System.out.print(v.next() +" ");
		}
		System.out.println();
		for(Integer v1:set1) {
		System.out.print(v1 +" ");	
		}
	}
}
