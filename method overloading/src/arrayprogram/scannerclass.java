package arrayprogram;

import java.util.Scanner;

public class scannerclass {

	public static void main(String[] args) {
		String s="this is pooja varde";
		Scanner sc=new Scanner(s);
		System.out.println("boolean result"+sc.hasNext());
		System.out.println("print string"+sc.nextLine());
		int age;
		double salary;
		String name;
		boolean valid;
		System.out.println("enter the age2");
		age=sc.nextInt();
		System.out.println("enter the salary");
		salary=sc.nextDouble();
		System.out.println("enter the name");
		name=sc.next();
		System.out.println("age2"+age);
		System.out.println("salary"+salary);
		System.out.println("name"+name);
		System.out.println("enter the operator");
		char op=sc.next().charAt(0);
		int a,b;
		System.out.println("enter num1 num2");
		a=sc.nextInt();
		b=sc.nextInt();
		System.out.println("addition"+addition(op,a,b));

	}
	static int addition(char op,int a,int b) {
		
		if(op=='+') {
			
			return  a+b;
		}
			else {
				return 0;
				
		}
	}

}
