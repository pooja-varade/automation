package string;

public class removewhitespaces {

	public static void main(String[] args) {
		
		String s1="pooja is good girl";
		
		s1=s1.replaceAll("\\s+", "");
		System.out.println(s1);
		
		
	}

}
