package arrayprogram;
class demo{
	
	void display() {
		
		System.out.println("i am display method");
	}
}
class objectclass extends demo{	

	
	static int last_roll = 100;
	int roll_no;
	// Constructor
	objectclass()
    {
        roll_no = last_roll;//100
        last_roll++;//101
    }
	@Override
	void display() {
		System.out.println("I am display() of class ObjectClass2");
	}
	@Override
	public int hashCode() {
		return roll_no;
	}
	@Override
	public String toString() {
		
		return "this is basic";
		
	}
	

	public static void main(String[] args) {
		
		objectclass ob=new objectclass();
		System.out.println(ob);
		System.out.println(ob.toString());


System.out.println(ob.hashCode());
System.out.println(ob.toString());
	}

}
