package inheritance;

abstract class ani{
	
	public abstract void show();
	void run() {
		
		System.out.println("run method");
	}
}

interface runnable{
	
	void running();
}
class dog4 extends ani implements runnable{
	
	public void show() {
		
		System.out.println("show method");
	}
	public void running() {
		System.out.println("running method");
		
	}
	
	
}

public class interface4 {

	public static void main(String[] args) {
		dog4 d1=new dog4();
		d1.run();

	}

}
