package arrayprogram;

public class arrayrightrotate {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int []arr= {10,20,30,40,50};
		int last=arr[4];
		for(int i=arr.length-2;i>=0;i--) {
			
			arr[i+1]=arr[i];
		}
		arr[0]=last;
		for(int i:arr) {
			
			
			System.out.println(i);
		}

	}

}
