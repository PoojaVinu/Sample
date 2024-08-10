package collection;

import java.util.ArrayList;

public class Retrieve {

	public static void main(String[] args) {
		ArrayList list=new ArrayList();
		list.add("java");
		list.add(20);
		list.add('a');
		list.add(3.33f);
		System.out.println("Elements in the list " + list);
		System.out.println("Retrieve the element at index 2: " + list.get(2));
		

	}

}
