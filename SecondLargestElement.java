import java.util.Arrays;

//Question 16: Write a Java Program to print the second largest number in a given array.
/*
 *  In this problem, to find the second largest number in the array
 *  first we sort the array using Arrays.sort()
 *  then using the for loop we find the second largest number in reverse order.
 */
public class SecondLargestElement {

	public static int getSecondLargest(int[] a, int arraylength) {
		Arrays.sort(a);
		return a[arraylength-2];
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int a[] = {1,5,2,3,6};
		int b[] = {44,66,55,22,33,77};
		
		System.out.println("Second Largest Number from Array A is "+getSecondLargest(a,5));
		System.out.println("Second Largest number From Array B is "+getSecondLargest(b,6));
		
	}

}
