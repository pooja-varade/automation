package arrayprogram;

public class rotateleftelement {

	public static void main(String[] args) {
		int arr[]= {10,20,30,40,50};
		int first;
		first=arr[0];
		int second=arr[1];
		for(int i=2;i<arr.length;i++) {
			
			arr[i-2]=arr[i];
			
			
		}
		arr[3]=first;
		arr[4]=second;
		for(int i:arr) {
			
			System.out.println(i);
		}

	}

}
