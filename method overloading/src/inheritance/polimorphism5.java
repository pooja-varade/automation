package inheritance;

class bank1{
	
	 float getintrest() {
		
		return 2.1f;
	}
	
}
class sbi extends bank1{
	  float getintrest() {
		
		return 3.5f;
	}
	
	
}
class pnb extends bank1{
 float getintrest() {
		
		return 5.7f;
	}
	
	
}


public class polimorphism5 {

	public static void main(String[] args) {
		
		bank1 b1 =new bank1();
	b1.getintrest();
	bank1 b2=new sbi();
	System.out.println(b2.getintrest());
	b2=new pnb();
	System.out.println(b2.getintrest());

	}

}
