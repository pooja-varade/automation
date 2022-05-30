package method;

public class swtchcal {

	public static void main(String[] args) {
		int num1=10;
		int num2=30;
		char op='%';
		switch (op) {
		
		case '-':
			int res=num2-num1;
			System.out.println("result"+res);
			break;
			
		case '+':
			res=num2+num1;
			System.out.println("addition result"+res);
			break;
			
		case '%':
			res=num2%num1;
			System.out.println("modulas result"+res);
			
	break;
default:
	
	System.out.println("display result as default");
		
		}
		
		cal('+',10,10);
	}
	
	
	
	static double cal(char op,int num1,int num2) {
		
		int res=0;
		switch(op) {
		case '+':
			res=num1+num2;
			System.out.println("addition is"+res);
			return res;
		case '-':
			res=num1-num2;
			System.out.println("substarction is"+res);
			return res;
			default:
				System.out.println("calculater");
				return res;
			
		
		}
		
		
	}

}
