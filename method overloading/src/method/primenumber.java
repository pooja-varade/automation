package method;

public class primenumber {
	
	//int primrct=0;

	public static void main(String[] args) {
	for(int i=2;i<=100;i++) {
			boolean isprime=true;//taken as flag
			for(int j=2;j<i;j++) {
	if(i%j==0) {
		isprime=false;
		break;
	}
}
			if(isprime) {
				System.out.println(i);
				
			}
}
}
}
