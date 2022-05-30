package collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Vector;

public class vector {

	public static void main(String[] args) {
		Vector<String> v1=new Vector<String>();
		System.out.println(v1.capacity());
		System.out.println(v1.size());
		v1.addElement("pooja");
		v1.addElement("puneet");
		v1.addElement("rucha");
		v1.addElement("rucha");
		v1.addElement("rucha");
		v1.addElement("rucha");
		v1.addElement("rucha");
		v1.addElement("rucha");
		v1.addElement("rucha");
		v1.addElement("rucha");
		v1.addElement("rucha");
		System.out.println(v1.size());
		System.out.println(v1.capacity());
		System.out.println(v1);
		
		for(int i=0;i<v1.size();i++) {
			
			System.out.println(v1.get(i));
		}

		v1.remove("pooja");
		System.out.println(v1);
		
		
		v1.removeIf(str->str.contains("rucha"));
		System.out.println(v1);
		
		List <Integer> l1=new ArrayList<Integer>();
		
		l1.add(10);
		l1.add(20);
		l1.add(70);
		l1.add(40);
		System.out.println(l1);
		Collections.sort(l1);
		System.out.println("after sorting "+l1);
		Collections.reverse(l1);
		System.out.println("after sorting "+l1);
		Iterator itr=l1.iterator();
		while(itr.hasNext()) {
			
			System.out.println(itr.next());
		}
		
		
		
	}

}
