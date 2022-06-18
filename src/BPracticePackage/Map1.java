package BPracticePackage;

import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class Map1 {

	public static void main(String[] args) {
		Map<String, Integer> Map1=new HashMap();
		Map<String, Integer> Map2=new TreeMap();
		Map1.put("Santosh", 225);
		Map1.put("Mayuri", 10);
		Map1.put("Megha1", 15);
		System.out.println(Map1);
		System.out.println(Map1.containsKey("Santosh"));
		System.out.println(Map1.containsValue(5));
		System.out.println(Map1.get("Santosh"));
		Map2.put("Santosh", 5);
		Map2.put("Mayuri", 10);
		Map2.put("Megha", 15);
		Map2.put("Shubhangi", 25);
		System.out.println(Map2);
		Map2.putAll(Map1);
		System.out.println(Map2);
//		Map2.remove("Santosh");
		System.out.println(Map2.remove("Santosh"));
		System.out.println(Map2);
		Map2.clear();
		System.out.println(Map2);
	}

}
