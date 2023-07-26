import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

//Question 24: Write a Java Program to convert HashMap to ArrayList.
/*
 * we can convert the HashMap keys into an ArrayList
 * then the HashMap values into an ArrayList.
 */
public class ConvertHashMapToArrayList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		HashMap<String,String> hash_map= new HashMap<>();
		
		hash_map.put("India", "New Delhi");
		hash_map.put("France", "Paris");
		hash_map.put("Canada", "Toronto");
		hash_map.put("USA", "Boston");
		
		//Convert hashmap keys to ArrayList
		List<String> CountryNameList = new ArrayList<String>
		(hash_map.keySet());
		System.out.println("Hashmap keys are: ");
		
		for(String s: CountryNameList) {
			System.out.println(s);
		}
		System.out.println("************************");
		// convert hashmap values to ArrayList
		List<String> CityNameList = new ArrayList<String>
		(hash_map.values());
		System.out.println("Hashmap values are: ");
		for(String s: CityNameList) {
			System.out.println(s);
		}
	}
}
