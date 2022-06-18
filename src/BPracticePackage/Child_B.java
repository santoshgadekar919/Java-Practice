package BPracticePackage;

public class Child_B extends Child_A {
	int d=59;
	public Child_B(int a) {
		super(a);
		System.out.println("I am in constructor of Child_B class");
	}
	public void display2() {
		System.out.println("Hello I am in display-2 method of Child_B Class");
	}
	public static void main(String[] args) {
		Child_B Object=new Child_B(155);
	}
}
