package inheritance;

class fruit{
	
	fruit(int a){
		System.out.println("zero parametrize constructor");
	}
	public void taste() {
		System.out.println("Fruits are sweet");
	}
	
}
 class apple extends fruit{
	
	apple(){
	super(10);
		
		System.out.println("apple class constructor");
	}
	public void shape() {
		
		System.out.println("apple are round");

	}
}

 public class inheritance02 {

	public static void main(String[] args) {
	apple a=new apple();
	a.taste();
	a.shape();


	}

}
