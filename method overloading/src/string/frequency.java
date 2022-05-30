package string;

public class frequency {

	public static void main(String[] args) {
		String str="picture perfect";
		int []frequency=new int[str.length()];
		
		char string[]=str.toCharArray();
		
		for(int i=0;i<string.length;i++) {
			
			frequency[i]=1;
			for(int j=i+1;j<string.length;j++) {
				
				if(string[i]==string[j]) {
					
					frequency[i]++;
					string[j]='0';
				}
			}
			
		}
		for(int i=0;i<frequency.length;i++) {
			if(string[i] != ' ' && string[i] != '0')    
			
		    System.out.println(string[i] + "-" + frequency[i]);    
		}

	}

}
