package APracticePackage;

public class Eg12 {

	public static void main(String[] args) {
		char a[] = { '1', 'a', '5', 'w', '9', 't', 'w', 'f', 'A', 'g' };
		for(int i=0;i<a.length;i++) {
			if(!Character.isAlphabetic(a[i])) {
				System.out.print(a[i] +" ");
			}
		}

	}

}
