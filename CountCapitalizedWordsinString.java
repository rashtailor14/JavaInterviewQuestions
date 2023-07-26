//Question 11: Write a Java Program to get the count of Capitalized words in a String.
/*
 * Capitalized words in a given String which are those words which starts with a Capital Letter.
 * We need the total count of these words. 
 * This problem can be solved by using a for loop and iterate through each character in the String.
 * We also take a counter variable and increment it when any Capital character is encountered.
 */

public class CountCapitalizedWordsinString {

	public static int getCapsWordsInString(String inputString) {
		int count = 0;
		for(int i=0; i<inputString.length(); i++) {
			if(inputString.charAt(i) >= 'A' && inputString.charAt(i) <= 'Z') {
				count ++;
			}
		}
		return count;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println(getCapsWordsInString("RashmiTailor"));
	}

}
