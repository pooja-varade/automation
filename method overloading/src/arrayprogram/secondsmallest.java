package arrayprogram;

import java.util.Arrays;

public class secondsmallest {

	public static void main(String[] args) {
		int []arr= {2,5,8,1,3,4};
		Arrays.sort(arr);
		for(int i:arr) {
			
			System.out.println(i);
		}
		System.out.println("second smallest number"+arr[1]);

	}

}
//second smallest number is find using direct sort method
