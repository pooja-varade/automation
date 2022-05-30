package inheritance;

public class polimorphism2 {

	static void area() {
		
		
		System.out.println("area find");
	}
	
	static void area(int r) {
		System.out.println("area of circle"+3.14*r*r);
		
		
	}
	 static void area(int l,int w) {
		 System.out.println("area of rectangle"+l*w);
		 
		 
	 }
	public static void main(String[] args) {
		
		area();
		area(2);
		area(5,5);
		

	}

}
