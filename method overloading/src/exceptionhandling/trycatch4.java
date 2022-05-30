package exceptionhandling;

public class trycatch4 {
	
	public static void  validateage(int age) {
		
		if(age<18) {
			
			throw new ArithmeticException("candidate is not eligible for vote");
		}
		else {
			
			System.out.println("eligible for vote");
		}
		
	}

	public static void main(String[] args) {
	//	validateage(15);
		try {
			
			validateage(19);
		}
		catch(ArithmeticException a) {
			System.out.println("exception handled"+a);
			
		}

	}

}
