package collectionss;

import java.util.HashSet;
import java.util.Set;

public class HashSet_test {

	public static void main(String[] args) {

		Set<String> s1 = new HashSet<>();
		s1.add("HTML");
		s1.add("CSS");
		s1.add("XML");
		s1.add("XML"); 				// Duplicate
		
		Set<String> s2=new HashSet<>(s1);  		/// Create another set by copying s1
		s2.add("Java"); 
	    s2.add("SQL");
	    s2.add(null); 				// one null is fine
	    s2.add(null); 				// Duplicate
		
		System.out.println("s1: "+s1);
		System.out.println("s1 size: "+s1.size());
		
		System.out.println("s2: "+s2);
		System.out.println("s2 size: "+s2.size());

		/////// union of sets
		s1.add("MMS");
		s2.add("EDGE");
		
		System.out.println("\ns1= "+s1);
		System.out.println("s2= "+ s2);
		
		performTestForSubset(s1, s2);
		perfomUnion(s1, s2);
		perfomIntersection(s1, s2);
		
//		s1.addAll(s2);				// Union  of  s1  and  s2  will be  stored in s1 
		s1.retainAll(s2); 			// Intersection of  s1  and  s2 (common for s1 and s2) will be  stored in s1 
//		s1.removeAll(s2); 			// Difference of  s1  and  s2  will be  stored in s1 
		
		performTestForSubset(s1, s2);
		
		System.out.println("\n");
		System.out.println("s1= "+s1);
		System.out.println("s2= "+ s2);
		
		

	}
	
	public static void perfomUnion(Set<String> s3, Set<String> s4){
		System.out.println("\nOperation of Union");
		System.out.println("s1= "+s3);
		System.out.println("s2= "+ s4);
		s3.addAll(s4);
		System.out.println("result = "+s3+" length= "+ s3.size());
		}
	
	
	public static void perfomIntersection(Set<String> s3, Set<String> s4) {
		System.out.println("\n s1 intersection (common with) s2 = ");
		System.out.println("s1= "+s3);
		System.out.println("s2= "+ s4);
		s3.retainAll(s4);
		System.out.println("result= "+ s3+" length= "+ s3.size());
		}
	
	public static void performTestForSubset(Set<String> s3, Set<String> s4) {
		System.out.println("\n s1 is a subset of s2 - "+ s3.containsAll(s4));
		System.out.println(" s2 is a subset of s1 - "+ s4.containsAll(s3));
	}

}
