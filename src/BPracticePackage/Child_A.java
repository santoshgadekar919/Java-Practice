package BPracticePackage;

public class Child_A extends ParentClass {

	public Child_A(int a) {
	super(a);
	System.out.println("I am in constructor of Child_A class");
	}
	
	public void display1() {
		System.out.println("Hello I am in display-1 method of Child_A Class");
	}
	
	public static void main(String[] args) {
	Child_A Object=new Child_A(15);	
	}
}
