package BPracticePackage;

public class ParentClass {
	public ParentClass(int a) {
		System.out.println("Hello I am in constructor of Parent Class" +" "+ +a);
		display(155.0f);
	}

	public void display(float b) {
		System.out.println("Hello I am in display method ((((Float)))) of Parent Class");
	}
	public void display(int a) {
		System.out.println("Hello I am in display method ((((int)))) of Parent Class");
	}
	

	public static void main(String[] args) {

	}
}
