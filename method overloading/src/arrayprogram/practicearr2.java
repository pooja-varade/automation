package arrayprogram;

public class practicearr2 {

	public static void main(String[] args) {
		String[] arr;
		arr=new String[4];
		
		arr[0]="tata";
		arr[1]="suzuki";
		arr[2]="honda";
		arr[3]="tigor";
		
		for(int i=0;i<arr.length;i++) {
			
			System.out.println(arr[i]);
		}
		arr[2]="poojacar";
		System.out.println(arr[2]);
		
		


	}

}
