package arrayprogram;

public class systemclasspractice {

	public static void main(String[] args) {
	System.out.println("system user directyory"+System.getProperty("user.home"));
	System.out.println("user current working directory"+System.getProperty("user.dir"));
	
	//clear the property
	System.clearProperty("user.home");
	System.out.println("system user directyory"+System.getProperty("user.home"));
	System.setProperty("user.country", "IND");
	System.out.println(System.getProperty("user.country"));

	}

}
