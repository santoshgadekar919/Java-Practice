package BPracticePackage;

import java.io.File;
import java.io.IOException;

public class ExceptionHandling {

	public static void main(String[] args)   {
		File f = new File("E:\\\\Testing Class\\\\Core JAVA\\\\Temperory.txt");
		try {
			f.createNewFile();
			System.out.println("Exception not occured");
		} catch (IOException e) {
			System.out.println("Exception Handled");
			e.printStackTrace();
		}	
		
		 try {
			 int a[]=new int[5]; 
			 a[10]=30/8;
			} catch (ArithmeticException e) {
				System.out.println("Exception Handled");
				e.printStackTrace();
			}
		 catch (ArrayIndexOutOfBoundsException e) {
				System.out.println("Exception Handled");
				e.printStackTrace();
			}
		System.out.println("Hello I am In rest of code");
	}
}
