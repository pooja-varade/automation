package method;

public class This123 {
	int rollno=60;
	float fees;
	
	This123(int rollno){
		//this(111);
		this.rollno=rollno;
		System.out.println(rollno);
		
		
	}
	This123(float fees){
		
		//this(rollno);
		this.fees = fees;
	}
	void display() {
		
		System.out.println(rollno + " " + fees);
	}

	public static void main(String[] args) {
		This123 t=new This123(20);
		
		
		//This123 t1=new This123(20.00f);
		//t.display();
		//t1.display();
		

	}

}
