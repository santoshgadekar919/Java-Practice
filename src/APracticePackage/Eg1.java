package APracticePackage;

public class Eg1 {
	float a,b;
	public Eg1(int a, int b) {
		this.a=a;
		this.b=b;
		add();
		sub();
		mul();
		div();
	}

	public void add() {
		float c=a+b;
		System.out.println("Addition- " +c);
	}

	public void sub() {
		float c=a-b;
		System.out.println("Subtraction- " +c);
	}

	public void mul() {
		float c=a*b;
		System.out.println("Multiplication- " +c);
	}

	public void div() {
		float c=a/b;
		System.out.println("Division- " +c);
	}
	
	public static void main(String[] args) {
		Eg1 Object=new Eg1(15,216);
	}
}
