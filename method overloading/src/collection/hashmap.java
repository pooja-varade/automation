package collection;

import java.util.HashMap;
import java.util.Map;

public class hashmap {

	public static void main(String[] args) {
	Map m1=new HashMap();
	m1.put(1, "pooja");
	m1.put(2, "puneet");
	m1.put(3, "pooja");
	System.out.println(m1);
	System.out.println(m1.size());
	m1.put(null, 12345);
	m1.put(null, "mumbai");
	System.out.println(m1);
System.out.println(m1.get(1));
System.out.println(m1.keySet());
System.out.println(m1.values());
	}

}
