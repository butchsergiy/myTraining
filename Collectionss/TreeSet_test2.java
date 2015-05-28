package collectionss;

import java.util.Comparator;
import java.util.SortedSet;
import java.util.TreeSet;

public class TreeSet_test2 {

	public static void main(String[] args) {

		
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
		
////////////////////////////////////////////////////////////////////////////////////////////////		
		System.out.println("\n***Sort by Id and names***");

		
		SortedSet<Person> personsById = new TreeSet<>(Comparator.comparing(Person::getId));
		personsById.add(new Person(11, "F"));
		personsById.add(new Person(2, "Z"));
		personsById.add(new Person(3, "A"));
		personsById.add(new Person(4, "C"));

		System.out.println("Person by ID:");
		personsById.forEach(System.out::println);

		SortedSet<Person> personsByName = new TreeSet<>(Comparator.comparing(Person::getName));
		personsByName.add(new Person(1, "X"));
		personsByName.add(new Person(2, "Z"));
		personsByName.add(new Person(3, "A"));
		personsByName.add(new Person(4, "C"));

		System.out.println("Persons by  Name: ");
		personsByName.forEach(System.out::println);

		
		

	}

}
	
	class Person {
		private int id;
		private String name;

		public Person(int id, String name) {
			this.id = id;
			this.name = name;
		}

		public int getId() {
			return id;
		}

		public void setId(int id) {
			this.id = id;
		}

		public String getName() {
			return name;
		}

		public void setName(String name) {
			this.name = name;
		}

		@Override
		public boolean equals(Object o) {
			if (!(o instanceof Person)) {
				return false;
			}

			// id must be the same for two Persons to be equal
			Person p = (Person) o;
			if (this.id == p.getId()) {
				return true;
			}

			return false;
		}

		@Override
		public int hashCode() {
			return this.id;
		}

		@Override
		public String toString() {
			return "(" + id + ", " + name + ")";
		}
		  
}
	


