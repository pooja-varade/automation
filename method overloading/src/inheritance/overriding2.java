package inheritance;

class animal2{
	
	public void move() {
		
		System.out.println("animal can move");
	}
	
}
class dog2 extends animal2{
public void move() {
		//super.move();
	System.out.println("dog can move");
	
	}
	
	
}
public class overriding2 {

	public static void main(String[] args) {
	
animal2 a1=new dog2();
a1.move();
	}

}
