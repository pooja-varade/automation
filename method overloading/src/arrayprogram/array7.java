package arrayprogram;

public class array7 {

	public static void main(String[] args) {
		
		
		int  [][]arr=new int[3][3];
		System.out.println("length of array is"+arr.length);
		arr[0][0]=20;
		arr[0][1]=30;
		arr[0][2]=40;
		arr[1][0]=50;
		arr[1][1]=60;
		arr[1][2]=70;
		arr[2][0]=80;
		arr[2][1]=40;
		arr[2][2]=50;
		
		
		for(int i=0;i<arr.length;i++) {
			for(int j=0;j<arr.length;j++) {
				
				System.out.print(arr[i][j]+" ");
				
			}
			System.out.println();
			
			
		}
		
		char [][]ch= {{'a','b'},{'c','d','e'},{'f','g','h'}};
		System.out.println(ch.length);
		
		for(int i=0;i<ch.length;i++) {
			
			for(int j=0;j<ch[i].length;j++) {
				System.out.print(ch[i][j]+" ");
				
			}
			System.out.println();
		}

	}

}
