package collection;

import java.util.ArrayList;
import java.util.Iterator;

public class ListInteger {

	public static void main(String[] args) {
		ArrayList<Integer>list1=new ArrayList<Integer>();
		list1.add(10);
		list1.add(14);
		list1.add(100);
		list1.add(90);
		System.out.println(list1);
		System.out.println();
		
		System.out.println(list1.remove(1));
		System.out.println(list1);
		System.out.println();
		
		System.out.println("Check whether the list is empty : " + list1.isEmpty());
		System.out.println();
		
		System.out.println("for each loop for Integer");
		for(Integer i:list1)
		{
			System.out.println(i);
		}
		System.out.println();
		
		ArrayList<Character>list2=new ArrayList<Character>();
		list2.add('a');
		list2.add('e');
		list2.add('i');
		list2.add('o');
		System.out.println(list2);
		System.out.println();
		
		System.out.println("size of the list: "+ list2.size());
		System.out.println();
		
		System.out.println("get an element : " + list2.get(3));
		System.out.println();
		
		System.out.println("for loop for character");
		for(int i=0;i<list2.size();i++)
		{
			System.out.println(list2.get(i));
		}
		System.out.println();
		
		System.out.println("foreach loop for character");
		for(Character i:list2)
		{
			System.out.println(i);
		}
		System.out.println();
		
		System.out.println("Iterator for character");
		Iterator<Character>it=list2.iterator();
		while(it.hasNext())
		{
			System.out.println(it.next());
		}
		System.out.println();
		
		ArrayList<Float>list3=new ArrayList<Float>();
		list3.add(1.3f);
		list3.add(6.66f);
		list3.add(9.88f);
		System.out.println(list3);
		System.out.println();
		
		list3.set(1, 7.77f);
		System.out.println(list3);
		System.out.println();
		
		System.out.println("for loop for float");
		for(int i=0;i<list3.size();i++)
		{
			System.out.println(list3.get(i));
		}
		System.out.println();
		
		System.out.println("foreach loop for float");
		for(Float i:list3)
		{
			System.out.println(i);
		}
		System.out.println();
		
		System.out.println("Iterator for float");
		Iterator<Float>itr=list3.iterator();
		while(itr.hasNext())
		{
			System.out.println(itr.next());
		}
		System.out.println();
		
		System.out.println("iterator Remove ");
		itr.remove();
		System.out.println(list3);
		System.out.println();
		
		
	}

}
