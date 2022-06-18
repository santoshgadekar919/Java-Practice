package APracticePackage;

public class StringEg2 {

	public static void main(String[] args) {
		String s = "Hello how are you all";
		for (int i = s.length() - 1; i >= 0; i--) {
			System.out.print(s.charAt(i));
		}
		System.out.println();
		String a[] = s.split(" ");
		for (int j = a.length - 1; j >= 0; j--) {
			System.out.print(a[j] + " ");
		}
		System.out.println();
		String b = "Hello how are you all how hello u are";
		String c[] = b.split(" ");
		for (int k = 0; k < c.length; k++) {

			for (int l = 0; l != k; l++) {

				if (c[k].equals(c[l])) {
					System.out.println(c[k]);
				}
			}
		}
		String mv ="My account number is 12345";
		int o=Integer.parseInt(mv);
		System.out.print(+o);
		for(int i=0;i<mv.length();i++) {
			if(!Character.isAlphabetic(mv.charAt(i))) {
				System.out.print(mv.charAt(i));
			}
		}
	}

}
