package collection;


import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class arraylist4 {

	public static void main(String[] args) {
		ArrayList <String> al=new ArrayList();
		al.add("mogra");
		al.add("chafa");
		al.add("chandani");
		al.add("gulab");
		System.out.println(al);
		ArrayList <String> arr=new ArrayList();
		arr.add("poja");
		arr.add("mogra");
		arr.add("jenit");
		al.retainAll(arr);
		System.out.println(al);
		Iterator itr=al.iterator();
		while(itr.hasNext()){
			
			System.out.println(itr.next());
		}
		
		System.out.println(al);
		
		List l1=new ArrayList();
		
		//upcasting
		

	}

}
