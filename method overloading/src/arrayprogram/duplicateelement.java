package arrayprogram;

public class duplicateelement {

	public static void main(String[] args) {
		int []arr= {2,4,5,2,6,7,6};
		System.out.println(arr.length);
		for(int a:arr) {
			
			System.out.println(a);
		}
		System.out.println("****************88");
		for(int i=0;i<arr.length;i++) {
			
			for(int j=i+1;j<arr.length;j++) {
				
				if(arr[i]==arr[j]) {
					
					System.out.println(arr[j]);
				}
			}
		}

	}

}
