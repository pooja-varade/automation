package inheritance;

class vehicale{
	 public void wheels() {
		 
		 System.out.println("vehical has wheels");
	 }
	
}
class car1 extends vehicale{
	public void countwl() {
		
		System.out.println("car has wheels");
	}
	
	
}
class bike extends vehicale{
	
	public void countwlc() {
		System.out.println("I am a car and has 4 wheels");
	}
	
}
class scooter extends vehicale{
	
	public void countwls() {
		System.out.println("I am a scooter and has 2 wheels");
	}
}



public class inheritance4 {

	public static void main(String[] args) {
		
scooter sc=new scooter();
sc.wheels();
sc.countwls();
car1 c=new car1();
c.countwl();
c.wheels();
		
	}

}
