package inheritance;

class parent6{
	void show() {
		
		System.out.println("parent show method");
	}
	
}
class child6 extends parent6{
	
void show() {
		//super.show();
		System.out.println("child show method");
	}
	
}
class grandchild extends child6{
void show() {
		//.show();
		System.out.println("grand child show method");
	}
	
}

public class overriding5 {

	public static void main(String[] args) {
	
parent6 p1=new grandchild();

p1.show();
	}

}
