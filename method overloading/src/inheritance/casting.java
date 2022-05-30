package inheritance;

class parent{
	
	void show() {
		
		System.out.println("parent show method");
	}
	
	
}

class child1 extends parent{
	
	void run() {
		
		System.out.println("run method");
	}
	
	
}
class grandson extends child1{
	void display() {
		
		System.out.println(" display method");
	}
	
	
	
}

public class casting {

	public static void main(String[] args) {
		grandson g1=new grandson();
	parent p1=new grandson(); 
	//	parent p1=(parent)g1;
		p1.show();
	child c1=(child)p1;

	}

}
