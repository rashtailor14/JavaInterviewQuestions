//Question 4: Write a java program to check if the number is ArmStrong number or not
//An Armstrong Number is a number in which the sum of the cubes of each digit is equal to the number itself. For ex:
// 371 = 3*3*3 + 7*7*7 + 1*1*1
//The sum of the cubes is 3,7,1 is equal to 371.Another example is 153 which is an Armstrong number. 

public class ArmstrongNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int num = 371, number, temp;
		double total = 0;
		
		number = num;
		while (number !=0) {
			temp = number % 10; //(Iteration 1): temp = 371 % 10 = 1 (Iteration 2): 37 % 10 = 7 (Iteration 3) 3 % 10 = 3
			total = total + Math.pow(temp, 3);//total + temp*temp*temp; -- (Iteration 1): total = 0+1*1*1 = 1 (Iteration 2): 1+ 7*7*7 = 344 (Iteration 3): 344 + 3*3*3 = 371 
			number = number / 10; //(Iteration 1): 371/10 = 37 (Iteration 2): 37 / 10 = 3 (Iteration 3) 3 / 10 = 0
			
		}
		
		if (total == num) {
			System.out.println(num +" is an Armstrong Number");
		}else {
			System.out.println(num +" is not an Armstrong Number");
		}
	}

}
