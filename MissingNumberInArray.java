//Question 25: Write a Java Program to print the missing number in a given Array.
/*
 * we first add the elements of the given array(sum1) 
 * then add the range of elements of the array(sum2).
 * Then we subtract sum2 - sum1 
 * which would give us the missing number in the given array.
 */
public class MissingNumberInArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] array = {1, 2, 3, 4, 5, 6, 8, 9, 10};
		
		//Loop to Sum the element of array
		int sum1 = 0;
		for(int i=0; i<array.length; i++) {
			sum1 = sum1 + array[i];
		}
		
		//Loop to sum the range of element based on original array's length
		int sum2=0;
		for(int i=1; i<=10; i++) {
			sum2= sum2+i;
		}
		
		//Sum2 - sum1 = Missing element of Sum1
		System.out.println("missing Number in Array: " +(sum2-sum1));
		
	}

	
}
