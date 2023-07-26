import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

//Question: Write a program to convert ArrayList to LinkedList and vice versa.
/*
 * Using ArrayList & LinkedList constructor which takes a collection as an argument
 * e can convert ArrayList to LinkedList & vice versa.
 */
public class ConvertArrayListToLinkedList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedList<String> linkedlist = new LinkedList<String>();
		linkedlist.add("Mango");
		linkedlist.add("Oran");
		linkedlist.add("Banan");
		linkedlist.add("apple");
		
		//Converting LinkedList to ArrayList
		//Using ArrayList constructor which takes a collection as an argument
		ArrayList<String> arraylist = new ArrayList<String>(linkedlist);
		System.out.println(arraylist);

		//Converting ArrayList to LinkedList
		//Using Linkedlist Constructor which takes collection as an argument
		List<String> list1 = new LinkedList<String>(arraylist);
		System.out.println(list1);
	}

}
