package method;

public class primeusingwhile {

	public static void main(String[] args) {
		int num=7;
		int i=2;
		boolean flag=true;
		while(i<=num/2) {
			
			if(num%i==0) {
				
				System.out.println("number is not prime");
				flag=false;
				break;
			}
			++i;
		}
		
		if(flag==true) {
			
			System.out.println("the number is prime");
		}

	}

}


