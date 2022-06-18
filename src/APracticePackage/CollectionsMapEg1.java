package APracticePackage;

import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class CollectionsMapEg1 {

	public static void main(String[] args) {
		Map<String, Integer> Object=new HashMap();
		Map<String, Integer> Object1=new TreeMap();
		Object.put("Santosh", 225);
		Object.put("Mayuri", 10);
		Object.put("Megha1", 15);
		System.out.println(Object);
		System.out.println(Object.containsKey("Santosh"));
		System.out.println(Object.containsValue(5));
		System.out.println(Object.get("Santosh"));
		Object1.put("Santosh", 5);
		Object1.put("Mayuri", 10);
		Object1.put("Megha", 15);
		Object1.put("Shubhangi", 25);
		System.out.println(Object1);
		Object1.putAll(Object);
		System.out.println(Object1);
		Object1.remove("Santosh");
		System.out.println(Object1.remove("Santosh"));
		System.out.println(Object1);
		Object1.clear();
		System.out.println(Object1);
	}

}
