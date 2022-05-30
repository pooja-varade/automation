package arrayprogram;

import java.util.Arrays;

public class practicearray {

	public static void main(String[] args) {
		int []arr= {2,3,5,1,8};
		System.out.println("lengthof array"+arr.length);
		for(int i:arr) {
			
			System.out.println(i);
		}
		System.out.println("****************************");
		int carr[]=arr.clone();
		for(int i:carr) {
			
			System.out.println(i);
		}
		carr[0]=30;
		carr[1]=40;
		System.out.println("are they equal");
		System.out.println(Arrays.equals(arr, carr));
		
		int newcopyarr[]=Arrays.copyOf(arr, 3);
		for(int i:newcopyarr) {
			
			System.out.println(i);
		}
		
		System.out.println("***********************");

		int newcopyrangearr[]=Arrays.copyOfRange(arr, 0, 2);
		for(int i:newcopyrangearr) {
			
			
			System.out.println(i);
		}
		Arrays.sort(arr);
		for(int i=0;i<arr.length;i++) {
			
			System.out.println(arr[i]);
		}
	
	}

}
