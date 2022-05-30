package collection;

import java.util.Iterator;
import java.util.PriorityQueue;
import java.util.Queue;

public class queue1 {

	public static void main(String[] args) {
		Queue q1=new PriorityQueue();
		System.out.println(q1.size());
		System.out.println(q1);
		q1.add("123");
		q1.add("230");
	q1.add("450");
		q1.add("10");
		
		System.out.println(q1);
		//System.out.println(q1.element());
		System.out.println(q1.peek());
		for(Object o:q1) {
			
			System.out.println(o);
		}
		System.out.println("*************************8888888");
		Iterator itr=q1.iterator();
		while(itr.hasNext()) {
			
			System.out.println(itr.next());
		
		}
		
		
		System.out.println(q1.remove());
		System.out.println(q1);
		System.out.println(q1.poll());
		System.out.println(q1);
		q1.forEach(obj->{
		System.out.println(obj);
				
		});
	}

}
