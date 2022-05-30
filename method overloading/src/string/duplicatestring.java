package string;

public class duplicatestring {

	public static void main(String[] args) {
		String s1="poojapuneet";
		char string[]=s1.toCharArray();
		
	for(int i=0;i<string.length;i++) {
			
			
			for(int j=i+1;j<string.length;j++) {
				
				if(string[i]==string[j]) {
					System.out.println(string[j]);

	            }

         }
	  }
	}
}
