package starpattern;
 


public class starpattern7 {

	public static void main(String[] args) {
		starpattern7 s1=new starpattern7();
		s1.getstar(5);
		s1.getstar2();
		s1.getstar3();

	}



void getstar(int number) {
	
	int n=5;
	for (int i=1;i<=n;i++) {
		for(int j=1;j<=n;j++) {
			
			System.out.print("* ");
		}
		System.out.println();
		
	}
}

void getstar2() {
	
	int n=5;
	for(int i=1;i<=n;i++) {
		for(int j=1;j<=i;j++) {
			System.out.print("* ");
		}
		
		System.out.println();
	}
	System.out.println();
}

void getstar3() {
	int n=5;
	for(int i=1;i<=n;i++) {
		for(int j=i;j<=n;j++) {
			System.out.print("* ");
		}
		
		System.out.println();
	
}
}
}

