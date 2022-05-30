package string;

import java.util.Arrays;

public class sortarray {

	public static void main(String[] args) {
		
		int []arr= {20,50,90,70,10};
		// TODO Auto-generated method stub
		
		Arrays.sort(arr);
		for(int m:arr) {
			
			System.out.println(m);
		}
		System.out.println("after sorting");
		
		
		System.out.println(arr[1]);
		
		//for(int i=arr.length-1;i>=0;i--) {
			
		//	System.out.println(arr[i]);
			
			
		//}
		//System.out.println(Arrays.toString(arr));

	}

}
