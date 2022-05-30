package method;

class vehical{
	vehical(){
		
		System.out.println("vehical constructor");
	}
	void wheels() {
	
		System.out.println("vehical has wheels");
		
	}
	
}
class car extends vehical{
	car(){
		super();
		System.out.println("car constructor");
		
	}
	void countwl() {
		
		System.out.println("car has four wheels");
		super.wheels();
	}
	
}
class scooter extends vehical{
	scooter(){
		super();
		System.out.println("scooter constructor");
	}
	
	void countscwl() {
		
		System.out.println("scooter has two wheels");
		super.wheels();
	}
}



public class constructor1{
	
 public static void main(String args[]) {
	 
	 scooter s1=new scooter();
	 s1.wheels();
	
	 s1.countscwl();
	 
	 vehical v1=new car();
	 v1.wheels();
 }
	

}
