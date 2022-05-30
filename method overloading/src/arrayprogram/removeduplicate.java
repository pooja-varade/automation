package arrayprogram;

//import java.lang.reflect.Array;

public class removeduplicate {

	public static void main(String[] args) {
		
		//remove duplicate element in soorted array
		int arr[]= {2,4,4,5,6,6};
		
	int []temp=new int[arr.length];
	int j=0;
	for(int i=0;i<arr.length-1;i++) {
		
		if(arr[i]!=arr[i+1] )
		{
			
			temp[j]=arr[i];
			j++;
		}
	}
	temp[j]=arr[arr.length-1];
	
	
	for (int i=0;i<temp.length;i++) {
		
		System.out.println(temp[i]);
	}
	
	
		}
	

	}


