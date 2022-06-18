package APracticePackage;

public class Overloading {
	public void display(int a, char b) {
		System.out.println("I am in display method 1 " + a + " " + b);
	}

	public int display(char b, int a) {
		System.out.println("I am in display method 2 " + b + " " + a);
		return 0;
	}

	public static void display() {
		System.out.println("I am in Static method of display");
	}

	public static void main(String[] args) {
		Overloading Object = new Overloading();
		Object.display(12, 'f');
		Object.display('f', 12);
		Object.display();// If you overload a static method in Java, it is the example of compile time
							// polymorphism.

	}

}
