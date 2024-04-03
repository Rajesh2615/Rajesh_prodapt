package assignment;

import java.util.ArrayList;
import java.util.Collections;

public class SwapDemo {


	public static void main(String[] args) {
		ArrayList<String> mylist = new ArrayList<String>();
		mylist.add("Java");
		mylist.add("is");
		mylist.add("easy");
		mylist.add("language");

		System.out.println("Original List : \n" + mylist);

		Collections.swap(mylist, 1, 2);

		System.out.println("\nAfter swap(mylist, 1, 2) : \n" + mylist);
	}
}
