package inheritance;

class company{
	char companyname;
	company(){
		System.out.println("this is company constructor");
		companyname='a';
		
	}
	company(int i){
		this();
		System.out.println("this is parametrize constructotr");
		
		
	}
	public void display() {
		
	
			System.out.println("I am company class display()...");
			System.out.println(companyname);
		
		
	}
	public void display(int a) {
		this.display();
		System.out.println("I am company class display(). with parametrize method..");

	}
	
	
}
class employee extends company{
	
	char companyname;
	employee(){
		super(20);
		System.out.println("this is emp constructor");
		companyname='b';
		
	}
	employee(int a){
		
		System.out.println("this is emp parametre contrsuctor");
	}
	public void display() {
		
		
		System.out.println("I am company class display()...");
		System.out.println(companyname);
		System.out.println(super.companyname);
	
	
}
	public void getemp(double b) {
		super.display();
		System.out.println("this is getemp method");
		
	}
public void getemp(double b,int c) {
	System.out.println("this is getemp method with two parameter");
		
	}
	
}

public class inheritance10 {

	public static void main(String[] args) {
	employee e=new employee();
	e.display();

	}

}
