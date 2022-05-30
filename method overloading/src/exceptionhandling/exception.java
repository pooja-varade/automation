package exceptionhandling;

public class exception {
	
	public static void getmethod() {
		
		System.out.println("method start");
		try {
		throw  new ArithmeticException("this is arithmetic exception");
		}
		catch(ArithmeticException ae) {
			System.out.println(ae);	
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		getmethod();

	}

}
