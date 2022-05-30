package inheritance;

class animaly{
	
void run() {
	
	System.out.println("animal can run");
}
	
}
class dogy extends animaly{

	void run() {
	System.out.println("dog can run");
	
}
}

class cat extends animaly{
	
void run() {
	System.out.println("cat can run");
}
}

class hourse extends animaly{
	void run() {
	

	System.out.println(" hourse can run");
}
}

public class polimorphism3 {

	public static void main(String[] args) {
		
		animaly a1=new animaly();
		animaly a2=new hourse();
		a2.run();
		animaly d=new dogy();
		d.run();
		animaly c =new cat();
		c.run();

	}

}
