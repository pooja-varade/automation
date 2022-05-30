package method;

public class armstrongformultidigit {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int num=1634;
int count=0;
double arm=0;
int rem=0;
int temp;
temp=num;
while(temp>0) {
	
	temp=temp/10;
	count++;
}
temp=num;
while(temp>0) {
	
	rem=temp%10;
	arm=arm+Math.pow(rem,count);
	temp=temp/10;
	
}
if(arm==num) {
	
	System.out.println("the number is armstrong");
}
else {
	
	System.out.println("the number is not armstrong");
}
		
		
		
	}

}
