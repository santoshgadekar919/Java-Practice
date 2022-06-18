package BPracticePackage;

public class Final {
	final int a;
	final static int b;
	static {
	b = 225; // final static variable must initialize in static block if 
//	static block is present otherwise can be initialize in constructor. Also non 
//	static final variable cannot be initialize in static block
	}
	public Final() {
//	 b = 15;
	a=155;
	display();
	display(15);
	System.out.println(display(1));
	}
	public void display() {
	System.out.println(b);
	// a=15; Error----The final field ClassA.a cannot be assigned
	}
	public int display(int a) {
	return b;
	}
	public static void main(String[] args) {
		Final Object1 = new Final();
	}
	}


