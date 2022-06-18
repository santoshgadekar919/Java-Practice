package APracticePackage;

public class StringEg1 {

	public static void main(String[] args) {
		String a="Testing";
		String b="Testing";
		String c="Hi Welcome to Hi Testing Class";
		String d=" Testing";
		String e="TESTING";
		String f="testing";
		String h="123456";
		System.out.println(a.equals(b));
		System.out.println(a.equals(d));
		System.out.println(e.equalsIgnoreCase(f));
		System.out.println(e.toLowerCase());
		System.out.println(f.toUpperCase());
		System.out.println(e.concat(f));
		System.out.println(c.length());
		String g[]=c.split("o");
		for (int i=0; i<g.length;i++) {
		System.out.println(g[i]);
		}
		System.out.println(a.replace('T', 'M'));
		System.out.println(c.replaceFirst("Hi", "Mobile"));
		System.out.println(c.replaceAll("Hi", "Mobile"));
		System.out.println(c.substring(5));
		System.out.println(c.substring(5, 10));
		System.out.println(c.subSequence(5, 10));
		System.out.println(b.contains(c));
		System.out.println(a.charAt(5));
		System.out.println(c.trim());
		System.out.println(c.startsWith("Hi"));
		System.out.println(d.trim().startsWith("T"));
		int k=Integer.parseInt(h);
		System.out.println(+k);
		float l=Float.parseFloat(h);
		System.out.println(+l);
	}
}
