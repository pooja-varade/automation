package arrayprogram;

public class minmax1 {

	public static void main(String[] args) {
		int []arr= {10,20,40,80,60};
		System.out.println("arrays length is"+arr.length);
		for(int i:arr) {
			
			System.out.println(i);
		}
		System.out.println("find the max number");
		int max=arr[0];
		for(int i=0;i<arr.length;i++) {
			
		 
				if(arr[i]>max) {
					
					max=arr[i];
				}
				
			
		}
		System.out.println("max number is"+max);

	}

}
