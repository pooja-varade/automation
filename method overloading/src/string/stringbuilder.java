package string;

public class stringbuilder {

	public static void main(String[] args) {
		StringBuilder sb=new StringBuilder("java");
		System.out.println(sb);
		StringBuilder sb1=new StringBuilder("java");
		System.out.println(sb1);
		System.out.println(sb.equals(sb1));
		System.out.println(sb==sb1);
		//sb.append("class");
		System.out.println(sb);
		System.out.println(sb.toString().equals(sb1.toString()));
	}

}
