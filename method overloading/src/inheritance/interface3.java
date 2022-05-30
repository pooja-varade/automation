package inheritance;
interface printable2{
	
	 void show();
			

interface showable2 extends printable{
	void print();
	
}

public class interface3 implements showable2 {
	 public void print() {
		
		System.out.println("print method");
	}
	 public void show() {
		 
		 System.out.println("show method");
		 
	 }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
interface3 f1=new interface3();
f1.show();
	}

}
}