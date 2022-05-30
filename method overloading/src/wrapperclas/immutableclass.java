package wrapperclas;


final class testimmutable{
	
	final String name;
	final int salary;
	testimmutable(String s1,int num1){
		
		name=s1;
		salary=num1;
	}
	public String getname() {
		
		return name;
	}
	public int getsalary() {
		
		return salary;
	}
	
	
}

public class immutableclass {

	public static void main(String[] args) {
		
		testimmutable t1=new testimmutable("nitin",23452);
		System.out.println(t1.getname());
		
		System.out.println(t1.getsalary());
		
		
	}

}
