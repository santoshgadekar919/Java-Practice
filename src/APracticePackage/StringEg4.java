package APracticePackage;

public class StringEg4 {

	public void display(String s) {
		String b = "";
		for (int i = s.length() - 1; i >= 0; i--) {
			b = b + String.valueOf(s.charAt(i));
		}
	if(b.contains(s)) {
		System.out.print(b +" Palindrome");
	}
	else{
		System.out.print(b +" Not Palindrome");
	}
	}

	public static void main(String[] args) {
		StringEg4 Object = new StringEg4();
		Object.display("SANTOSH");
	}

}
