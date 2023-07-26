//Question: Find Maximum difference between any adjacent array
/*
 * int[] a={1,4,5,8,15,17};
 * Here Difference between adjacent index -> 4-1 =3, 5-4 = 1, 8-5=3, 15-8=7, 17-15=2
 * The difference is 3,1,3,7,2 -> {8,15} has the highest difference
 */
public class MaxDiffereceBetweenAdjacentIndexInArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] a = {1,4,5,8,15,17}; //3,1,3,7,2
		
		int difference=0;
		//a.length-1 --> because when we are at last index we have nothing to compare with
		for(int i=0; i<a.length-1; i++) {
			if (a[i+1] - a[i] > difference) {
				difference = a[i+1] - a[i];
			}
		}
		System.out.println(difference);

	}

}
