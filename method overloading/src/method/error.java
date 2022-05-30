package method;

public class error {
	
	
	
	
	double sum(int a,int b) {
		
		System.out.println(a+b);
		return (a+b);
	}
	double sum(int a,double b) {
		System.out.println(a+b);
		return(a+b);
	}

	public static void main(String[] args) {
		error e=new error();
		double result=e.sum(10,10);
		 double result2=e.sum(20,10.00);
		 System.out.println(result);
		

	}

}
