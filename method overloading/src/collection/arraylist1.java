package collection;

import java.util.ArrayList;

public class arraylist1 {

	public static void main(String[] args) {
	ArrayList list=new ArrayList();
	System.out.println(list);
	System.out.println(list.isEmpty());
	list.add("pooja");
	list.add("puneet");
	list.add("jenit");
	System.out.println(list);
	
	ArrayList arr=new ArrayList();
	System.out.println(arr);
	arr.add("shubham");
	arr.add("amit");
	System.out.println(arr);
	list.addAll(arr);
	System.out.println(list);
	list.addAll(1, arr);
	
	System.out.println(list);
	
	System.out.println(arr);
	}

}
