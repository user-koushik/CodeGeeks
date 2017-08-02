/**
 * 
 */
package colletionHashMapDetails;

import java.util.HashMap;
import java.util.Map;

/**
 * @author ksinha
 *
 */
public class HashMapIteration {

	Map<String , Integer> loopVar= new HashMap<String , Integer>();

	public HashMapIteration(){
		
		/**
		 * The following way we are inserting values, please don't expect that in the same order will be able to fetch. 
		 */
		loopVar.put("Alpha", 23);
		loopVar.put("Beta", 24);
		loopVar.put("Gama", 25);
		
		/**
		 * 	loopVar.put("Alpha", 23);
			loopVar.put("", 24);
			loopVar.put("", 25);
			
			: HashMap supports only one null key. If you try to pass the above it will override the null key and print the latest
			one which is 25. 
		 */
	}

	/**
	 * Traversing HashMap basically possible through this following 4 ways:
	 * 
	 * 1. ForEach
	 * 2. Iterator
	 * 3. Entry Set
	 * 4. Entry Set with Iterator
	 */


	// TODO : Using ForEach loop

	public void forEach(){
		
		for(String key : loopVar.keySet()){  
			
			System.out.println("Map Key: " + key + " == " + "Key Value: " + loopVar.get(key)); 
			
		}
		System.out.println("\n");
		System.out.println("This is how KeySet stores key: "+ loopVar.keySet());
	}
	
	// TODO : Using 
















	public static void main(String args[]){

		new HashMapIteration().forEach();
		
		
	}

}















