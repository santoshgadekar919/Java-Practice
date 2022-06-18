package BPracticePackage;

public class StringEg2 {
	public StringEg2(String s, String s2,String s4) {
		string(s, s2, s4);
	}

	public static void main(String[] args) {
		StringEg2 Object=new StringEg2("NitiN", "NitiN","");
	}

	public void string(String s, String s2, String s4) {
		if(s2.equals(rstr(s, s4))) {
			System.out.println("Palindrome "+rstr(s, s4));
		}
		else {
			System.out.println("Not Pallindrome " +rstr(s, s4));
		}
	}
	public String rstr(String s, String s4) {
		for (int i = s.length() - 1; i >= 0; i--) {
			s4=s4 + String.valueOf(s.charAt(i));
			}
		return s4;
	}
	
}
