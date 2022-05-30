package string;

public class minmaxoccurenceofcharacter {

	public static void main(String[] args) {
		String s1="pooja puneeeet";
		
		int freq[]=new int[s1.length()];
		
		char minchar=s1.charAt(0);
		char maxchar=s1.charAt(0);
		int min,max;
		char string[]=s1.toCharArray();
		
		for(int i=0;i<string.length;i++) {
			
			for(int j=i+1;j<string.length;j++) {
				
				freq[i]=1;
				if(string[i]==string[j] && string[i]!=' ' && string[i]!='O') {
					
					freq[i]++;
					string[j]='O';
					
					
				}
				
			}
		}
		  min = max = freq[0];  
		  for(int i=0;i<freq.length;i++) {
			  
			  if(min>freq[i]&&freq[i]!='O')
			  {
				   min = freq[i];    
		              minchar = string[i];   
				  
			  }
			  if(max<freq[i]){
				  max = freq[i];    
	              maxchar = string[i];    
				  
				  
			  }
		  }
		  
		  System.out.println(minchar);
		  System.out.println(maxchar);

	}

}
