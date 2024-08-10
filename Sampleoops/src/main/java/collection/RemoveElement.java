package collection;

import java.util.ArrayList;

public class RemoveElement {

	public static void main(String[] args) {
		ArrayList<String>list=new ArrayList<String>();
		list.add("John");
		list.add("Harry");
		list.add("Dollar");
		list.add("Christy");
		list.add("Paul");
		list.add("George");
		System.out.println("The listof elements : " + list);
		System.out.println("Removing the third element :" + list.remove(3));
		System.out.println("Updated List " + list);

	}

}
