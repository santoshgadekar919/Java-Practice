package APracticePackage;

public class StringEg3 {

	public void display(String s) {
		String a = "Hello how are you all";
		String b = "";
		for (int i = s.length() - 1; i >= 0; i--) {
			b = b + String.valueOf(s.charAt(i));
		}
	if(a.contains(s)) {
		System.out.print(a.replace(s, b));
	}
	}

	public static void main(String[] args) {
		StringEg3 Object = new StringEg3();
		Object.display("are");
	}

}
