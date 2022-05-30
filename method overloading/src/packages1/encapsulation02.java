package packages1;
class encapdemo{
	
	private int age;
	private double salary;
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}
	
}

public class encapsulation02 {

	public static void main(String[] args) {
		encapdemo e1=new encapdemo();
		System.out.println(e1.getAge());
		System.out.println(e1.getSalary());
		e1.setAge(26);
		e1.setSalary(20.500);
		System.out.println("*******************************88");
		
		System.out.println(e1.getAge());
		System.out.println(e1.getSalary());
	}

}
