//Question 21: Write a Java Program to shift all zeros on the right.
/*
 * Approach 1: By Using Sorting  --> We will use this
 * Approach 2: By Manual Iteration and Replacement
 * 
 * Input :  arr[] = {1, 2, 0, 4, 3, 0, 5, 0};
 * Output : arr[] = {1, 2, 4, 3, 5, 0, 0, 0};
 */
import java.util.*;
public class ShiftAllZerosToRight {
	
	public static void ShiftZero(int array[], int n) {
		//Sorting the Array elements
		Arrays.sort(array); //This will print {0, 0, 0, 7, 29, 50, 67, 99, 128}
		System.out.println("Elements of array after moving all the zeros to the end of array: ");
		
		//Print Array using the for loop
		for(int i=n-1; i>=0; i--) {
			System.out.print(array[i]+ " ");
		}
	}
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//Declare and initialize the array elements
		int array[] = {128, 0, 99, 67, 50, 0, 29, 7, 0};
		
		//Getting length of the array
		int n = array.length;
		
		//Calling user defined funtion
		ShiftZero(array,n);
	}

}
