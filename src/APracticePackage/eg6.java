package APracticePackage;

public class eg6 {

	public static void main(String[] args) {
		int c;
		int a = 0;
		for (int i = 1; i <= 100; i++) {
			c = 0;
			for (int j = 1; j <= i; j++) {
				if (i % j == 0) {
					c = c + 1;
				}
			}
			if (c == 2) {
				a = a + 1;
				System.out.print(+i + " ");
			}

		}
		System.out.println();
		System.out.println("The total prime numbers are " + a);
	}

}
