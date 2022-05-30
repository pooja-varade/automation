package exceptionhandling;

import java.util.Scanner;

public class trycatch {

	public static void main(String[] args) {

		System.out.println("program start here..............");
		
		Scanner sc=new Scanner(System.in);
		try {
			System.out.println("enter the num1");
			int i=sc.nextInt();
			//System.out.println("enter the num1");
			System.out.println("enter the second num2");
			int j=sc.nextInt();
			//System.out.println("enter the second num2");
			int k=i/j;
			System.out.println("res"+k);
			
		}
		catch (ArithmeticException obj) {
			System.out.println("Exception handled"+obj);
			//obj.printStackTrace();
		}	
		System.out.println("program ends here");

	}

}
