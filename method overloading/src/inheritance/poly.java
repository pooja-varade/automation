package inheritance;

class animal1
{
	void eat() {
		
		System.out.println("animal can eat");
	}
	
}
class dog1 extends animal1{
	void eat() {
	System.out.println("dog can eat");
}
}

class cat1 extends animal1{
	void eat() {
		
		System.out.println("cat can eat");
	}
	
	
}

public class poly {

	public static void main(String[] args) {
		animal1 a1=new animal1();
		animal1 a2=new dog1();
		animal1 a3=new cat1();
		a2.eat();
		a3.eat();

	}

}
