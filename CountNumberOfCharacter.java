//Question 7: Write a Java Program to count the number of characters in a given String
/*
 * We can use hashmap for counting the number of each character in the given string.
 * We create hashmap object to store each character as key
 * and the total count of characters as its value.
 * Then we print the hashmap object.
 */
import java.util.*;
public class CountNumberOfCharacter {
	
	public static void characterCount(String inputString) {
		// Creating a hashmap object.
		HashMap<Character,Integer> hash_map = new HashMap<>();
		//Converting String to Array and storing it in Array object called 'strArray'
		char[] strArray = inputString.toCharArray();
		
		for(char c: strArray) {
			if(hash_map.containsKey(c)) {
				hash_map.put(c, hash_map.get(c) + 1);
			} else {
				hash_map.put(c, 1);
			}
		}
		System.out.println(hash_map);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// Input value which needs to be passed in the below method.
		characterCount("RashmiTailor");
	}

}
