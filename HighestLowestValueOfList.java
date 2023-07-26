import java.util.Collections;
import java.util.LinkedList;

//Question: How to get the highest and lowest values of a List?
/*
 * There are 2 ways we can achieve that. 
 * First, sorting the collection and getting the first & last elements of the collection.
 * Second, using max() & min() methods of Collections class, 
 */
public class HighestLowestValueOfList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		LinkedList<Integer> list = new LinkedList<Integer>();
		list.add(44);
		list.add(11);
		list.add(22);
		list.add(33);
		
		//Sort the Collection and Get the first and last element
		Collections.sort(list);
		System.out.println(list.get(0));  //This will print oth element
		System.out.println(list.get(list.size()-1));   //This will print last element from the list (list size -1)
		
		//Use max() and min() methods of Collections class
		System.out.println(Collections.max(list));
		System.out.println(Collections.min(list));
		
	}

}
