package string;

public class countwhitespaceanddigit {

	public static void main(String[] args) {
		String str="pooja 123 puneet";
		str=str.toLowerCase();
		int count=0;
		
		for(int i=0;i<str.length();i++) {
			
			char ch=str.charAt(i);
			if(Character.isWhitespace(ch)||Character.isDigit(ch))
			{
				count++;
				
			}
			
		}
		System.out.println("the number of whitr spaces and digit are"+count);

	}

}
