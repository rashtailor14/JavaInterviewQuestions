//Question : Write a java code to Sort the list of Strings using Java collection
import java.util.*;
public class SortListOfStringUsingJavaCollection {

	public static void showList(String[] array) {
		for(String str: array) {
			System.out.println(str + " ");
		
		}
		System.out.println();
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String[] inputList = {"Jan", "Feb", "Mar", "Apr", "May", "Jun", "Jul", "aug", "Sep", "Oct", "nov", "Dec"};
		
		//Display Input Un-sorted List.
		System.out.println("-----Input list------");
		showList(inputList);
		
		// Call to sort the input list.
	    Arrays.sort(inputList);

	    // Display the sorted list.
	    System.out.println("\n-------Sorted List-------");
	    showList(inputList);

	    // Call to sort the input list in case-sensitive order.
	    System.out.println("\n-------Sorted list (Case-Sensitive)-------");
	    Arrays.sort(inputList, String.CASE_INSENSITIVE_ORDER);

	    // Display the sorted list.
	    showList(inputList);
	}

}
