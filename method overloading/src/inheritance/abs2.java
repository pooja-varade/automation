package inheritance;

abstract class shape{
	abstract  void draw();
	void filled() {
		
		System.out.println("filled the color in shape");
	}
	
}
class rectangle extends shape{
	
	protected void draw() {
		
		System.out.println("draw the rectanngle");
	}
	
}
class circle extends shape{
	public void draw() {
		System.out.println("draw the circle");

		}
	void filled() {
		System.out.println("filled the color in circle");
		
	}
	
}

public class abs2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		shape s1=new circle();
		s1.filled();
		s1.draw();
rectangle r1=new rectangle();
r1.filled();
r1.draw();
	}

}
