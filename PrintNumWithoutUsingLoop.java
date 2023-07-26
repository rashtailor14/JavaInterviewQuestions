//Question 20:Write a Java Program to print numbers 1 to 100 without using any loop(for/while/do-while).
/*
 * In this problem, to print the numbers between 1 to 100 
 * we will use the if statement and check the condition.
 * We will check the condition i.e. num value should be less than equal to 100 and 
 * then increment it till it reaches to 100 and thus printing each number.
 */
public class PrintNumWithoutUsingLoop {
	
	public static void printnum(int num) {
		if(num<=100) {
			System.out.println(num);
			num++;
			printnum(num);
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		printnum(1);
	}

}
