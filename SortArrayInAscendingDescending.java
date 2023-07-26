//Question: Sort an Array in Ascending and Descending Order
public class SortArrayInAscendingDescending {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] a = {2,6,8,3,9};
		int temp;
		
		for(int i=0; i<a.length; i++) {
			for(int j=i+1; j<a.length; j++) {
				
			if(a[i]>a[j]) {
				
				temp = a[i];
				a[i] = a[j];
				a[j] = temp;
			}
		}
		}
		for(int i=0;i<a.length;i++) {
		System.out.println(a[i]);
		}
	}

}
