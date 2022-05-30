package string;

import java.util.Arrays;

public class anagramstring {

	public static void main(String[] args) {
	
		
		//anagram string means both string have same character However, the order or sequence of the characters can be different.
		//like s1=brag and s2=grab
		
		String s1="BRAG";
		String s2="Grab";
		
		s1=s1.toLowerCase();
		s2=s2.toLowerCase();
		
		if(s1.length()!=s2.length()) {
			
			System.out.println("string is not anagram");
		}
		else {
			
			char []string1=s1.toCharArray();
			char []string2=s2.toCharArray();
			
			Arrays.sort(string1);
			Arrays.sort(string2);
			
			if(Arrays.equals(string1, string2)==true) {
				
				System.out.println("string is anagaram");
			}
			else {
				System.out.println("string is not  anagaram");
				
			}
		}

	}

}
