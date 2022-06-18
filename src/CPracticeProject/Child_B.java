package CPracticeProject;

public class Child_B extends Child_A{
	public Child_B(int a) {
		super(a);
		// TODO Auto-generated constructor stub
	}
	public void print1() {
		System.out.println("Hello I am in print_1 method");
	}
	public static void main(String[] args) {
		Child_B Object=new Child_B(1555);
		Object.display();
		Object.print();
		Object.print1();
	
	}

}
