package APracticePackage;

public class Eg15 {

	public static void main(String[] args) {
		int a[] = { 12, 25, 1, 3, 26, 99 };
		int b;
		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < a.length; j++) {
				if(a[i]<a[j]) {
					b=a[i];
					a[i]=a[j];
					a[j]=b;
				}
			}
		}
		for(int j=0;j<a.length;j++) {
			System.out.print(a[j] +" ");
		}
	}

}
