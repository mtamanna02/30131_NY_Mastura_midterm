package datastructure;

import java.util.ArrayList;
import java.util.Iterator;

public class UseArrayList {

	public static void main(String[] args) {
		/*
		 * Demonstrate how to use ArrayList that includes add,peek,remove,retrieve elements.
		 * Use For Each loop and while loop with Iterator to retrieve data.
		 * Store all the sorted data into one of the databases.
		 * 
		 */
	ArrayList<String>employeeName = new ArrayList<>();
	employeeName.add("Tim");
	employeeName.add("Lin");//removed
	employeeName.add("Tom");
	employeeName.add("Mim");
	employeeName.add("Don");//removed
	employeeName.add("Zenny");
	employeeName.add("Tommy");
	employeeName.add("Roma");

	employeeName.remove("Don");
	employeeName.remove(1);
		System.out.println(employeeName.get(5));
		System.out.println("");
		System.out.println("using for each loop to retrive data: ");
		for (String e:employeeName) {
			System.out.println(e);
		}
		System.out.println(" ");
		System.out.println("Usingwhile loop with iterator to retrieve data: ");
		Iterator iterator = employeeName.iterator();
		while (iterator.hasNext()) {
			System.out.println(iterator.next());
		}

	}

}
