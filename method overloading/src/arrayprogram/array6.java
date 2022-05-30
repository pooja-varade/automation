package arrayprogram;

import java.util.Arrays;

public class array6 {

	public static void main(String[] args) {
		
		int []arr= {10,20,30,40,50};
		System.out.println(arr[2]);
		System.out.println(arr.length);
		for(int i=0;i<arr.length;i++) {
			
			System.out.println(arr[i]);
		}
		
		int []arr1=Arrays.copyOf(arr, 5);
		System.out.println(arr1.length);
		
		for(int i=0;i<arr1.length;i++) {
			
			System.out.println(arr1[i]);
		}
		arr1[2]=4;
		arr1[3]=5;
		for(int num:arr1) {
			
			System.out.println(num);
		}

	}

}
