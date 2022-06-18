package APracticePackage;

public class Eg5 {

	public static void main(String[] args) {
		int a=7;
		int c=0;
		for(int i=1; i<=a;i++) {
			if(a%i==0) {
				c=c+1;
			}
		}
		if (c==2) {
			System.out.println("Prime Number");
		}
		else {
			System.out.println("Not Prime Number");
		}

	}

}
