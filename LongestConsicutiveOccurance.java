//Question 12: Write a Java Program to find the longest consecutive occurrence of integers in a given array.
/*
 * In this problem, we need to find the length of the longest consecutive occurrence.
 * As given in the array below, we have an array of integers.
 * As you can see the longest consecutive occurrence of integers are 6,7,8,9. 
 * There is a consecutive increment of 1 . So the output will be 4.
 */
public class LongestConsicutiveOccurance {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] array = {4, 3 , 25, 6, 7, 8, 9, 2, 3, 10};
		int count = 0;
		int max = 0;
		
		for (int i=0; i<array.length-1; i++) {
			if(array[i] + 1 == array[i+1]) {
				count ++;
			} else {
				count = 0;
			}
			
			max = Math.max(max, count+1);
		}
		System.out.println(max);
	}

}
