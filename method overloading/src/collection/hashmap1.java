package collection;

import java.util.HashMap;
import java.util.Map;

public class hashmap1 {

	public static void main(String[] args) {
		HashMap <Integer,String>hm=new HashMap<Integer,String>();
		
		hm.put(1, "mumbai");
		hm.put(2, "bombay");
		hm.put(null, "banglore");
		for(Map.Entry m:hm.entrySet()){
			
			System.out.println(m.getKey()+" "+m.getValue());
		}
		
		HashMap<Integer,String> s1=new HashMap<Integer,String>();
		s1.put(2, "rakesh");
		s1.put(3, "ramesh");
		
		for(Map.Entry m1:s1.entrySet())
		{
			System.out.println(m1.getKey()+" "+m1.getValue());
			
		}
		s1.putIfAbsent(4, "banglore");
		for(Map.Entry m:s1.entrySet()) {
		
			System.out.println(m.getKey()+" "+m.getValue());
			
		}
		s1.remove(2);
		System.out.println(s1);
		s1.replace(3, "pappu");
		System.out.println(s1);
		}

}
