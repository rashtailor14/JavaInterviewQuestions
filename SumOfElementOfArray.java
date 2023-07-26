//Question: Create a method Which accepts Array and returns sum of all elements in the array
/*
 * Initalize an array with variable
 * In the main method Call the initialized method sumArray(a)
 * Create a method which accepts an array
 * Add a for loop to iterate through the length of array
 */
public class SumOfElementOfArray {

	public static int sumArray(int[] a) {
	
		int sum=0;
		//1st extract every value of array and then sum each value with other
		for (int i=0; i<a.length; i++) {
			sum=sum+a[i];
			
		}
		return sum;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] a = {1, 3, 4, 5, 6};
		
		int sum = sumArray(a);
		System.out.println(sum);

	}

}
