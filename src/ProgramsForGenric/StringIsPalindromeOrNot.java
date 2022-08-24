package ProgramsForGenric;

public class StringIsPalindromeOrNot {

	public static void main(String[] args) {

		String name="lol";
		String rev="";
		for(int i=name.length()-1;i>=0;i--) {
			rev=rev+name.charAt(i);
		}
		if(name.equals(rev)) {
			System.out.println("the given string is palindrome");
		}
		else {
			System.out.println("the given string is not a palindrome");
		}
	}

}
