package method;

public class palindronusingfor {

	public static void main(String[] args) {
		int num=123;
		int rev=0;
		int temp=num;
		for(;num!=0;num=num/10)
		{
			int remainder=num%10;
			rev=rev*10+remainder;
			
			
		}
		if(temp==rev) {
			
			System.out.println("number is palindrom");
		}
		else {
			
			System.out.println("number is not  palindrom");
		}

	}

}
