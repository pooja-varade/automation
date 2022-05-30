package inheritance;





class A2 {
	void msg() {
		System.out.println("Hello");
	}
}
class B2 {
	void msg(int a) {
		System.out.println("Welcome");
	}
}
class inheritance5 extends A2,B2{
	inheritance5(){
		super();//confusion 
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		inheritance5 obj = new inheritance5();
		obj.msg();

	}

}
