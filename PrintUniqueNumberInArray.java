import java.util.ArrayList;
import java.util.HashMap;

//Question: Eliminate Duplicates and print the Unique numebr in the array
/* 
 * Input: int a[] = {4,5,5,6,6,6,5,4,9,8}
 * Output: 4 = 2 times, 5 = 3 times, 6 = 3 times, 9 = 1 time, 8 = 1 time
 */
public class PrintUniqueNumberInArray {

	public static void main (String [] args) {
	int a[] = {4,5,5,6,6,6,5,4,9,8};
	ArrayList<Integer> al = new ArrayList<Integer>();
	
	for(int i=0; i<a.length; i++) {
		int count=0;
		if(!al.contains(a[i])) {
			//Push the element in arraylist
			al.add(a[i]);
			count++;//this is added in arraylist.
			
			//Logic to Compare the new added element against other element of the array
			for(int j=i+1; j<a.length; j++) {
				//If the newly added element is present in the rest of the array
				if(a[i] == a[j]) {
					//Logic to increase the count of that element
					count++;
				}
			}
			System.out.println("Number "+a[i]+ " has count " +count);
		
		}
	}


}
}
