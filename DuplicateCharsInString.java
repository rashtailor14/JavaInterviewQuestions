//Question 8: Write a Java Program to find the duplicates of a given String.
/*
 * HashMap is used to store elements in the form of key value pairs. 
 * We create a hashmap object and store each character as key and the total count of each character as value.
 * Then we check the keys whose values are more than 1 using the keySet() method.
 * Thus we get the duplicates in the given String.
 */
import java.util.*;
public class DuplicateCharsInString {
	
	public static void duplicateChars(String inputString) {
		
		//Creating HashMap Object
		HashMap<Character,Integer> hash_map = new HashMap<>();
		//Now we will Convert the string into character Array and store it in Array object
		char[] strArray = inputString.toCharArray();
		
		for (char c: strArray) {
			if (hash_map.containsKey(c)) {
				hash_map.put(c, hash_map.get(c)+1);
			} else {
				hash_map.put(c, 1);
			}
		}
		// Store the key values in a set and then get the number of each duplicate character.
		Set<Character> keys = hash_map.keySet();
		for(char c: keys) {
			if(hash_map.get(c)>1) {
				System.out.println(c + "-->" + hash_map.get(c));
			}
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// Input value which needs to be passed in the below method.
		duplicateChars("RashmiTailor");
	}

}
