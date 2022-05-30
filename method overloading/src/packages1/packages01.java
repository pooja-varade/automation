package packages1;
//import inheritance.overriding1;

class fruit{
	int fruitage;
	fruit(){
		
		fruitage=7;
	}
	void taste() {
		
		System.out.println("fruit taste is good");
	}
	
	
}
class orange extends fruit{
	int fruitage;
	orange(){
		super();
		fruitage=5;
		
	}
	void taste() {
		
		System.out.println("orange taste is good");
		super.taste();
		System.out.println(fruitage);
		System.out.println(super.fruitage);
	}
	
}
public class packages01{
	
	public static void main(String args[]) {
		
		orange o=new orange();
		o.taste();
		fruit f=new orange();
		f.taste();
	}
}
