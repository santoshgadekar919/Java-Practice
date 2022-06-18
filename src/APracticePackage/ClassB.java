package APracticePackage;

public class ClassB extends ClassA{
	public void display(int a, char b) {
		System.out.println("I am in display method of ClassB " + a + " " + b);
	}

	public int display(char b, int a) {
		System.out.println("I am in display method 2 ClassB " + b + " " + a);
		return 0;
	}

	public static void main(String[] args) {
		ClassA Object = new ClassB(); //Object of ClassB with a reference of ClassA
		Object.display(12, 'f');
		Object.display('f', 12);
		Object.print();
//		Object.
	}

}

