package string;

public class replacespaceswithchararcter {

	public static void main(String[] args) {
		String str="pooja is good girl";
		String s="";
		char ch='#';
		
		for(int i=0;i<str.length();i++) {
			
			if(str.charAt(i)==' ') {
				s=s + ch;
				
				
			}
             else {
				
				s=s+str.charAt(i);
			}
			
		}
		
		for(int i=0;i<s.length();i++) {
			
			System.out.println(s.charAt(i));
		}

	}

}
