package string;

public class stringbuffer {

	public static void main(String args[]) {
		
		StringBuffer sb=new StringBuffer("hello");
		sb.append("java");
		System.out.println(sb);
		sb.insert(5, "pune");
		System.out.println(sb);
		sb.replace(1, 3, "ppppp");
		System.out.println(sb);
		StringBuffer sb1=new StringBuffer("manual");
		sb.toString();
		sb1.toString();
		System.out.println(sb.equals(sb1));
		sb.replace(2,5,"pooja");
		System.out.println(sb);
		
	}
	
}
