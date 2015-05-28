package collectionss;

import java.util.PriorityQueue;
import java.util.Queue;

class Persons implements Comparable<Persons>{

	private int id;
	private String name;
	
	Persons(int id, String name){
		this.id=id;
		this.name=name;
		}
	
	public int getId() {
		return id;
		}
	
	public String getName() {
		return name;		
		}
	
	
	@Override
	public int compareTo(Persons o) {
		o.getId();
		if(this.getId()<o.getId()) return -1;
		if(this.getId()>o.getId()) return 1;
		if(this.getId()==o.getId()) {
			return this.getName().compareTo(o.getName());
			}
		return 0;
		}
	
	public String toString(){
		return "(" + id + ", " + name + ")";
	}

}




public class PriorityQueue_test {

	public static void main(String[] args) {

		Queue<Persons> pp=new PriorityQueue<>();
		pp.add(new Persons(1, "Vova"));
		pp.add(new Persons(3,"Anjel"));
		pp.add(new Persons(3, "Victor"));
		pp.add(new Persons(3, "Vyachelav"));
		pp.add(new Persons(2, "Olecsandr"));
		
		System.out.println(pp);
		
		while(pp.peek()!=null){
			System.out.println("\nHead element: "+pp.poll());
			System.out.println(pp);
		}
		
		
		

	}

}
