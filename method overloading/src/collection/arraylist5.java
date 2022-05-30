package collection;

import java.util.ArrayList;
import java.util.List;

class book{
	
	int id;
	String name,author,publisher;
	book(int id,String name,String author,String publisher){
		
		this.id=id;
		this.name=name;
		this.author=author;
		this.publisher=publisher;
		
	}
}

public class arraylist5 {

	public static void main(String[] args) {
		List<book> l1=new ArrayList<book>();

	book b1=new book(1,"pooja","puneet","jjk");
	book b2=new book(1,"yashwant","puneet","jjk");
	book b3=new book(1,"sunil","puneet","jjk");
	book b4=new book(1,"pooja","puneet","jjk");
	
	l1.add(b1);
	l1.add(b2);
	l1.add(b3);
	l1.add(b4);
	System.out.println(l1.get(1).id);
	
	for(book b:l1) {
		System.out.println(b.id+b.name+b.author+b.publisher);
	}
	
	}

}
