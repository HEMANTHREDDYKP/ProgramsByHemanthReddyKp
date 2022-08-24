package ProgramsForGenric;

public class countOfNumberOfEvenAndOddDigitsInANumber {

	public static void main(String[] args) {

		int a=1234567754;
		int countOfEven=0;
		int countOfOdd=0;
		while(a!=0) {
			int rem=a%10;
			if(rem%2==0) {
				countOfEven++;
			}
			else {
				countOfOdd++;
			}
			a=a/10;
		}
		System.out.println("count of odd numbers : "+countOfOdd);
		System.out.println("count of even numbers : "+countOfEven);
	}

}
