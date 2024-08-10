package collection;

import java.util.ArrayList;
import java.util.Iterator;

public class Search {

	public static void main(String[] args) {
		ArrayList<Character>list=new ArrayList<Character>();
		list.add('a');
		list.add('v');
		list.add('i');
		list.add('f');
		list.add('u');
		Iterator<Character>itr=list.iterator();
		while(itr.hasNext())
		{
			System.out.println(itr.next());
		}
		System.out.println("Search for an element : " + list.contains('f'));

	}

}
