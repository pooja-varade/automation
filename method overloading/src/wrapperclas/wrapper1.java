package wrapperclas;

public class wrapper1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int age=20;
		Integer obj=45;//implicit auto boxing
		Integer obj1=new Integer(age);
		System.out.println(obj1);
		System.out.println(age==obj1);

		Double d1=new Double(25.6);
		System.out.println(d1);
		Double salary=d1.doubleValue();
		System.out.println(salary);
	}

}
