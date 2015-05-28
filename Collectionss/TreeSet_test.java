package collectionss;

import java.util.SortedSet;
import java.util.TreeSet;

public class TreeSet_test {

	public static void main(String[] args) {

		SortedSet<String> sorted=new TreeSet<>();
		sorted.add("Java");
		sorted.add("SQL");
		sorted.add("HTML");
		sorted.add("CSS");
		sorted.add("Aaaa");
		sorted.add("aaaaa");
		
		System.out.println(sorted);
		

	}

}
