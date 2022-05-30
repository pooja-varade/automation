package inheritance;

class grandfather{
	grandfather(){
		System.out.println("this grandfather constructor");
		
	}
	void myhome() {
		System.out.println("I am home of Grandfather");
		
	}
	
	
}

class father extends grandfather{
	
	father(double d){
		//super();
		System.out.println("this is father constructor");
		
	}
	void mycar() {
		System.out.println("I am car  of father");
		
		
	}
	
}
class child  extends father{
	
	child(int i){
		super(10.2);
		System.out.println("i am child class constructor");
	}
	
	void myBike() {
		System.out.println("I am bike of child");
	}
}


public class inheritance6 {

	public static void main(String[] args) {
		//father f= new father(10.2);
		//f.myhome();
	child c1=new child(10);
	c1.myhome();
	c1.mycar();
	c1.myBike();
	father f1=new child(10);
	f1.mycar();
	

	}

}
