package wrapperclas;

final class single{
	
	final int age;
	final String name;
	single(int a,String n){
		
		age=a;
		name=n;
		System.out.println(age+"  "+name);
		
	}
	public int getage() {
		
		return age;
	}
	
}

public class singelton2 {

	public static void main(String[] args) {
		single s1=new single(2,"pooja");
		System.out.println(s1.getage());

	}

}
