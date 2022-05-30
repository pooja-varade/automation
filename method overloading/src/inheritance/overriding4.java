package inheritance;

class parent4{
	static void m1() {
		System.out.println("static m1 method");
		
	}
	void m2() {
		System.out.println("non static m2 method");
		
	}
	
	
}
class child4 extends parent4{
	static void m1() {
		
		System.out.println("static m1 method of child class");
	}
	void m2() {
		System.out.println("non static m2 method of child class");
		
	}
	
	
}

public class overriding4 {

	public static void main(String[] args) {
		
parent4 p1=new child4();
p1.m1();
p1.m2();
	}

}
