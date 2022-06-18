package APracticePackage;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

public class CollectionsMapEg2 {

	public static void main(String[] args) {
		Map<String, List<Character>> Object1 = new HashMap<>();
		List<Character> Object2 = new ArrayList<Character>();
		Object2.add('A');
		Object2.add('B');
		Object2.add('C');
		Object2.add('D');
		System.out.println(Object2);
		Object1.put("FirstName", Object2);
		System.out.println(Object1);
		Object2.add('E');
		Object2.add('F');
		Object2.add('G');
		Object2.add('H');
		System.out.println(Object2);
		Object1.put("LastName", Object2);
		System.out.println(Object1);
		for (Entry<String, List<Character>> Object3:Object1.entrySet()) {
		String key=Object3.getKey();
		System.out.println(key+" = "+ Object1.get(key));
		}
		}
		}
