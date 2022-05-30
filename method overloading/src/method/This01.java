package method;

public class This01 {
	
	This01(){
		System.out.println("this is zero parametrize contructor");
		
	}
	This01(int a){
		this(25.5f);
		System.out.println("this is  parametrize contructor of int type");
	}
	This01(float b){
		this(20,5.5f);
		
		System.out.println("this is zero parametrize contructor of float type");
	}
	This01(int a,float b)
	{
		this();
		System.out.println("this is zero parametrize contructor of int and float type");
		
	}
	

	public static void main(String[] args) {
		This01 t=new This01();
		This01 t1=new This01(10);
		This01 t2=new This01(2.0f);
		This01 t3=new This01(10,20.0f);
		

	}

}
