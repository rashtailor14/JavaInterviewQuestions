//Question 9: Write a Java Program for swapping of 2 numbers.
/*
 * In this problem , we would be given two numbers as input.
 * We need to swap those 2 numbers which can be done a simple logic.
 */
public class SwapNumbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int num1 = 10;
		int num2 = 20;
		
		//Logic to Swap 2 numbers
		num1 = num1 + num2; //a=a+b
		num2 = num1 - num2; // b = a-b
		num1 = num1 - num2; //a = a-b
		
		System.out.println("Num 1 is " + num1);
		System.out.println("Num 2 is " + num2);

	}

}
