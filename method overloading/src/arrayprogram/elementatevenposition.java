package arrayprogram;

public class elementatevenposition {

	public static void main(String[] args) {
		int []arr= {2,5,4,3,8,9};
		System.out.println(arr.length);
		//travese the array
		for (int i=0;i<arr.length;i++) {
			System.out.println(arr[i]);
		}
		System.out.println("array element at even position");
		//main program logic
		
		for(int i=1;i<arr.length;i+=2) {
			System.out.println(arr[i]);
			
		}

	}

}
