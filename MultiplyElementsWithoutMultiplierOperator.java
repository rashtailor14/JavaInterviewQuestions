//Question: Print 5 Multiplication table without using multiply operator
/*
 * (5,10) = should print 50
 * 
 */
public class MultiplyElementsWithoutMultiplierOperator {

	public static int multiply(int i,int j) {
		
		//Intialize the result as 0
		int result = 0;
		//a has to sum b times to get the result
		//Third variable k is assigned as 1. when k<=j
		int k = 1;
		while(k<=j) {
			
			result = result + i;  //Itr 1: 0+5=5, Itr2: 5+5=10, Itr 3: 10+5=15
			k++;
		}
		return result;
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int result = multiply (5,10);
		System.out.println(result);

	}

}
