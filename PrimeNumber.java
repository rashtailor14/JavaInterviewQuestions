//Question 6: Write a Java Program to check if a number is Prime or not
/*
 * A prime number is a number which is divisible by 1 and itself. 
**This problem can be solved by a simple for loop and we check the condition that the given number returns a remainder value.
**If the remainder is 0, then the number is not prime. Else its a prime number. 
**/
public class PrimeNumber {

	public static boolean isPrime (int num) {
		
		// Validate that the number is neither less than 1 nor equal to 1.
		//logic to check if number is prime or not. If it is true, then returns true -- else, returns false
		for (int i = 2; i<num; i++) {
			if(num % i == 0) {
				return false;
			}
		}
		return true;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println(isPrime(11));
	}

}
