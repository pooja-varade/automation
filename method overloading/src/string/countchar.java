package string;

public class countchar {

	public static void main(String[] args) {
		String s1="helo java";
		int count=0;
		for(int i=0;i<=s1.length()-1;i++) {
			
			if(s1.charAt(i)!=' ') {
				count++;
				
			}
		}
		System.out.println(count);

	}

}
