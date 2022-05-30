package collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

public class arraylist {

	public static void main(String[] args) {
		ArrayList list=new ArrayList();
		list.add("mango");
		list.add("apple");
		list.add("peru");
		list.add("chiku");
		System.out.println(list.size());
		System.out.println(list);//here tostring method is overrided
		
		//traversing the list using for loop
		
		for(int i=0;i<list.size();i++) {
			
			System.out.println(list.get(i));
		}
		//using for each loop
		for(Object o:list) {
			
			System.out.println(o);
		}
		System.out.println("*******************************88");
		//for changing and updating existing object
		list.set(2, "banana");
		System.out.println(list);
		
		System.out.println(list.size());
		
		//collection sorting method
		Collections.sort(list);
		System.out.println(list);
		
		list.forEach(a->{
			System.out.println(a);
		});
		
		//traversing using iterator interface
		Iterator itr=list.iterator();
		//System.out.println(itr.hasNext());
		
		//System.out.println(itr.next());
	//	System.out.println(itr.next());
		//System.out.println(itr.next());
		//System.out.println(itr.next());
	while(itr.hasNext()) {
		
		System.out.println(itr.next());
		
	}
	System.out.println(list);
	System.out.println(list.indexOf("banana"));
		
		
	}

}
