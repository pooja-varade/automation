package string;

public class onestringrotationofanotherstring {

	public static void main(String[] args) {
		String s1="abcde",s2="deabc";
		
		
		if(s1.length()!=s2.length()) {
			
			System.out.println("string two is not rotation of string one");
		}
		else
		{
			s1=s1.concat(s1);
			if(s1.indexOf(s2)!=-1) {
                System.out.println("Second string is a rotation of first string");    

				
			}
			else {
				
                System.out.println("Second string is not  a rotation of first string");    

			}
		}

	}

}
