package APracticePackage;

public class Eg10 {

	public static void main(String[] args) {
		char a[]= {'a','b','d','a','f','h', 'h','b'};
//		int b[] = { 25, 68, 98, 1, 25, 45 };
//		System.out.println(a[1]);
//		System.out.println(a.length);
//		for(int i=0;i<a.length;i++) {
//			System.out.println(a[i]);
//		}
//		int d[]=new int[5];
//		d[1]=55555;
//		System.out.println(d[1]);
		for(int i=0;i<a.length;i++) {
			for(int j=0; j!=i;j++) {
			if(a[i]==a[j]) {
				System.out.print(a[i]);
			}
		}
	}

}}
