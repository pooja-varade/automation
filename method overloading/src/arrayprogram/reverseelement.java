package arrayprogram;

public class reverseelement {

	public static void main(String[] args) {
		int []arr= {1,2,3,4,5};
		for(int i:arr) {
			
			System.out.println(i);
		}
		System.out.println("reverse orde");
		for(int i=arr.length-1;i>=0;i--) {
			
			System.out.println(arr[i]);
		}

	}

}
