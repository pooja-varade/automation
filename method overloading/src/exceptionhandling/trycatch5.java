package exceptionhandling;

public class trycatch5 {
	
	public static void getarray(int []a,int size) {
		try {
		a[0]=20;
		a[1]=30;
		a[2]=40;
		for(int i=0;i<a.length;i++) {
			
			System.out.println(a[i]);
		}
		}catch(ArrayIndexOutOfBoundsException arr) {
			System.out.println(arr);
			
		}
		
	
	}
	

	public static void main(String[] args) {
		int []arr= new int[2];
		getarray(arr,2);

	}

}
