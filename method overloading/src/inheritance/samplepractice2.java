package inheritance;


abstract class sample1{
	double salary=2.5;
	final int age=45;
	
	abstract void run();
	 public double getsalary() {
		System.out.println("age"+age);
		return salary;
	}
	
}

public class samplepractice2 extends sample1{
	public void run() {
		
		System.out.println("run method");
	}

	public static void main(String[] args) {
	samplepractice2 s1=new samplepractice2 ();
	s1.getsalary();

	}

}
