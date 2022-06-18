package APracticePackage;

public class Eg11 {

	public static void main(String[] args) {
		char a[] = { 'a', 'a', 'w', 'w', 'w', 't', 'w', 'f', 'A', 'A' };
		int b[] = { 1, 5, 55, 98 };
		for (int i = 0; i < a.length - 1; i++) {
			if (a[i] == a[i + 1]) {
				System.out.println(a[i]);
			}
		}
	}
}
