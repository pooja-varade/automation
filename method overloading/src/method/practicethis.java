package method;

public class practicethis {
	
	practicethis(){
		this(10.5);
		System.out.println("this is zero parametrized constructor");
		
	}
	practicethis(int a){
		//this();
		System.out.println("this is int parametrized constructor"+a);
	}
	practicethis(double d){
		this(10);
		
		System.out.println("this is double parametrized constructor"+d);
	}

	
	

	public static void main(String[] args) {
		practicethis pt=new practicethis();
		
		practicethis pt2=new practicethis(50);
	}

}
