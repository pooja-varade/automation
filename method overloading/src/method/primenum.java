package method;

public class primenum {

	public static void main(String[] args) {
		
//prime(23);
	}

	
	static void prime(int num) {
		
		for(int i=1;1<100;i++)
		{
			int counter=0;
			for(num=i;num>=1;num--)
			{
			if(num%i==0)
		counter=counter++;
			System.out.println("number is not prime");
		    }
		
	  
		if (counter == 2) {
			
			System.out.println("the number is prime");
		}
		else
			System.out.println("the number is not prime");
}
	}
}

