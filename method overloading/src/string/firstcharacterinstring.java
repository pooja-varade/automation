package string;

public class firstcharacterinstring {

	public static void main(String[] args) {
		
		String []str= {"pooja","puneet","chetan","pushpa"};
		
		for(String first:str) {
			
			System.out.println(first.charAt(0));
		}
		
		
		//get first two character in string
		String strr="pooja";
		
		
	strr=strr.substring(0, 2);
		System.out.println(strr);
		//System.out.println(strr.charAt(1));
		
		
		//remove first character in string
		String str1="helloworld";
		
		System.out.println(str1.substring(1));
		System.out.println(str1);
		System.out.println(str1.substring(0,str1.length()-1));

	}

}
