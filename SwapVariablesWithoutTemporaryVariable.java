//Question: Swap the variable with and without using temp variable.

public class SwapVariablesWithoutTemporaryVariable {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int a=4;
		int b=5;
		int temp;
		
		System.out.println("Before Swapping the Variables: "+a+ " and " +b);
		
		temp = a;
		a = b;
		b = temp;
		
		System.out.println("After Swapping the Variables using Temp Variable: " +a+ " and " +b);
		
		a = a+b;
		b = a-b;
		a = a-b;
		
		System.out.println("After Swapping the Variables without using Temp: " +a+ " and " +b);
	}

}
