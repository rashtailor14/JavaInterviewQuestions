//Question 3: Write a program to Print the Fibonacci Series.
//Input: 
public class FibonacciSeries {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int n1=0;
		int n2=1;
		int n3;
		int i;
		int count=10;
		
		System.out.println(n1+ " "+n2);
		
		//Loop will start from 2 as 0 and 1 are already printed in n1 and n2
		for(i=2; i<count; i++) {
			n3 = n1+n2;
			System.out.println(" "+n3);
			n1=n2;
			n2=n3;
		}
	}

}
