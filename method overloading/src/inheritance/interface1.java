package inheritance;
interface drawable{
	int age=25;//it is by default public static final
	void draw();//it is by default public abstract
	
}
class rect implements drawable{
	int a;
	rect(){
		System.out.println("constructor of rectangle");
		int a=12;
		System.out.println("a is"+a);

	}
	void show() {
		
		System.out.println("show of rectangle");
	}
	
	public void draw() {
		
		System.out.println("draw the rectangle");
	}
}
class circ extends rect implements drawable{
	circ(){
		super();
		System.out.println("circle class constructor");
	}
public void draw() {
		
		System.out.println("draw the circle");
	}
void show() {
	
	System.out.println("show of circle");
	super.show();
}
	
}

public class interface1 {

	public static void main(String[] args) {
		//circle2 c3=new circle();
circ c1=new circ();
c1.draw();
c1.show();
	}

}
