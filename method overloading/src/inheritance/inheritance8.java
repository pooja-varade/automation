package inheritance;


class fruitA{
	int fruitno;
	fruitA(){
		System.out.println("fruit  constructor");
		fruitno=5;
		
	}
	public void taste() {
		
		System.out.println("fruit is nice in taste");
	}
	
}
class mango extends fruitA{
	
	int fruitno;
	mango(){
		System.out.println("mango constructor");
		fruitno=7;
		
	}
	public void taste() {
		System.out.println("mango is sweet");
		
	}
	public void shape() {
		
		System.out.println("mango is round");
		System.out.println(fruitno);
		System.out.println(super.fruitno);
		taste();
		super.taste();
		
	}
	
}

public class inheritance8 {

	public static void main(String[] args) {
		mango m=new mango();
		m.shape();

	}

}
