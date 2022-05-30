package method;

public class reverseusingfor {

	public static void main(String[] args) {
	
	int num=123;
	int rev=0;
	for(;num!=0;num=num/10) {
		
		int remainder=num%10;
		rev=rev*10+remainder;
	}
System.out.println(rev);
	}

}
