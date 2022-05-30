package string;

public class stringbuffer2 {

	public static void main(String[] args) {
		StringBuffer sb=new StringBuffer();
		System.out.println(sb.capacity());
		sb.append("java");
		System.out.println(sb);
		System.out.println(sb.capacity());
		sb.append("i am from  gujrat and aharastra");
		System.out.println(sb.capacity());
		sb.reverse();
		System.out.println(sb);
	

		String s1="puneer";
		String s2=new String("puneer");
		System.out.println(s1);
		sb.append("love");
		System.out.println(sb);
		System.out.println(sb);
		
		System.out.println(s1.concat("masala"));
		System.out.println(s1);
		System.out.println(s1.length());
		
		System.out.println((s1==s2));//it compare object based on adress
		System.out.println(s1.equals(s2));//based on value
		
		char c=s1.charAt(0);
		System.out.println(c);
		for(int i=0;i<s1.length();i++) {
			
			System.out.println(s1.charAt(i));
		}
		
		System.out.println(reverse("mumbai"));
		
		String str=new String("banglore");
		String []starr=str.split("n");
		for(String s:starr) {
			
			System.out.println(s);
		}
	}
	
	static String reverse(String str) {
		
		String temp="";
		for(int i=str.length()-1;i>=0;i--) {
			
			temp=temp+str.charAt(i);
			
		}
		return temp;
		
	}

}
