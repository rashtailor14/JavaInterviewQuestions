import java.util.Arrays;

//Question 22: Write a Java Program to remove the duplicates from an array.
/*
 * we need to find the total count of unique elements. 
 * We iterate through the array and check if the adjacent elements are not duplicate.
 * Input  : a[] = {1, 1, 2, 2, 2}
 * Output : a[] = {1,2}
 */
public class RemoveDuplicateFromArray {
	
	public static int RemoveDuplicate(int[] array) {
		Arrays.sort(array);
		if (array.length == 0) 
			return 0;
		int j = 0;
		
		for (int i=1; i<array.length; i++) {
			if (array[i] != array[j]) {
				j++;
				array[j] = array[i];
			}
		}
		return j+1;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] array = {3, 2, 1, 1, 2, 2, 3, 2, 1, 3};
		System.out.print(RemoveDuplicate(array));

	}

}
