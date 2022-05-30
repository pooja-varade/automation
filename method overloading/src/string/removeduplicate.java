package string;

import java.util.HashSet;
import java.util.Set;

public class removeduplicate {

	public static void main(String[] args) {
		String str="pooja";
		
		Set <Character> s1=new HashSet<Character>();
		StringBuffer sb=new StringBuffer();
		
		for(int i=0;i<str.length();i++) {
			
			char ch=str.charAt(i);
			if(!s1.contains(ch)) {
				s1.add(ch);
				sb.append(ch);
				
			}
			
		}
		System.out.println(sb);
		
		

	}

}
