package inheritance;

interface printable{
	int a=20;
	void print();
	
}
interface showable{
	void show();
	
	
}

public class interface2 implements printable,showable {
	public void print() {
	System.out.println("print method");	
		
	}
	public void show() {
		System.out.println("show method");
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(printable.a);
		interface2 f1=new interface2();
		f1.show();
		f1.print();

	}

}
