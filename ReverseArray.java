//Question 10: Write a Java Program to reverse an array?
/*
 * In this problem, we are given an array of characters as input. This problem can be solved by writing a while loop.
 * By using a third variable, we reverse the array as below.
 * 
 * Original Array = { 1, 2, 4, 5}
 * Reveresed Array = { 5, 4, 2, 1}
 */
public class ReverseArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Initialize array 
		int[] array = {1, 2, 3, 5};
		System.out.println("Original Array: ");
		
		for (int i =0; i<array.length; i++) {
			System.out.println(array[i] + " ");
		}

		System.out.println();
		System.out.println("Array in reversed Order:" );
		
		//Loop through the array in reverse order
		for(int i= array.length-1;  i>=0; i--) {
			System.out.println(array[i] + " ");
		}
	}

}
