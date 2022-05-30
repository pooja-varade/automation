package string;

public class divideequalpart {

	public static void main(String[] args) {
		String str="aaaabbbbcccc";
		
		int len=str.length();
		int n=3;
		
		int temp=0,chars=len/n;
		String []newstr=new String[n];
		if(len%n!=0) {
			
			System.out.println("sorry string cannot divide");
		}
		else {
			
			
			for(int i=0;i<str.length();i=i+chars) {
				String part=str.substring(i, i+chars);
				newstr[temp]=part;
				temp++;
				
			}
		}

		for(int i=0;i<newstr.length;i++) {
			
			System.out.println(newstr[i]);
		}
	}

}
