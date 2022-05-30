package arrayprogram;

import java.util.Arrays;

public class copyarray {

	public static void main(String[] args) {
		int []arr= {10,20,30,40,50};
		int []newarr=Arrays.copyOf(arr, arr.length);
		for(int i:newarr) {
			System.out.println(i);
		}
		
		int []newarr1=new int[5];
		System.arraycopy(arr, 0, newarr1, 0	, newarr1.length);
		
		for(int i:newarr1) {
			System.out.println(i);
		}

	}

}
