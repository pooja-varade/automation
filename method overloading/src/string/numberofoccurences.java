package string;

import java.util.HashMap;
import java.util.Map;

public class numberofoccurences {

	public static void main(String[] args) {
		
		String str="pooja";
		
		char []arr=str.toCharArray();
		
		Map <Character,Integer> m1=new HashMap<Character,Integer>();
		for(int i= 0;i<arr.length;i++) {
			int count=0;
			for(int j=0;j<arr.length;j++) {
				
				if(arr[i]==arr[j]) {
					
					count++;
				}
			}
			m1.put(arr[i], count);
		}
		
System.out.println(m1);
	}

}
