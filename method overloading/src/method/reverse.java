package method;

public class reverse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		reverse r=new reverse();
		r.getreverse(1234);
	}
	
	void getreverse(int number) {
		
		 int rev=0;
		while(number != 0)   
		{  
		int remainder = number % 10;  
		rev = rev * 10 + remainder;  
		number = number/10;  
		}  
		System.out.println("The reverse of the given number is: " + rev);  
		}
		
	}


