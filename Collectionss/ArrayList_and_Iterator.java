package collectionss;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ArrayList_and_Iterator {

	public static void main(String[] args) {
	
		List<String> names = new ArrayList<>();
		names.add("Aa");
		names.add("Be");
		names.add("Ce");
		names.add("De");
		System.out.println("----\n"+names+"\n----");	
	
//// Using a for-each Loop
			System.out.println("\n---- Using Using a for-each Loop");
		
		for(String a:names) System.out.println(a);

		
		
////////////////////////////////////////////////////////////////////////
			System.out.println("\n---- Using the forEach() Method");
		names.forEach(System.out::println);
				
		
		
/////////////////////////////////////////////////////////////////////////
			System.out.println("\n---- Using of method .forEachRemaining(do)");
		
		Iterator<String> namesIterator0=names.iterator();  	// Get an iterator for the list
		namesIterator0.forEachRemaining(System.out::println);	// .forEachRemaining(do)
		

		
////////////////////////////////////////////////////////////////////////		
			System.out.println("\n---- Using of while, next(), .remove()");
		
		namesIterator0=names.iterator();  	// Get a new iterator for the list
		
		while(namesIterator0.hasNext()){						// Iterate over all elements in the list
			String name=namesIterator0.next();
			System.out.println(name);
			
			namesIterator0.remove();						// The remove() method removes the element that was returned last time by the next() method. 
			}
		System.out.println("----\n"+names);						// empty ArrayList becouse everything is removed
	}

}
