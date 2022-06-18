package APracticePackage;

public class Eg2 {
	float a,b;
	public Eg2(int a, int b) {
		this();
		this.a=a;
		this.b=b;
		add();
		sub();
		mul();
		div();
	}
	public Eg2() {
	System.out.println("The Output of calculator program is ");
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
		Eg2 Object=new Eg2(15,216);
	}
}