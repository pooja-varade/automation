package string;

public class vowelconstant {

	public static void main(String[] args) {
		String str="I am Pooja VARADE";
		
	int vcount=0;
	int ccount=0;
	str=str.toLowerCase();
	
	for(int i=0;i<str.length();i++) {
		
		if(str.charAt(i)=='a'||str.charAt(i)=='e'||str.charAt(i)=='i'||str.charAt(i)=='o'||str.charAt(i)=='u') {
			
			vcount++;
			
		}else if (str.charAt(i)>='a'&& str.charAt(i)<='z') {
			
			ccount++;
		}
	}
	System.out.println("vowels are"+"  "+vcount+ "\nconstatnt are"+ccount);
	

	}

}
