//Question: Print Fibonnaci series by swapping variables
//result = 1 2 3 5 8 13 21  
public class FibonacciSeriesBySwappingVariables {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int a = 0;
		int b = 1;
		int i = 1;
		int sum=0;
		
		while (i<9) {
			
			sum = a+b; //0+1 = 1 || 1+1 = 2 || 1+2=3 || 2+3 = 5 ||
			a=b;
			b=sum;
			i++;
			System.out.println(sum);
		}

	}

}
