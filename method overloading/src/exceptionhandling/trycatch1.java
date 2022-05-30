
package exceptionhandling;

import java.util.Scanner;

public class trycatch1 {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the array size");
		int size=sc.nextInt();
		

		int []arr=new int[size];
		
		try {
			
			
			System.out.println(arr[3]);
		}
		catch (ArrayIndexOutOfBoundsException obj) {
			
			System.out.println("exception handled"+obj);
		}
		catch (ArithmeticException a) {
			
			System.out.println(a);
		}
	}

}
