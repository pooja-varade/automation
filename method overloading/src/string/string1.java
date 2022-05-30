package string;

import java.util.Scanner;

public class string1 {

	public static void main(String[] args) {

		String str="dhanori pune";
		char c=str.charAt(2);
		System.out.println(c);
		
		System.out.println("to print one by one character");
		for(int i=0;i<str.length();i++) {
			
			System.out.println(str.charAt(i));
		}
		
		
		System.out.println("print charcter from last index");
		for(int i=str.length()-1;i>0;i--) {
			
			System.out.println(str.charAt(i));
		}
		
		String temp="";
		for(int i=str.length()-1;i>0;i--) {
			
			temp=temp+str.charAt(i);
		}
		System.out.println(temp);
		
		System.out.println(reverse("pooja"));
		
		String s2="banglore";
		System.out.println(reverse(s2));
		
		Scanner sc=new Scanner(System.in);
		String s3;
		System.out.println("ther the string to be reverse");
		s3=sc.next();
		System.out.println(reverse(s3));
		
		String []strarr=str.split(" ");
		for(String s:strarr) {
			
			System.out.println(s);
		}
		
		String s4="i  am from  pune";
		String []sarr=s4.split("");
		String temp1=" ";
		for(String s:sarr) {
			
			System.out.println(s);
		}
	
		for(int i=s4.length()-1;i>=0;i--) {
			
		temp1=temp1+sarr[i];
		}
		System.out.println("reverse string "+temp1);
		
		
		String s5="     pooja love puneet  ";
		System.out.println(s5.length());
		System.out.println(s5.trim());
		System.out.println(s5.length());
		System.out.println("Actual String length without spaces: "+s5.trim().length());
		
		String st="pune"+235363;
		System.out.println(st);
		String str1="manual";
		System.out.println(str1.substring(1,3));
		//System.out.println(str1);
		System.out.println(str.isEmpty());
		String s6="pooja";
		String s7="pooja";
		System.out.println(s6.concat(s7));
		
	
	
	}
	
	static String reverse(String str) {
		String temp="";
		for(int i=str.length()-1;i>=0;i--)
		{
		System.out.println(str.charAt(i));	
			
		}
		return temp;
		
	}

}
