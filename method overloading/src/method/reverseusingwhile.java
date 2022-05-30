package method;

public class reverseusingwhile {

	public static void main(String[] args) {
		
		int num=123;
		int rev=0;
		while(num!=0) {
			int remainder=num%10;
			rev=rev*10+remainder;
			num=num/10;
			
			
		}
		System.out.println("reverse number is  "+rev);

	}

}
