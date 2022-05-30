package string;

class parent{
	String s1="abc";

}

public class objectpractice extends parent {

	int rollno;
	int lastroll;
	
	 void print() {
		 
		 System.out.println("void matheod");
	 }
	
	 objectpractice(){
		 
		 rollno=5;
		 lastroll=54;
	 }
	 @Override
	 public String toString() {
		 
		 return "basic java";
	 }
	
	
	public static void main(String[] args) {
		objectpractice o1=new objectpractice();
		objectpractice o2=new objectpractice();
		System.out.println(o1);
		
		System.out.println(o1.hashCode());
		System.out.println(o1.equals(o2));
		System.out.println(o1.toString());
	}

}
