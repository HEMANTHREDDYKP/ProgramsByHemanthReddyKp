package ProgramsForGenric;

public class PalindromeNumberOrNot {

	public static void main(String[] args) {
		int n=121;
		int a=n;
		int rev=0;
		while(a!=0) {
			int rem=a%10;
			rev=rev*10+rem;
			a=a/10;
		}
		if(rev==n) {
			System.out.println("the given number is Palindrome");
		}
		else {
			System.out.println("not a palindrome");
		}
	}

}
