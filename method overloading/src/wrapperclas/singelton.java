package wrapperclas;

class demo1223{
	private demo1223() {
		
		
	}
	static demo1223 d1=new demo1223();
	static demo1223 d2=new demo1223();
	String name="pooja";
	
	static demo1223 getinstance() {
		
		return d1;
	}
static demo1223 getinstance1() {
		
		return d2;
	}
	void print() {
		
		System.out.println("print of demo1223");
	}
	
	
}

public class singelton {

	public static void main(String[] args) {
	
		System.out.println(demo1223.d1.getinstance());
		
		demo1223 xyz=demo1223.getinstance();
		demo1223 xyz1=demo1223.getinstance1();
		System.out.println(demo1223.getinstance().name);
		xyz.print();
		System.out.println(xyz.name);

	}

}
