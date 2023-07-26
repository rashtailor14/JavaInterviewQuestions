//Question : Write a Program to check if an element is part of a collection or not.
/*
 * We can use contains() function to check if an element is part of any collection apart from Map. 
 * For Map type collections, we need to containsKey() to find if a key is present in the map 
 * and containsValue() to find if the value exists in the map.
 */
import java.util.*;

public class ElementisPartOfCollection {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//Using List Type Collection
		List<String> list = new ArrayList<>();
		list.add("Rashmi");
		list.add("Rohan");
		list.add("Megha");
		
		//Verify if the list contains a specific element or not
		System.out.println(list.contains("Suraj")); //false
		System.out.println(list.contains("Rashmi")); //true
		
		///Using Map Type Collection
		HashMap<Integer,String> hash_map = new HashMap<>();
		hash_map.put(1, "Manu");
		hash_map.put(2, "Parth");
		hash_map.put(3, "Raaj");
		
		//Verify if Map contains the specific element or not
		System.out.println(hash_map.containsKey(4));  //false
		System.out.println(hash_map.containsKey(2));  //true
		System.out.println(hash_map.containsValue("Raaj"));  //true
		System.out.println(hash_map.containsValue("Babudi"));  //false
		
	}

}
