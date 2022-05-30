package method;





public class constructor {
	static int age;
	double salary;
	
	constructor(){
		System.out.println("zero parametrize constructor");
		
	}
	constructor(int a){
		age=a;
		//System.out.println("age"+age);
		
		
	}
	
	constructor(double a){
		
		salary=a;
		//System.out.println("salary"+salary);
	}
	constructor(int a,double b){
		
		age=a;
		salary=b;
		System.out.println("both paramert");
		
	}


	public static void main(String[] args) {
		
		constructor c1= new constructor();
		System.out.println(c1.age);
		System.out.println(c1.salary);
		constructor c2= new constructor(20);
		System.out.println(c2.age);
		constructor c3= new constructor(20,10.00);
		System.out.println(c3.age);
		System.out.println(c3.salary);
		
	

	}

}
