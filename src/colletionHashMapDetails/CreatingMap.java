package colletionHashMapDetails;

import java.util.HashMap;

public class CreatingMap {

	public static void main(String[] args) {
		
		// 1. Creating a HashMap with default initial capacity and load factor
		
		HashMap<String, Integer> map1 = new HashMap<String , Integer>();	// Right side if we don't provide <String , Integer> then what will happen? Nothing then 
																			// why are providing ?			
		// 2. Creating a hashMap with default capacity 30
		
		HashMap<String , Integer> map2 = new HashMap<String , Integer>(30);
		
		// 3. Creating a HashMap with default capacity 30 and default load factor 0.5f
		
		HashMap<String, Integer> map3 = new HashMap<String , Integer>(30 , 0.5f);
		
		// 4. Creating HashMap by coping another HashMap
		
		HashMap<String, Integer> map4 = new HashMap<String , Integer>(map1);
	
	}

}
