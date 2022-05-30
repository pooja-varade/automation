package inheritance;

class A1{
	static  int a=10;
	int b=20;
	
	
	
}
class B1 extends A1{
	
	static int x=30;
	int y=40;
	
}



public class inheritance01 {

	public static void main(String[] args) {
	
             B1 s=new B1();
            System.out.println( s.b);
            System.out.println( s.y);
            System.out.println(A1.a);
            
            
	}

}
