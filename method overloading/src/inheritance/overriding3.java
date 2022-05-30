package inheritance;

class parent2{
	private void  m1() {
		
		System.out.println("mi is private method");
	}
	protected void m2() {
		
		System.out.println("protected m2 method of parent class");
	}
	
	
}
class child2 extends parent2{
	
	
	
 private void m1() {
		
		System.out.println("mi is private method of child class");
	}
	public void m2() {
		this.m1();
		System.out.println("public  m2 method of parent class");
	}
	
	
}

public class overriding3 {

	public static void main(String[] args) {
		child2 c1=new child2();
		c1.m2();
		parent2 p1=new child2();
		p1.m2();
		parent2 p2=new parent2();
		p2.m2();

	}

}
