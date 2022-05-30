package inheritance;

class emp{
	void display() {

			System.out.println("I am Employee class display()...");
			
		
	}
	
}
class student extends emp{
	void display() {
		System.out.println("I am student class display()...");
		super.display();
		
	}
	void callme() {
		System.out.println("I am student class callme()...");
		display();
		super.display();
	}
	
}

public class inheritance9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		student s=new student();
		s.display();
		s.callme();
		

	}

}
