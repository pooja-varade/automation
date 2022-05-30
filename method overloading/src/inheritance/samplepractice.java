package inheritance;
class abc{
	abc(){
		
	System.out.println("zero parametrize constructor");	
	}
	abc(int i){
		this ();
		System.out.println(" parametrize constructor");	
	}
	
	static int age=20;
	char ch='p';
	double salary=2.55d;
	void print() {
		
		
		System.out.println("printing value");
	}
	void run() {
		
		System.out.println("running method");
	}
	
}
class xyz extends abc{
	double salary=30;
	void display() {
		
		System.out.println("xyz method");
		System.out.println(super.salary);
	}
	void print() {
		
		System.out.println("printing xyz");
		super.print();
	}
	
	
}

public class samplepractice {

	public static void main(String[] args) {
		abc a2=new abc(10);

		xyz x1=new xyz();
		x1.print();
		x1.display();
		abc a1=new xyz();
		//a1.run();
	}

}
