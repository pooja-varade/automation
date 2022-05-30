package method;

class demo{
	
	static  int age;
	double salary;
	static {
		System.out.println("this is executed first");
		
	}
	{
		
		System.out.println("this is executed before object create");
	}
	static void display() {
		
		age=25;
		System.out.println("age"+age);
		
	}
	double show() {
		
		salary=20.000;
		System.out.println(salary);
		return salary;
	}
	
	static void display(int a) {
		
		a=50;
		System.out.println(a);
	}
	
	
	
}





public class staticblock {
	
static int rollno;

static {
	System.out.println("static block for staticblock  class");
}

{
	
	System.out.println(" non static block for staticblock class");
}
static void display() {
	
	rollno=40;
	System.out.println("roll no is"+rollno);
}

	

	public static void main(String[] args) {
		System.out.println("this is main method");
	demo.display();
	demo d=new demo();
	d.show();
	staticblock.display();
	staticblock s=new staticblock();
	

		
		
	

	}

}
