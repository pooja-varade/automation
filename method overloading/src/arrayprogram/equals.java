package arrayprogram;


class demo1{
	
	int age=20;
	void display() {
		
		System.out.println("display the method");
		
	}
	public int hashcode() {
		
		
		return age;
	}
	public String toString() {
		
		return "welcome to testing";
	}

	
	
}

public class equals {
	

	public static void main(String[] args) {
		equals e1=new equals();
		System.out.println(e1);
		System.out.println(e1.hashCode());
		equals e2=new equals();
		System.out.println(e1.equals(e2));
		 e2=e1;
System.out.println(e1.equals(e2));

demo1 d1=new demo1();
System.out.println(d1);
System.out.println(d1.toString());
demo1 d2=new demo1();
System.out.println(d2);
System.out.println(d2.hashCode());
System.out.println(d2.hashcode());


	}

}
