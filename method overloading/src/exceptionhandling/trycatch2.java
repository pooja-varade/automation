package exceptionhandling;

public class trycatch2 {

	public static void main(String[] args) {
	try {
		int data=10/0;
		System.out.println(data);
		
	}
	catch(ArithmeticException n) {
		
		System.out.println(n);
	}
	finally {
		
		System.out.println("finally block start");
		//int res=10/0;
		//System.out.println(res);
		System.out.println("finally ends");
	}

	}

}
