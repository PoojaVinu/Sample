package collection;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class SetSample {

	public static void main(String[] args) {
		Set<String>s1=new HashSet<String>();
		s1.add("apple");
		s1.add("grapes");
		s1.add("mango");
		s1.add(null);
		s1.add("apple");
		System.out.println("Set values" + s1);
		
		HashSet<String>s2=new HashSet<String>();
		s2.add("pooja");
		s2.add("anu");
		System.out.println("generic" +s2);
		
		HashSet s3=new HashSet();
		s3.add("hello");
		s3.add(10);
		System.out.println("non generic"+s3);
		
		s1.remove("mango");
		System.out.println("remove" + s1);
		System.out.println(s1.size());
		System.out.println(s1.contains("grapes"));
		
		Iterator<String>itr=s1.iterator();
		while(itr.hasNext())
		{
			System.out.println(itr.next());
		}
		
		s1.addAll(s2);
		System.out.println("Addall" + s1);
		
		s1.remove(s2);
		System.out.println("remove" + s2);
		
		s1.removeAll(s2);
		System.out.println("remove all" + s1);
		
		
		
	}

}
