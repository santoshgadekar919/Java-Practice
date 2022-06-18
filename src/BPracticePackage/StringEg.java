package BPracticePackage;

public class StringEg {

	public static void main(String[] args) {
		String a = "Testing";
		String b = "Testing";
		String c = " Hi Welcome to Hi Testing Class";
		String d = " Testing";
		String e = "TESTING";
		String f = " testing";
		String h = "123456";
		boolean i = a.equals(f);
		System.out.println(i);
		System.out.println(a.equalsIgnoreCase(e));
		System.out.println(a.toLowerCase());
		System.out.println(f.toUpperCase());
		System.out.println(a.concat(h));
		System.out.println(a.length());
		String j[] = c.split(" ");
		for (int k = 0; k < j.length; k++) {
			System.out.println(j[k]);
		}
		System.out.println(a.replace('T', 'i'));
		System.out.println(c.replaceFirst("Hi", e));
		System.out.println(c.replaceAll("Hi", e));
		System.out.println(c.substring(5));
		System.out.println(c.substring(5, 10));
		System.out.println(c.subSequence(5, 10));
		System.out.println(c.contains(d));
		for(int m=0; m<c.length();m++) {
			System.out.print(c.charAt(m) +" ");
		}
		System.out.println();
		System.out.println(f);
		System.out.println(f.trim());
		System.out.println(c.startsWith(" "));
		System.out.println(c.startsWith("Hi"));
		System.out.println(c.trim().startsWith("Hi"));
		int n=Integer.parseInt(h);
		System.out.println(n);
		float z=Float.parseFloat(h);
		System.out.println(z);
	}
}
