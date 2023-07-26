//Question 5: Write a Java Program to print the sum of digits of a given integer

public class SumOfDigits {

	public static int getSumofAllDigits(int num) {
		// Declare variable sum which will store the sum of all digits.
		int sum = 0;
		
		// Run a while loop until the num becomes 0.
		while (num != 0) {
			int reminder = num % 10; //Iter 1: reminder = 549 % 10 = 9 || iter 2: reminder = 54 % 10 = 4 || Iter 3:reminder = 5 %10 = 5
			sum = sum + reminder; //Iter 1:sum= 0 + 9 = 9 || Iter 2: sum = 9+4 = 13 || Iter 3: sum = 13+5 = 18
			num = num / 10; //Iter 1: num = 549 /10 = 54 || Iter 2: num = 54 / 10 = 5 || Iter 3: 5/10 = 0
		}
		return sum;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Calling getSumofAllDigits method
		System.out.println(getSumofAllDigits(549));
	}

}
