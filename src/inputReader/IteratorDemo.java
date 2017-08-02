package inputReader;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class IteratorDemo {

	public static void main(String[] args) {
		
		//Create an ArrayList
		ArrayList al = new ArrayList();
		
		//Add elements to arraylist
		al.add("A");
		al.add("D");
		al.add("R");
		al.add("Y");
		al.add("A");
		al.add("L");
		al.add("Q");
		
		System.out.println("Arraylist Contains:" + al);
		System.out.println("\n");
		
		// Using Iterator 
		Iterator itr = al.iterator();
		
		while(itr.hasNext()){
			Object abc = itr.next();
			System.out.println("Iterating Elements :" + abc);
		}
		System.out.println();
		
		// Modifying Objects being iterated
		ListIterator listItr = al.listIterator();
		
		while(listItr.hasNext()){
			Object obj = listItr.next();
			listItr.set(obj + "+"); // No idea how this is gonna work to moodify arraylist
			
			System.out.println("Modifying Objects:" + obj + "+");
		}
		System.out.println();
		
		// Displaying list through backwards
		
		while(listItr.hasPrevious()){
			Object objBack = listItr.previous();
			System.out.println("Backwards Elements :" + objBack);
		}
		
		System.out.println("\n\n");
		
		// Removing even numbers from Arraylist
		List<Integer> numbers = new ArrayList<Integer>();
		
		numbers.add(11);
		numbers.add(23);
		numbers.add(34);
		numbers.add(56);
		numbers.add(87);
		numbers.add(76);
		
		System.out.println("Interger Arraylist:" + numbers);
		
		for(Iterator<Integer> iterator = numbers.iterator(); iterator.hasNext();){
			Integer number = iterator.next();
			
			if(number % 2 == 0){
				System.out.println("This is even numner :" + number);
				iterator.remove();
			}
		}
		Collections.sort(numbers);
		System.out.println("Sorted List : " + numbers); 
	}

}
