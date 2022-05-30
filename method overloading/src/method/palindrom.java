package method;

public class palindrom {

	public static void main(String[] args) {
		palindrom p=new palindrom();
		p.getpalindrom(121);

	}
	public int getpalindrom(int n) {
		//n=121;
		int remainder;
		int reverse=0;
		int temp=n;
		while(n>0)
		{    
			remainder=n%10;    
			reverse=(reverse*10)+remainder;    
			n=n/10;    
			}
		if(temp==reverse)
			System.out.println("the number is palindrom");
		else
			System.out.println("the number is not  palindrom");
		
		return n;
	
	 
//System.out.println("the number is palindrom");

	}
}
