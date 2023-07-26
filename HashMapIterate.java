//Question 23: Write a Java Program to iterate through the HashMap.
/*
 * We can either use the keySet() or entrySet() 
 * then using the iterator we can iterate through the given HashMap.
 */
import java.util.*;
public class HashMapIterate {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		HashMap<String,String> hash_map = new HashMap<>();
		
		hash_map.put("India", "New Delhi");
		hash_map.put("France", "Paris");
		hash_map.put("Canada", "Toronto");
		hash_map.put("USA", "Boston");
		
		// Iterator : Iterate by using keySet()
		Iterator<String> it=hash_map.keySet().iterator();
		
		while(it.hasNext()) {
			String key = it.next();
			String value = hash_map.get(key);
			System.out.println("key:"+key+"==>"+"value:"+value);
		}

	}

}
