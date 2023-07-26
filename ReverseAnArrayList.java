//Question: Write a program to reverse an ArrayList.
/*
 * We can reverse the ArrayList using reverse() method of Collections class.
 */
import java.util.*;
public class ReverseAnArrayList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Creating an ArrayList object
		ArrayList<String> arraylist = new ArrayList<String>();
		
		//Adding element to the ArrayList Object
		arraylist.add("Nokia");
		arraylist.add("Samsung");
		arraylist.add("iPhone");
		arraylist.add("One+");
		
		//Displaying Arraylist before Reverse
		System.out.println("Before Reverse ArrayList: ");
		System.out.println(arraylist);
		
		//Reversing the List using Collection.reverse() method//
		Collections.reverse(arraylist);
		
		//Displaying List after Reverse
		System.out.println("After Reverse ArrayList: ");
		System.out.println(arraylist);
	}

}
