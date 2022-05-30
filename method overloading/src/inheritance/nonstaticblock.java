package inheritance;

public class nonstaticblock {
	
	
	final int age;
	nonstaticblock(){
		
		
		System.out.println("zero parametrized constructor");
	}
	{
		
		age=20;
		System.out.println("System.out.println"+age);
	}

	public static void main(String[] args) {
		
nonstaticblock n1=new nonstaticblock();
	}

}
