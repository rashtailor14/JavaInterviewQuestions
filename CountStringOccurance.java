import java.util.HashMap;
import java.util.Set;

//Question: Count the number of occurance in the string
/*
 * input : word = "Rashmi Tailor"
 * output: Character = "R=1" "a=2" "s=1" etc...
 */
public class CountStringOccurance {

	
public static int countOccurance(String word, char Character) {
	
	int count = 0;
	for(int i=0; i<word.length();i++) {
		if(word.charAt(i)== Character) {
			count++;
		}
	}
	return count;
}
	

public static void main(String[] args) {
	// TODO Auto-generated method stub
	int count = countOccurance("aaanjamna",'a');
	System.out.println(count);
}
}