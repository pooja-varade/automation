package method;

public class PrimeExample {

public static void main(String args[]) {  
	
	PrimeExample p=new PrimeExample();
	p.getprime(4);
	
}

void getprime(int n) {
	int flag=0;
	int i;
	int m=0;
	m=n/2;
	if(n==0||n==1)
		System.out.println("the number is not prime");
	else {
		for(i=2;i<=m;i++);
		  if(n%i==0){      
			     System.out.println(n+" is not prime number");      
			     flag=1;
	
	
	
}
		  if(flag==0);
		  System.out.println("the number is prime");

}
}
}


