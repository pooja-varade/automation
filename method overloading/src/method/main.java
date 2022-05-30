package method;

public class main {

	  public static void main(String[] args) {
		  
		  main m=new main();
		  m.getprime(23);

	  }
	  
	  
	  void getprime(int a) {
		 //a=20;
		 if(a%2==0) {
			 System.out.println("the number is even number"+a);
		 }
		 else {
			 System.out.println("the number is odd");
		 }
		  
	  }
}