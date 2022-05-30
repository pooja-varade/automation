package starpattern;

public class star5 {

	public static void main(String[] args) {
		int n=5;
		for(int i=1;i<=n;i++) {
			
			for(int j=i;j<=n;j++) {
				System.out.print(" ");
			}
			for(int j=1;j<i;j++) {
				
				System.out.print("*");
			}
			for(int j=1;j<=i;j++) {
				
				System.out.print("*");
			}
			System.out.println();
		}

	}

}

// keep one thing remember increasing inner for loop wiill be j=1 to j<=i
//for decreasing inner for loop j=i to j<=n