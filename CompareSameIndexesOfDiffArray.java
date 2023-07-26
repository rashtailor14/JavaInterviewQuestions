import java.util.ArrayList;

//Question: Compare same indexes of 2 different array and create another array
//for matching values.
/*
 * int[] a = {1,2,5,7,8,4}
 * int[] b = {6,2,8,1,3,4}
 * Result = {2,4}
 */
public class CompareSameIndexesOfDiffArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] a = {1,2,5,7,8,4};
		int[] b = {6,2,8,1,3,4};
		//Now we will create arrayList which will store Common elements
		ArrayList<Integer> al = new ArrayList<>();
		
		for(int i=0; i<a.length; i++) {
				if(a[i] == b[i]) {
					//code to create another array
					al.add(a[i]);
				}
			}
		Object[] c = al.toArray();
		for (Object obj : c) {
			System.out.println(obj);

		}

	}

}
