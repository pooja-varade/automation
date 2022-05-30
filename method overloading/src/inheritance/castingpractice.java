package inheritance;
class sample{
	
	double test1() {
		System.out.println("running test 1");
		
		return 4;
	}
}
class childy extends sample{
	
	void show()
	{
		
		System.out.println("this is show meyhod");
	}
	
}

public class castingpractice {

	public static void main(String[] args) {

	childy c1=new childy();
	c1.show();
	sample p1=new childy();
	
	childy c2=(childy)p1;
	c2.test1();
	
		

	}

}
