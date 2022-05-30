package inheritance;

public class poly1 {
	
	static void addnumber() {
		
		System.out.println("addition function");
		
	}
    static void addnumber(int a,int b) {
    	int c=a+b;
    	System.out.println(c);
	
}
    
    static void addnumber(int a,int b,int c) {
    	
    	int result =a+b+c;
    	System.out.println(result);
    	
    }
	public static void main(String[] args) {
	
	addnumber();
	addnumber(10,20);
	addnumber(10,20,30);

	}

}
