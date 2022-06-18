package BPracticePackage;

import CPracticeProject.Eg1;

public class Eg3 {
	int b = 18;

	public Eg3() {
		int c=this.b;
		b=1000;
		System.out.println(+c);
		int a = 10;
		String m = "My name is Santosh D. Gadekar";
		System.out.println("Hi, I am in Non Parameterize Constructor. " + m + " and value of a is " + a + ".");
	}

	public Eg3(int s) {
		System.out.println(+s);
		s = 10; // value of s is overwritten by s=10
		String m = "My name is Santosh D. Gadekar";
		System.out.println("Hi, I am in Parameterize Constructor. " + m + " and value of s is " + s + ".");
		System.out.println(+s);
	}

	public static void main(String[] args) {
		Eg3 Object1 = new Eg3();
		Eg3 Object2 = new Eg3(Object1.b);
	}
}
