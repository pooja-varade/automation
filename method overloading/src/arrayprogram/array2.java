package arrayprogram;

public class array2 {

	public static void main(String[] args) {
	
		
		int a[]=new int[5];
		System.out.println(a[0]);
		System.out.println(a[1]);
		System.out.println(a[2]);
		System.out.println(a[3]);
		System.out.println(a[4]);
		a[0]=10;
		a[1]=20;
		a[2]=30;
		a[3]=40;
		a[4]=50;
		
		System.out.println("count the array element"+a.length);
		System.out.println("using normal for loop");
		
		for(int i=0;i<a.length;i++) {
			
			System.out.println(a[i]);
		}
		
		
		System.out.println("using for each loop");
		
		for(int num:a) {
			System.out.println(num);
		}
		
		
		char []getarray=new char[3];
		getarray[0]='A';
		getarray[1]='B';
		getarray[2]='c';
		System.out.println(getarray.length);
		
		for (int i=0;i<getarray.length;i++) {
			
			System.out.println(getarray[i]);
		}
		int []p1= {5,6,7,9,6,3};
		
		
	}

}
