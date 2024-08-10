package collection;

import java.util.ArrayList;
import java.util.Iterator;

public class Iterate {

	public static void main(String[] args) {
		ArrayList iteratelist=new ArrayList();
		iteratelist.add("Java");
		iteratelist.add('a');
		iteratelist.add(100);
		iteratelist.add(4.44f);
		iteratelist.add(5.600);
		System.out.println("The elements to be iterated are :" + iteratelist);
		Iterator itr=iteratelist.iterator();
		System.out.println("Iterated List");
		while(itr.hasNext())
		{
			System.out.println(itr.next());
		}

	}

}
