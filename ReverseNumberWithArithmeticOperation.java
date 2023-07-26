//Question: Reverse the number with Arithmetic Operation
/*
 * number = 153
 * logic -> remidner = 0
 * Digit = Number%10 = 3
 * revesrse = revserse + digit = 0+3 = 3
 * num = number / 10 = 153/10 = 15
 */
public class ReverseNumberWithArithmeticOperation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int Number = 153;
		int reverse = 0;
		
		
		while (Number != 0) {
			
			int reminder = Number % 10;  //153%10 = 3  || 15%10 = 5 || 1%10 = 1
			reverse = reminder + reverse *10; // 3+0 = 3 || 5+ (3*10)=5+30=35  || 1+ (35*10)=1+350 = 351
			Number = Number/10; //153/10 = 15 || 15/10 = 1 
			
		}
	}

}
