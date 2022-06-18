package APracticePackage;

public class Eg13 {

	public static void main(String[] args) {
		int a[] = { 25, 9, 98, 2, 25, 99, 999, 25, 1, 35 };
		int c;
		for (int i = 0; i < a.length; i++) {c=0;
			for (int j = 0; j<a.length; j++) {
				if (a[i] <a[j]) {
					c = c + 1;
				}
				}
			if (c == a.length - 1) {
				System.out.println(a[i]);
			}
		}
	}

}
