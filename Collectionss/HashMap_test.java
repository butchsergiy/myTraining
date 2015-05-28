package collectionss;

import java.util.HashMap;

public class HashMap_test {

	public static void main(String[] args) {

	
		HashMap<Integer, String> myMap = new HashMap<Integer, String>();
		myMap.put(2, "two");
		myMap.put(3, "three");
		myMap.put(4, "four");
		myMap.put(5, "five");
		myMap.put(6, "six");

		System.out.println("\n *** HashMap ***\n" + myMap.get(2));
		System.out.println(myMap);
		
	}

}
