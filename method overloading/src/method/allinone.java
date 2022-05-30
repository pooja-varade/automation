package method;

public class allinone {

	public static void main(String[] args) {
		allinone a=new allinone();
		a.geteven(20);
		allinone.getreverse(456123);
		allinone.getvowels('a');
		
		

	}
	
	  void geteven(int a) {
			 //a=20;
			 if(a%2==0) {
				 System.out.println("the number is even number"+a);
			 }
			 else {
				 System.out.println("the number is odd");
			 }
			  
		  }
	  
	 static int getreverse(int number) {
			
			 int rev=0;
			while( number != 0)   
			{  
			int remainder = number % 10;  
			rev = rev * 10 + remainder;  
			number = number/10;  
			}  
			System.out.println("The reverse of the given number is: " + rev); 
			return rev;
			}
	 
	 
		static void getvowels(char c) {
			 //c='a';
			
			  if(c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u' ){
			  System.out.println("character is vowel" +c);
			  }else {
			  
				  System.out.println("character is not  vowel" +c);
				  
	}
	}
			
	}


