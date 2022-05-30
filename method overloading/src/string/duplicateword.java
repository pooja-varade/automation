package string;

public class duplicateword {

	public static void main(String[] args) {
		String s1="pooja is not pooja and is not good";
		
		s1=s1.toLowerCase();
		String words[]=s1.split(" ");
		
		  for(int i = 0; i < words.length; i++) {    
	            
	            for(int j = i+1; j < words.length; j++) {
	            	
	            	if(words[i].equals(words[j])) {
	            		
	            		System.out.println(words[j]);
	            	}
	            }
		  }

	}

}
