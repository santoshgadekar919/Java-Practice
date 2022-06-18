package BPracticePackage;

public class Constructor {
	float c = 19f;
	float d = 15f;
	public Constructor() {
		float a=c;
		float b=d;
		System.out.println(add(c, d));
		System.out.println(sub(a, b));
		System.out.println(mul(a, b));
		System.out.println(div(a, b));
	}
	public Constructor(float a, float b) {
		System.out.println(add(a, b));
		System.out.println(sub(a, b));
		System.out.println(mul(a, b));
		System.out.println(div(a, b));
	}
	public static float add(float c, float d) {
		System.out.println("GHHsjkl");
		return c + d;
	}
	public static float sub(float a, float b) {
		return a-b;
	}
	public static float mul(float a, float b) {
		return a*b;
	}
	public static float div(float a, float b) {
		return a/b;
	}
	public static void main(String[] args) {
		Constructor Object2 = new Constructor();
		float m=Object2.c;
		float n=Object2.d;
		Constructor Object1 = new Constructor(m, n);
	}
}
