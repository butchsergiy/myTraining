package collectionss;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

public class ArrayList_ListIterator {

	public static void main(String[] args) {
		
		List<String> list=new ArrayList<>();
		list.add("Java");
		list.add("SQL");
		list.add("CSS");
		list.add("XML");
		System.out.println(list);
		
		ListIterator<String> listIt=list.listIterator();
		
		while(listIt.hasNext()){
			System.out.println(listIt.nextIndex()+" : "+listIt.next());
			}
		
					System.out.println();
		listIt.remove();
		
		while(listIt.hasPrevious()){
			System.out.println(listIt.previousIndex()+" : "+listIt.previous());
			}
		

	}

}
