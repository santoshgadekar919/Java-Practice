package CPracticeProject;

abstract public class Parent implements Eg2,Eg3,Eg4{
	public Parent(int a) {
		System.out.println("Hello");
	}
	public void display() {
		System.out.println("Hello I am in Display Method");
	}
	abstract public void print();
	public static void main(String[] args) {

	}

}
