package collection;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
public class hashset1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Set <String> s1=new HashSet<String>();
		s1.add("java");
		s1.add("oops");
		s1.add("math");
		s1.add("math");
		s1.add("english");
		System.out.println(s1);
		Iterator <String>itr=s1.iterator();
		while(itr.hasNext());
		{
			
			System.out.println(itr.next());
		}
		s1.remove("java");
		System.out.println(s1);
		System.out.println(s1);
		
		HashSet <String> str=new HashSet<String>();
		
		str.add("pooo");
		str.add("mooo");
		str.add("looo");
		str.add("gooo");
		System.out.println(str);

	}

}
