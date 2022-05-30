package exceptionhandling;

class UserDefinedException extends Exception{
	
	public UserDefinedException(String str) {
		
		super(str);
	}
}

public class exceptionhandling {

	public static void validateage(int age) throws UserDefinedException {
		if(age<18) {
			throw  new UserDefinedException("user is not eligible tp vote");
		}
		else {
			
			System.out.println("user is eligible");
		}
	}
	
	public static void main(String[] args)  {
	try {
		validateage(20);
	}
	catch(UserDefinedException e) {
		
		System.out.println(e);
	}

	}

}
