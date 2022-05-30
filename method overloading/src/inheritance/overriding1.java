package inheritance;

 class animal{
	animal(){
		
		System.out.println("animal constructor");
	}
	public void move() {
	
		System.out.println("animal can move");
		
	}
	
	
}
class dog extends animal{
	dog(int a){
		super();
		System.out.println("dog have constructor");
		
		
	}
	public void move() {
		System.out.println("dog can move");
		super.move();
		
		
	}
	public void bark() {
		
		System.out.println("gog can can bark");
		
	}
	
	
}


public  class overriding1 {
	public void show() {
		
		System.out.println("show is running");
	}

	public static void main(String[] args) {
		
		animal a=new animal();
		a.move();
		dog d=new dog(20);
		d.move();
		

	}

}
