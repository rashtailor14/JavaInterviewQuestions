//Question 2: Write a Program to Swap two given Strings
//Input -> String a = 'Rashmi', String b = 'Tailor'
//Output -> String a ='Tailor', String b = 'Rashmi'
import java.util.*;
public class StringSwap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// Take two string s1 and s2 which we need to swap.
		String s1 = "Rashmi";
		String s2 = "Tailor";
		
		// Combine both the strings s1 and s2 using the concatenation(+) operator
		s1 = s1+s2;   //RashmiTailor
		
		// Use the substring method to get the subset of the combined string
		s2 = s1.substring(0,s1.length() - s2.length());
		s1 = s1.substring(s2.length());
		
		System.out.println ("s1 = "+s1);
		System.out.println ("s2 = " +s2);
	}

}
