package datastructure;

import java.util.List;
import java.util.Map;
import java.util.HashMap;
import java.util.LinkedList;

public class UseMap {

	public static void main(String[] args) {
		/*
		 * Demonstrate how to use Map that includes storing and retrieving elements.
		 * Add List<String> into a Map. Like, Map<String, List<string>> list = new HashMap<String, List<String>>();
		 * Use For Each loop and while loop with Iterator to retrieve data.
		 *
		 * Use any databases[MongoDB, Oracle, MySql] to store data and retrieve data.
		 */
		Map<String, List<String>> list = new HashMap<String, List<String>>();
		String studentName1 ="Melanee";
		String studentName2 ="Zeno";
		String studentName3 ="Ariana";
		String studentName4 ="Ron";
		String studentName5 ="Nancy";

		List<String> student1Info = new LinkedList<String>();
		student1Info.add("456 null street");
		student1Info.add("abc@hotmail.com");

		List<String> student2Info = new LinkedList<String>();
		student2Info.add("834 Hills street");
		student2Info.add("abc@hotmail.com");

		List<String> student3Info = new LinkedList<String>();
		student3Info.add("290 Main street");
		student3Info.add("abc@gmail.com");

		List<String> student4Info = new LinkedList<String>();
		student4Info.add("109 Parsons street");
		student4Info.add("abc@hotmail.com");

		List<String> student5Info = new LinkedList<String>();
		student5Info.add("112 Mac'D street");
		student5Info.add("abc@hotmail.com");

		list.put(studentName1, student1Info);
		list.put(studentName2, student2Info);
		list.put(studentName3, student3Info);
		list.put(studentName4, student4Info);
		list.put(studentName5, student5Info);

		System.out.println("Using for each loop to retrieve data : ");
		for (Map.Entry m : list.entrySet()){
			System.out.println("Key = "+m.getKey()+ " , "+"Value = "+m.getValue());
		}
	}
}
