package string;

public class allpossiblesubset {

	public static void main(String[] args) {
		String str="fun";
		int len=str.length();
		int temp=0;
		//all possible subset is n*(n+1)/2
		
	      String arr[] = new String[len*(len+1)/2]; 
	      
	      for(int i=0;i<str.length();i++) {
	    	  
	    	  for(int j=i;j<str.length();j++)
	    	  {
	    		  
	    		  arr[temp]=str.substring(i, j+1);
	    		  temp++;
	    	  }
	      }
	      System.out.println("All subsets for given string are: ");  
	        for(int i = 0; i < arr.length; i++) {  
	            System.out.println(arr[i]);  
	        } 

	}

}
