//Question 15: Write a Java Program to reverse a number using Stack.
/*
 * In the above program, we will be using Stack to reverse a number.
 * The idea is to get the digits using the % operator  and push each digit in the Stack. 
 * Once all digits are pushed in the stack, we pop each digit using the pop method.
 * Stack is LIFO datastructure thus the output number will be a number in a reverse order.
 * Use this Video: https://www.geeksforgeeks.org/reverse-number-using-stack/
 */
import java.util.*;
public class ReverseNumberUsingStack {

	// Stack to maintain order of digits
	static Stack<Integer> st = new Stack<>();
	
	// Function to push digits into stack
	public static void push_digits(int number) {
		while (number != 0 ) {
			st.push(number % 10);
			number = number / 10;
		}
	}
	
	//Function to Reverse the number
	public static int Reverse_number(int number) {
		// Function call to push number's
        // digits to stack
		push_digits(number);
		int reverse = 0;
		int i = 1;
		
		// Popping the digits and forming
        // the reversed number
		while(!st.isEmpty())
		{
			reverse = reverse + (st.peek() * i);
			st.pop();
			i = i * 10;
		}
		
		//Return reverse number form
		return reverse;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int number = 39997;
        System.out.println(Reverse_number(number));

	}

}
