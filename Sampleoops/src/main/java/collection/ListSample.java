package collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class ListSample {

	public static void main(String[] args) {
	 System.out.println("List");
	 List <String>list1=new ArrayList<String>();
	 list1.add("apple");
	 list1.add("orange");
	 list1.add("grapes");
	 list1.add("orange");
	 list1.add(null);
	 list1.add(null);
	 System.out.println(list1);
	 System.out.println();
	 
	 System.out.println("Non generic collection");
	 ArrayList list2=new ArrayList();
	 list2.add(10);
	 list2.add(3.3f);
	 list2.add("hello");
	 System.out.println(list2);
	 System.out.println();
	 
	 System.out.println("Generic collection");
	 ArrayList<String> list3=new ArrayList<String>();
	 list3.add("pooja");
	 list3.add("anu");
	 list3.add("isha");
	 list3.add("vinu");
	 System.out.println(list3);
	 System.out.println();
	 
	 ArrayList<String> list4=new ArrayList<String>();
	 list4.add("java");
	 list4.add("python");
	 list4.add("isha");
	 System.out.println(list4);
	 list3.addAll(list4);
	 System.out.println("addall" + list3);
	 
	 Collections.sort(list3);
	 System.out.println("Collections" +list3);
	 
	 System.out.println(list3.contains("contains" + "pooja"));
	 
	 list3.removeAll(list4);
	 System.out.println(list4);
	 
	 list3.remove(1);
	 list4.remove("python");
	 System.out.println(list3);
	 System.out.println(list4);
	 System.out.println();
	 
	 System.out.println("check whether the list is empty: " + list1.isEmpty());
	 System.out.println();
	 
	 System.out.println("Size of the list is: " + list1.size());
	 System.out.println();
	 
	 System.out.println("get element: " + list1.get(2));
	 System.out.println();
	 
	 list1.set(2, "mango");
	 System.out.println("Set another element the list :" +list1);
	 System.out.println();
	 
	 System.out.println("for loop");
	 for(int i=0;i<list1.size();i++)
	 {
		 System.out.println(list1.get(i));
	 }
	 System.out.println();
	 
	 System.out.println("for each loop");
	 for(String i:list1)
	 {
		 System.out.println(i);
	 }
	 System.out.println();
	 
	 System.out.println("iterator");
	 Iterator <String> itr=list1.iterator();
	 while(itr.hasNext())
	 {
		System.out.println(itr.next()); 
	 }
	 System.out.println();
	 
	 System.out.println("iTerator remove");//last element removed
	 itr.remove();
	 System.out.println(list1);
	
	}

}
