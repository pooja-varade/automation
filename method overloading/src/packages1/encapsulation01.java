package packages1;
class animal{
	
	private int age=10;
	private char name='d';
	public int getage(){
		
		return age;
	}
	public char getname() {
		
		return name;
	}
	public void setage(int a) {
		
		this.age=a;
	}
	public void setname(char c) {
		
		this.name=c;
	}
}

public class encapsulation01 {

	public static void main(String[] args) {
		
animal a1=new animal();
System.out.println(a1.getage());
System.out.println(a1.getname());
a1.setage(20);
a1.setname('p');
a1.getname();
System.out.println(a1.getage());
System.out.println(a1.getname());

	}

}
