package exceptionhandling;

public class exceptionhandling2 {

	public void getdivistion(int a,int b) {
		
		int res=a/b;
		//throw new ArithmeticException("divide by zero exception");
		System.out.println(res);
	}
	
	public static void main(String[] args) {
		exceptionhandling2 e=new exceptionhandling2();
		try {
			e.getdivistion(10, 0);
			
		}
		catch(ArithmeticException ae) {
			
			System.out.println("number is divide by zero"+ae);
		}

	}

}
