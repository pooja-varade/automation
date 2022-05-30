package string;

import java.util.Scanner;

public class samplestring {

	public static void main(String[] args) {
		String s1="poojalovepuneet";
		String s2=new String("poojalovepuneet");
		System.out.println(s1.equals(s2));
		System.out.println(s1==s2);
		System.out.println(s1.length());
		System.out.println(s1.toString());
		char c=s1.charAt(1);
		System.out.println(c);
		for(int i=0;i<s1.length();i++) {
			
			System.out.println(s1.charAt(i));
		}
		String temp="";
		for(int i=s1.length()-1;i>=0;i--) {
			
			temp=temp+s1.charAt(i);
		}
		System.out.println(temp);
		System.out.println(s1);
		
		palindrom(s1);
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the number to palindrom");
		String s4=sc.next();
		palindrom(s4);
		String str="amit";
		String str1="rani";
		String s5=str.concat(str1);
		
		System.out.println(s5);

	}
	
	static void palindrom(String str) {
		
		String s1=str;
		String temp="";
		for(int i=s1.length()-1;i>=0;i--) {
			
			temp=temp+s1.charAt(i);		
			}
		
	
	if (temp.equals(s1)){
		
		System.out.println("palindrom"+str);
	}
	else {
		
		System.out.println("not palindrom"+str);
	}

}
}
