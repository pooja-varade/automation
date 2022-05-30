package arrayprogram;

import java.util.Arrays;

public class mdarray {

	public static void main(String[] args) {
		char []copyfrom= {'a','c','b','d','e','f'};
		char []copyto=new char[4];
		System.arraycopy(copyfrom, 1, copyto, 0, copyto.length);
		for(char c:copyto) {
			
			System.out.println(c);
		}
		char []clonearr=copyfrom.clone();
		for(char c:clonearr) {
			
			System.out.println(c);
		}
		System.out.println(Arrays.equals(clonearr,copyfrom));
		char []newcopy=Arrays.copyOf(copyfrom, 3);
		for(char c:newcopy) {
			
			System.out.println(c);
		}
		Arrays.sort(copyfrom);
	for(char c:copyfrom) {
			
			System.out.println(c);
		}

	}

}
