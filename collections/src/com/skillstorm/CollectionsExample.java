package com.skillstorm;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Queue;
import java.util.Set;
import java.util.TreeMap;
import java.util.TreeSet;

// built in java data structures
public class CollectionsExample {

	/*
	 * TYPES OF COLLECTIONS
	 * 	Lists, Sets, Maps
	 * 		Queues, Deques
	 * 	java.util
	 * 
	 * 	only hold objects
	 * 
	 * 	ordered: order of insertion is maintained
	 * 	sorted: some algorithm maintaining the order
	 * 
	 */
	
	
	public static void main(String[] args) {
		
		/*
		 * LISTS
		 * 	ordered
		 * 	unsorted
		 * 	allow duplicates
		 * 	allow null values
		 * 
		 * 
		 * 	ArrayList
		 * 		use an array under the hood
		 * 		starting size is 10
		 * 		when it reaches capacity
		 * 			grow by 50% each time	
		 * 			creating a new array with the bigger size, and copying every value over
		 * 		accessing can be done in constant time, indexes	
		 * 
		 * 	LinkedList
		 * 		is a doubly-linked list underneath
		 * 			a series of nodes connected by pointers
		 * 			doubly linked have 2 pointers, one to the next node and one to the previous
		 * 		starting size is 0
		 * 		adding an element is done in constant time
		 * 		accessing an element takes linear time
		 * 		only allocates memory when needed
		 */
		
		System.out.println("----- LISTS -----");
		List<Integer> list = new ArrayList<>();		// following methods work on all lists
		list.add(80);						// adds a value to the end of the list
		list.add(20);
		list.add(20);
		list.add(90);
		list.add(40);
		System.out.println(list);
		System.out.println(list.get(2));	// retrieves the element at the given index
		System.out.println(list.size());	// return the number of filled spaces in the list
		
		list.remove(2);						// removes the value at the given index
		System.out.println(list);
		System.out.println(list.get(2));
		
		list.add(90);
		System.out.println(list);
		list.remove((Integer) 90);			// removes the FIRST instance of the given object
		System.out.println(list);
			
		for(int i = list.size() - 1; i >= 0; i--) {
			System.out.println(list.get(i));
		}
		
		
		/*
		 * MAPS
		 * 	(key, value) pair
		 * 	unordered
		 * 	sorted by the hashcode function
		 * 	dont allow duplicate keys, but they do allow for duplicate values
		 * 	only have one null key, can have multiple null values
		 * 
		 * 	HashMap
		 * 	LinkedHashMaps
		 * 		ordered keys
		 * 	TreeMaps
		 * 		sorted keys
		 * 
		 */
		
		
		System.out.println();
		System.out.println("----- MAPS -----");
		
		Map<Integer, String> hashMap = new HashMap<>();
		hashMap.put(1, "Sue");			// adding to a map
		hashMap.put(1, "Jill");			// will override the vlue at key 1
		hashMap.put(789, "Bob");
		hashMap.put(16, "Jill");
		hashMap.put(42, "Rick");
		hashMap.put(29, "Karen");
		
		// hashcode function will take the key, and use it to determine position in map
		// collision: two keys evaluate to the same position in the map
			// map appends the 2nd value to a linkedlist at the determined position
		System.out.println(hashMap);
		System.out.println(hashMap.get((Integer) 789));		// returns the value at the given key
		
		Map<Integer, String> linkedHashMap = new LinkedHashMap<>();
		linkedHashMap.put(1, "Sue");			// adding to a map
		linkedHashMap.put(789, "Bob");
		linkedHashMap.put(16, "Jill");
		linkedHashMap.put(42, "Rick");
		linkedHashMap.put(29, "Karen");
		System.out.println(linkedHashMap);		// maintains insertion order
		
		
		Map<Person, Integer> treeMap = new TreeMap<>();	// sorted keys, key MUST implement comparable or comparator
		treeMap.put(new Person(23, "Dan"), 12134);
		treeMap.put(new Person(56, "Bob"), 14861);
		treeMap.put(new Person(12, "Rick"), 878321);
		treeMap.put(new Person(984, "Steve"), 321);
		System.out.println(treeMap);
		
		
		/*
		 * SETS
		 * 	unordered
		 * 	unsorted
		 * 	dont allow duplicates
		 * 	allow only one null value
		 * 	use the hashcode and equals methods to maintain their uniqueness 
		 * 
		 * 	sets do not have indexes
		 * 
		 * 	HashSet
		 * 		unordered, and unsorted
		 * 	LinkedHashSet
		 * 		ordered, unsorted
		 * 	TreeSet
		 * 		unordered, sorted
		 * 
		 */

		
		System.out.println();
		System.out.println("----- SETS -----");
		Set<String> hashSet = new HashSet<>();
		hashSet.add("Dave");					// adding to a set
		hashSet.add("Richard");
		hashSet.add("Mike");
		hashSet.add("Greg");
		hashSet.add("Greg");
		System.out.println(hashSet);
		
		// no easy way to access a specific element in a set
		// essentially a copy of the set that can be iterated over
		// valid
		Iterator<String> hashSetIterator = hashSet.iterator();	
		while(hashSetIterator.hasNext()) {			// checks if there is a next item in the iterator
			String temp = hashSetIterator.next();	// returns the value of the next item in the iterator
			System.out.println(temp);
		}
		
		System.out.println("***");
		
		// valid
		for(String temp : hashSet) {
			System.out.println(temp);
		}
		
		System.out.println("***");

		// valid - same as while loop
		Iterator<String> hashSetIterator2 = hashSet.iterator();
		for(int i = 0; i < hashSet.size(); i++) {
			String temp = hashSetIterator2.next();	// returns the value of the next item in the iterator
			System.out.println(temp);
		}
		
//		//invalid
//		for(int i = 0; i < hashSet.size(); i++) {
//			hashSet.get(i);		// doesn't exist
//		}
		
		Set<String> linkedHashSet = new LinkedHashSet<>();
		linkedHashSet.add("Dave");	// adding to a set
		linkedHashSet.add("Richard");
		linkedHashSet.add("Greg");
		linkedHashSet.add("Mike");
		linkedHashSet.add("Greg");		// only keeps the first Greg
		System.out.println(linkedHashSet);			// maintains order of insertion
		
		
		// comparABLE tree set
		Set<Person> treeSet = new TreeSet<>();
		treeSet.add(new Person(23, "Dan"));
		treeSet.add(new Person(15, "Jill"));
		treeSet.add(new Person(18, "Michelle"));
		treeSet.add(new Person(46, "Rick"));
		treeSet.add(new Person(46, "Steve"));		// only keeps Rick because of duplicate age
		System.out.println(treeSet);
		
		// creating an object of a non-static nested class
		//Person.PersonNameComparator comparator = new Person(). new PersonNameComparator();
		
		
		// cmparATOR tree set
		// creating an object of a static nested class
		Person.PersonNameComparator comparator = new Person.PersonNameComparator();
		Set<Person> comparatorTreeSet = new TreeSet<>(comparator);	// giving the TreeSet the comparator
		comparatorTreeSet.add(new Person(23, "Dan"));
		comparatorTreeSet.add(new Person(15, "Jill"));
		comparatorTreeSet.add(new Person(18, "Michelle"));
		comparatorTreeSet.add(new Person(46, "Rick"));
		comparatorTreeSet.add(new Person(78, "Rick"));		// only keeps age 46 because duplicate name
		System.out.println(comparatorTreeSet);		// set is sorted by name
		
		
		
		/*
		 * QUEUES AND DEQUES
		 * 	queue: line of people
		 * 		FIFO - first in first out
		 * 		elements get added to the tail, and popped off at the head
		 * 
		 * 	deque: Deck of cards
		 * 		FILO - first in last out
		 * 		(stack)
		 * 
		 * 
		 * 	implemented using a LinkedList usually
		 */
		System.out.println();
		System.out.println("----- QUEUES -----");
		
		Queue<Integer> q = new LinkedList<>();
		q.add(1);
		q.add(2);
		q.add(3);
		q.add(4);
		q.add(5);
		
		System.out.println(q.peek());	// see what is at the head without removing it
		System.out.println(q.poll());	// pop the head off the queue and return the value
		System.out.println(q.poll());	
		
		
	}

}


// comparable is an interface that allows you to sort objects
class Person implements Comparable<Person> {
	
	
	private int age;
	private String name;
	
	public Person() {
		super();
	}
	public Person(int age, String name) {
		super();
		this.age = age;
		this.name = name;
	}
	
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	@Override
	public String toString() {
		return "Person [age=" + age + ", name=" + name + "]";
	}
	
	@Override
	public int hashCode() {
		return Objects.hash(age, name);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Person other = (Person) obj;
		return age == other.age && Objects.equals(name, other.name);
	}
	
	
	// from Comparable<>: only allows one sorting method
	@Override
	public int compareTo(Person otherPerson) {
		
		// sorts Person objects by age
		// result < 0, then otherPeson will go after
		// result > 0, otherPerson goes before
		// result = 0, no change
		return this.age - otherPerson.age;
	}
	
	// nested class - class inside another class
		// only make sense if a class is only used by one other class
		// logical way to group related classes
		// inner class is FULLY dependent on the outer class
			// inner class won't be initialized until the outer has been
	// static nested class - same as nested, difference being the outer class doesn't have to be initialized first
	static class PersonNameComparator implements Comparator<Person> {
		// comparator: allows for multiple sorting methods
		
		// sort names alphabetically
		@Override
		public int compare(Person person1, Person person2) {
			return person1.name.compareTo(person2.name);	// String class implements compareTo method
		}
		
	}
}




