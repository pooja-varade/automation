package collection;

import java.util.ArrayList;

public class arraylist3 {

	public static void main(String[] args) {
		ArrayList <Integer>al=new ArrayList();
		al.add(10);
		al.add(20);
		al.add(30);
		System.out.println(al);
		
		ArrayList <String> arr=new ArrayList();
		
		arr.add("ravi");
		arr.add("ajay");
		arr.add("vijay");
		arr.add("gaurav");
		System.out.println(arr);
		System.out.println(arr.remove("vijay"));
		System.out.println(arr);
		
		System.out.println("*********************8");
		ArrayList <String> al2=new ArrayList();
		
		al2.add("hanuman");
		al2.add("shankar");
		System.out.println(al2);
		arr.addAll(al2);
		System.out.println(arr);
		arr.removeAll(al2);
		System.out.println(arr);
		arr.removeIf(str->str.contains("ravi"));
		System.out.println(arr);

	}

}
