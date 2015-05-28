package collectionss;

import java.util.ArrayList;
import java.util.Collection;
import java.util.LinkedList;
import java.util.List;

public class ArrayList_LinkedList {

	public static void main(String[] args) {
	
		List<Integer> arrayList =new ArrayList<Integer>();
		List<Integer> linkedList =new LinkedList<Integer>();
		
		doTiming("\n Timing for ArrayList ", arrayList);
		doTiming("\n Timing for LinkedList ", linkedList);
		

		
/////////////////////////////////////////////////////////////////////////////////////////
		System.out.println("\n *** ArrayList ***\n");
		
		Collection<String> names = new ArrayList<>();
		System.out.printf("Size = %d, Elements = %s%n", names.size(), names);
		names.add("XML");
		names.add("HTML");
		names.add("CSS");
		System.out.printf("Size   = %d, Elements   = %s%n", names.size(), names);
		names.remove("CSS");
		System.out.printf("Size   = %d, Elements   = %s%n", names.size(), names);
		names.clear();
		System.out.printf("Size   = %d, Elements   = %s%n", names.size(), names);
		
		
		

		
	}

	
	
	
	private static void  doTiming(String st, List<Integer> list) {
		System.out.println(st);
		
		double starttime=System.currentTimeMillis();
		for (int i=0; i<1E5; i++) list.add(i);
		double endtime=System.currentTimeMillis();
		System.out.println("time for add "+list.size()+" items = " + (endtime-starttime)+" ms");
		
		for (int i=0; i<1E5; i++) list.add(0, i);
		double endtime2=System.currentTimeMillis();
				
		System.out.println("time2 for add more 1E5 items = " + (endtime2-endtime)+" ms");
		System.out.println("size of list is = "+ list.size());
		
		}

	
	
}
