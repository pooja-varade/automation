package starpattern;

public class starpattern2 {

	public static void main(String[] args) {
	starpattern2 s1=new starpattern2();
	s1.star();

	}
	void star() {
		for(int i=1;i<=5;i++) {
			
			for( int j=1;j<=5;j++) {
				if(j<=5-i) {
				
				System.out.print("*");
			}
				else {
					
					System.out.print("");
				}
		
		}
			System.out.println();
	

	}

}
}
