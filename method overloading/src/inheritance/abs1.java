package inheritance;

abstract class demo3{
	demo3(){
		
		System.out.println("demo3 constructor");
	}
	
	abstract void show();
	void run() {
		System.out.println("run is method");
	}
}
class demo2 extends demo3{
	demo2(){
		
		System.out.println("demo2 constructor");
	}
	void show() {
		
		System.out.println("show is method");
	}
	double getintrest() {
		
		return 2.7;
	}
	void run() {
		System.out.println("run is method of demo2");
		super.run();
	}
	
}

public class abs1 {

	public static void main(String[] args) {
	demo2 d1=new demo2();
	d1.show();
	d1.run();
	

	}

}
