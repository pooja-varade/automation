package collection;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.TreeSet;

public class treeset {

	public static void main(String[] args) {
		TreeSet <String> t1=new TreeSet<String>();
		t1.add("d");
		t1.add("b");
		t1.add("g");
		t1.add("ahemdabad");
		System.out.println(t1.size());
		System.out.println(t1);
		
		Iterator itr=t1.iterator();
		while(itr.hasNext()) {
			
			System.out.println(itr.next());
		}
		Iterator i=t1.descendingIterator();
		while(i.hasNext()) {
			
			System.out.println(i.next());
		}
		System.out.println("***********************");
		System.out.println(t1.pollFirst());
		System.out.println(t1.descendingSet());
		System.out.println(t1.headSet("b",true));
		
		List <String> l1=new ArrayList<String>();
		l1.add("pooja");
		l1.add("yuiyu");
		l1.add("shuuu");
		
		TreeSet <String>t2=new TreeSet<String>(l1);
		System.out.println(t2);
		System.out.println(t2.last());
		

	}

}
