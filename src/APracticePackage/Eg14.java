package APracticePackage;

public class Eg14 {

	public static void main(String[] args) {
		char a[] = { 'a', 'A', 'z', 'Z' };
		char b;
		for (int i = 0; i < a.length; i++) {
			if (Character.isUpperCase(a[i])) {
				b = a[i - 1];
				a[i - 1] = a[i];
				a[i]=b;
			}
			
		}
		for(int j=0; j<a.length;j++) {
			System.out.print(a[j]);
		}
	}

}
