package collectionss;

import java.util.Comparator;
import java.util.SortedSet;
import java.util.TreeSet;

public class TreeSet_test3 {

	public static void main(String[] args) {

		SortedSet<String> names=new TreeSet<>();
		names.add("HTML");
		names.add("Java");
		names.add("SQL");
		names.add("CSS");
			
		System.out.println("Sorted set: "+ names);
		System.out.println("First: "+names.first());
		System.out.println("Last: "+names.last());
		
		SortedSet<String> ssBeforeCSS=names.headSet("CSS");
		System.out.println(ssBeforeCSS);
		
		SortedSet<String> ssBetwenCSSandHTML=names.subSet("CSS", "HTML");
		System.out.println(ssBetwenCSSandHTML);
		
		SortedSet<String> ssBetwenCSSAndHTML2 = names.subSet("CSS", "HTML");
		System.out.println(ssBetwenCSSAndHTML2);

		SortedSet<String> ssCSSAndAfter = names.tailSet("CSS");
	    System.out.println(ssCSSAndAfter);

	    
	    
/////////////////////////////////////////////////////////////////////////////////////////////////
	    // Sort the names based on their length, placing null first
	    System.out.println("\n ***Sort the names based on their length, placing null first");
	    
	    SortedSet<String> names2 = new TreeSet<>(Comparator.nullsFirst(Comparator.comparing(String::length)));
	    names2.add("XML");
	    names2.add("CSS");
	    names2.add("HTML");
	    names2.add(null); // Adds a null

	    // Print the names
	    names2.forEach(System.out::println);

	    
	    
	}

}
