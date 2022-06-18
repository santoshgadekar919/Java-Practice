package APracticePackage;

public class Eg15a extends Eg16 {

	
	public void print() {
		System.out.println("Hello i am in print method");
	}
	public static void main(String[] args) {
		Eg15a Object=new Eg15a();
		Eg16 Object1=new Eg15a();
		System.out.println(Object.display(19));
	}

}
