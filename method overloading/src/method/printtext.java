package method;

public class printtext {

	public static void main(String[] args) {
		/*int counter=0;
int num=23456;

	for(;num!=0;num/=10,counter++) {
	}	
	
	System.out.println(counter);
	}

}*/
//this is program is count the number of digit in integer

int num=12345;
int counter=0;

while(num!=0);{
	
	num/=10;
	++counter;
	//System.out.println(counter);
	
}
System.out.println(counter);
}
}