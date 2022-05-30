package inheritance;

public class encapsulated {
	
	private int number=50;
	private double salary=20.5;
	
	public int getnum() {
		
		return number;
	}
	public void setnum(int i) {
		
		number=i;
		
	}
	public void setsalary(double sal) {
		
	this.salary=sal;
	}

	public static void main(String[] args) {
	
		encapsulated e1=new encapsulated();
		System.out.println(e1.getnum());
		e1.setnum(20);
		//e1.setsalary(2.5);
		System.out.println(e1.getnum());

	}

}
