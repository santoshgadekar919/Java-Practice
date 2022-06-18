package BPracticePackage;

public class ArrayEG {

	public static void main(String[] args) {
		int a[] = { 12, 25, 1, 3, 26, 99 };
		int t;
		for(int i=0; i<a.length;i++) {
			for (int j=0; j<a.length;j++) {
				if(a[i]<a[j]) {
				t=a[j];
				a[j]=a[i];
				a[i]=t;
				}
			}
			
		}
		for(int k=0;k<a.length;k++) {
			System.out.print(a[k] +" ");
		}
	}
}
