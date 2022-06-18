package BPracticePackage;

public class StringEg1 {

	public static void main(String[] args) {
		String s = "Hello how are you all";
		for (int i = s.length() - 1; i >= 0; i--) {
			System.out.print(s.charAt(i));
		}
		System.out.println();
		String s1[] = s.split(" ");
		for (int j = s1.length - 1; j >= 0; j--) {
			System.out.print(s1[j] + " ");
		}
		System.out.println();
		String s2 = "Hello how are you all how hello u are";
		String s3[] = s2.split(" ");
		for (int k = 0; k < s3.length; k++) {
			for (int l = s3.length - 1; l != k; l--) {
				if (s3[k].equals(s3[l])) {
					System.out.println(s3[k]);
				}
			}
		}
		System.out.println("New Program");
		String s4 = "My account number is 12345";
		for(int i=0; i<s4.length();i++)
		if(!Character.isAlphabetic(s4.charAt(i))) {
			char s5=s4.charAt(i);
			System.out.print(s5);
		}
		
	}
}
