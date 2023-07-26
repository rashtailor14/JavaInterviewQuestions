//Question : Reverse the String without using Predefined Reverse methods or palindrome Verification
/*
 * input : "madam"
 * output: "madam"  -> Reverse string and original string is same = Palindrome
 */
public class ReverseStringPalindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String s = "madam";
		String t = "";
		for(int i=s.length()-1; i>=0; i--) {
			t = t + s.charAt(i);
		}
		System.out.println(t);
		
		if(s==t) {
			System.out.println("String is Palindrome");
		} else {
			System.out.println("String is not Palindrome");
		}
	}

}
