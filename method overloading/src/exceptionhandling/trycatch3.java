package exceptionhandling;

public class trycatch3 {

	public static void main(String[] args) {
	try {
		
		int arr[]=new int[3];
		arr[2]=20/2;
		System.out.println(arr[2]);
	}

	catch(ArithmeticException a) {
		System.out.println("arithmetic excveption occurs"+a);
	}
	catch(ArrayIndexOutOfBoundsException ai) {
		
		System.out.println(ai);
		
	}
	catch(Throwable e) {
		System.out.println(e);
		e.printStackTrace();
		System.out.println(e.getMessage());
		
	}
	finally {
		
		System.out.println("always executed");
	}

	}

}
